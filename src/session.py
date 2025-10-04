import os
from pyspark.sql import SparkSession

def build_spark(app_name="SparkStarter", shuffle_partitions=8):
    builder = (SparkSession.builder
               .appName(app_name)
               .master(os.getenv("SPARK_MASTER", "local[*]"))
               .config("spark.sql.shuffle.partitions", str(shuffle_partitions))
               .config("spark.driver.memory", os.getenv("SPARK_DRIVER_MEMORY", "4g")))
    spark = builder.getOrCreate()
    spark.sparkContext.setLogLevel(os.getenv("SPARK_LOGLEVEL", "WARN"))
    return spark
