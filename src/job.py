import argparse, os, yaml
from .session import build_spark
from .etl import read_table, basic_clean
from .features import add_features, group_report

def main(cfg_path: str):
    with open(cfg_path, "r", encoding="utf-8") as f:
        cfg = yaml.safe_load(f)

    spark = build_spark(cfg.get("app_name", "SparkStarter"),
                        cfg.get("shuffle_partitions", 8))

    df = read_table(spark,
                    path=cfg["input"]["path"],
                    fmt=cfg["input"].get("fmt", "csv"),
                    header=cfg["input"].get("header", True),
                    infer_schema=cfg["input"].get("infer_schema", True))

    df = basic_clean(df)
    df_f = add_features(df)
    df_g = group_report(df_f, tuple(cfg["report"].get("group_by", [])))

    out_dir = cfg["output"]["dir"]; fmt = cfg["output"].get("fmt", "parquet")
    (df_f.repartition(1).write.mode("overwrite").format(fmt).save(os.path.join(out_dir, "features")))
    (df_g.repartition(1).write.mode("overwrite").format(fmt).save(os.path.join(out_dir, "report")))

    spark.stop()

if __name__ == "__main__":
    ap = argparse.ArgumentParser()
    ap.add_argument("--config", default="configs/config.yaml")
    args = ap.parse_args()
    main(args.config)
