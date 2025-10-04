from pyspark.sql import DataFrame
from pyspark.sql import functions as F

def read_table(spark, path: str, fmt: str="csv", header=True, infer_schema=True) -> DataFrame:
    if fmt == "csv":
        return (spark.read.option("header", header)
                           .option("inferSchema", infer_schema)
                           .csv(path))
    elif fmt == "parquet":
        return spark.read.parquet(path)
    else:
        raise ValueError(f"Unsupported format: {fmt}")

def basic_clean(df: DataFrame) -> DataFrame:
    # пример: trim строковых и dropDuplicates
    str_cols = [f.name for f in df.schema.fields if "StringType" in str(f.dataType)]
    out = df
    for c in str_cols:
        out = out.withColumn(c, F.trim(F.col(c)))
    return out.dropDuplicates()
