from pyspark.sql import DataFrame
from pyspark.sql import functions as F, types as T

def _to_double_safe(col):
    # устойчиво приводим к double (учитывая пустые строки в TotalCharges)
    return F.when(F.length(F.trim(col)) == 0, None).otherwise(col.cast("double"))

def add_features(df: DataFrame) -> DataFrame:
    """
    Telco Churn feature engineering:
    - clean numeric: TotalCharges (строки -> double)
    - log1p transforms for charges
    - tenure buckets
    - ratio feature (MonthlyCharges / tenure)
    - binary service flags
    """

    out = df

    # Приведение типов
    if "TotalCharges" in out.columns:
        out = out.withColumn("TotalCharges_double", _to_double_safe(F.col("TotalCharges")))
    if "MonthlyCharges" in out.columns:
        out = out.withColumn("MonthlyCharges_double", F.col("MonthlyCharges").cast("double"))
    if "tenure" in out.columns:
        out = out.withColumn("tenure_int", F.col("tenure").cast("int"))

    # Лог-трансформации
    if "MonthlyCharges_double" in out.columns:
        out = out.withColumn("MonthlyCharges_log1p", F.log1p(F.col("MonthlyCharges_double")))
    if "TotalCharges_double" in out.columns:
        out = out.withColumn("TotalCharges_log1p", F.log1p(F.col("TotalCharges_double")))

    # Квантование стажа (tenure)
    if "tenure_int" in out.columns:
        out = out.withColumn(
            "TenureBucket",
            F.when(F.col("tenure_int") <= 12, F.lit("0-12"))
             .when(F.col("tenure_int") <= 24, F.lit("13-24"))
             .when(F.col("tenure_int") <= 48, F.lit("25-48"))
             .otherwise(F.lit("49+"))
        )

    # Отношение чарджей к стажу (устойчиво к 0)
    if "MonthlyCharges_double" in out.columns and "tenure_int" in out.columns:
        out = out.withColumn(
            "MCharges_per_Tenure",
            F.when(F.col("tenure_int") > 0,
                   F.col("MonthlyCharges_double") / F.col("tenure_int")
            ).otherwise(F.lit(None).cast("double"))
        )

    # Флаги услуг (если столбцы есть)
    def add_flag(col_name: str, flag_name: str, positive_values):
        nonlocal out
        if col_name in out.columns:
            out = out.withColumn(
                flag_name,
                F.when(F.col(col_name).isin(positive_values), F.lit(1)).otherwise(F.lit(0)).cast("int")
            )

    add_flag("InternetService", "HasFiber", ["Fiber optic"])
    add_flag("StreamingTV", "HasStreamingTV", ["Yes"])
    add_flag("StreamingMovies", "HasStreamingMovies", ["Yes"])
    add_flag("OnlineSecurity", "HasOnlineSecurity", ["Yes"])
    add_flag("OnlineBackup", "HasOnlineBackup", ["Yes"])
    add_flag("TechSupport", "HasTechSupport", ["Yes"])
    add_flag("DeviceProtection", "HasDeviceProtection", ["Yes"])
    add_flag("PhoneService", "HasPhoneService", ["Yes"])
    add_flag("MultipleLines", "HasMultipleLines", ["Yes"])

    return out

def group_report(df: DataFrame, group_cols=("Contract", "InternetService", "Churn")) -> DataFrame:
    """
    Агрегированный отчёт по ключевым срезам.
    """
    missing = [c for c in group_cols if c not in df.columns]
    if missing:
        # если каких-то колонок нет — возвращаем исходный df без группировки
        return df

    numeric_cols = []
    for c in ["MonthlyCharges_double", "TotalCharges_double"]:
        if c in df.columns:
            numeric_cols.append(c)

    agg_exprs = [F.count("*").alias("n")]
    for c in numeric_cols:
        agg_exprs.extend([
            F.mean(F.col(c)).alias(f"{c}_mean"),
            F.stddev(F.col(c)).alias(f"{c}_std"),
            F.expr(f"percentile_approx({c}, 0.5)").alias(f"{c}_p50"),
        ])

    return df.groupBy(*group_cols).agg(*agg_exprs)

