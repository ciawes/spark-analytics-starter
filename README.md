# Spark Analytics Starter — Telco Churn (PySpark)

[![Python](https://img.shields.io/badge/python-3.9%2B-blue.svg)](https://www.python.org/)
[![PySpark](https://img.shields.io/badge/pyspark-3.5.x-orange.svg)](https://spark.apache.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

Reproducible **PySpark** starter: data reading → cleaning → feature engineering → group aggregations → artifact export.  
Example dataset: **Telco Customer Churn** (CSV).

---

## Why this repo
- Clear structure (`src/`, `configs/`, `notebooks/`, `artifacts/`)
- Config‑driven (YAML)
- One‑command run: reproducible ETL / features / reports
- Notebook is demo‑only (no business logic inside)

---

## Project structure
```
.
├─ src/
│  ├─ session.py         # SparkSession init
│  ├─ etl.py             # read / basic cleaning
│  ├─ features.py        # Telco-specific features & aggregates
│  └─ job.py             # entrypoint (config -> run)
├─ configs/
│  └─ config.yaml        # pipeline parameters
├─ data/
│  └─ WA_Fn-UseC_-Telco-Customer-Churn.csv
├─ artifacts/            # outputs (gitignored)
├─ notebooks/
│  └─ 01_demo.ipynb      # demonstration notebook
├─ requirements.txt
├─ .gitignore
└─ LICENSE
```

---

## Setup

**Requirements:** Python **3.9+**; Java (Temurin **11/17**).  
Windows: `winutils.exe` / `hadoop.dll` are optional in `local[*]` mode.

```bash
python -m pip install --upgrade pip
pip install -r requirements.txt
```

> If Spark does not start, verify `JAVA_HOME` and `PATH`.

---

## Quick start

```bash
python -m src.job --config configs/config.yaml
```

**Outputs**
- `artifacts/features/` — engineered features (Parquet)  
- `artifacts/report/`   — grouped aggregates (Parquet)

---

## What the pipeline does (Telco example)

### Cleaning
- Trim string columns, drop duplicates  
- Safe cast for `TotalCharges` (handles empty strings)

### Features
- `MonthlyCharges_log1p`, `TotalCharges_log1p`  
- `TenureBucket`: `0–12`, `13–24`, `25–48`, `49+`  
- `MCharges_per_Tenure` = `MonthlyCharges / tenure` (zero‑safe)  
- Service flags: `HasFiber`, `HasStreamingTV`, `HasOnlineSecurity`, `HasTechSupport`, etc.

### Grouped report
- Default slice: `Contract × InternetService × Churn`  
- Metrics: `n`, `mean / std / p50` for charges

---

## Configuration

Adjust paths and groupings in `configs/config.yaml`:

```yaml
app_name: "SparkTelcoChurn"
shuffle_partitions: 8

input:
  path: "data/WA_Fn-UseC_-Telco-Customer-Churn.csv"
  fmt: "csv"
  header: true
  infer_schema: true

report:
  group_by: ["Contract", "InternetService", "Churn"]

output:
  dir: "artifacts"
  fmt: "parquet"
```

---

## Notebook

`notebooks/01_demo.ipynb` is a lightweight, interactive walkthrough (`df.show()`, basic checks).  
All pipeline logic lives under `src/`.

---

## Troubleshooting

- **Java/Spark**: ensure Java 11/17 is installed and `JAVA_HOME` is set.  
- **Windows**: `winutils` is optional for local mode; if used, place under `D:\hadoop\bin` and add to `PATH`.  
- **Performance**: tune `spark.sql.shuffle.partitions` via config.

---

## Roadmap (optional)
- Spark ML step (feature pipeline + logistic regression on `Churn`)  
- CI (GitHub Actions): smoke `pytest` + linters  
- Docker image for offline runs

---

## License

MIT — see [`LICENSE`](LICENSE).  
Dataset: IBM **Telco Customer Churn** (educational sample).
