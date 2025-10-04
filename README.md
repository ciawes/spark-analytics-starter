# Spark Analytics Starter — Telco Churn (PySpark)

[![Python](https://img.shields.io/badge/python-3.9%2B-blue.svg)](https://www.python.org/)
[![PySpark](https://img.shields.io/badge/pyspark-3.5.x-orange.svg)](https://spark.apache.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

Мини-шаблон воспроизводимого пайплайна на **PySpark**: чтение данных → очистка → инженерия признаков → агрегаты → выгрузка артефактов.  
В качестве примера используется публичный датасет **Telco Customer Churn** (CSV).

---

## Зачем это нужно
- Чёткая структура проекта (`src/`, `configs/`, `notebooks/`, `artifacts/`).
- Управление параметрами через YAML-конфиг.
- Запуск одной командой: воспроизводимый ETL/фичи/отчёты.
- Ноутбук — только для демонстрации (без бизнес-логики внутри).

---

## Структура проекта
```
.
├─ src/
│  ├─ session.py         # инициализация SparkSession
│  ├─ etl.py             # чтение/базовая очистка
│  ├─ features.py        # фичи и агрегаты (Telco-специфика)
│  └─ job.py             # entrypoint (config -> run)
├─ configs/
│  └─ config.yaml        # пути/параметры пайплайна
├─ data/
│  └─ WA_Fn-UseC_-Telco-Customer-Churn.csv
├─ artifacts/            # выходы пайплайна (в .gitignore)
├─ notebooks/
│  └─ 01_demo.ipynb      # демонстрационный ноутбук
├─ requirements.txt
├─ .gitignore
└─ LICENSE
```

---

## Установка

**Требования:** Python **3.9+**; Java (Temurin **11/17**).  
Windows (по желанию): `winutils.exe` и `hadoop.dll` — не нужны в `local[*]`, но поддерживаются.

```bash
python -m pip install --upgrade pip
pip install -r requirements.txt

Если Spark не стартует, проверьте JAVA_HOME и PATH.

## Быстрый запуск

```bash
python -m src.job --config configs/config.yaml


## Результат:
artifacts/features/ — фичи после инженерии (Parquet).
artifacts/report/ — агрегированный отчёт (Parquet).

## Что делает пайплайн (Telco-пример)

Очистка

trim строковых столбцов, удаление дублей.

Безопасное приведение TotalCharges к числу (в исходнике есть пустые строки).

Фичи

MonthlyCharges_log1p, TotalCharges_log1p.

TenureBucket: 0–12, 13–24, 25–48, 49+.

MCharges_per_Tenure: отношение MonthlyCharges/tenure (устойчиво к нулям).

Бинарные флаги услуг: HasFiber, HasStreamingTV, HasOnlineSecurity, HasTechSupport и др.

Отчёт (группировки)

По умолчанию: Contract × InternetService × Churn.

Метрики: n, mean/std/p50 по чарджам.

## Конфиг

Редактируйте пути и группировки в configs/config.yaml:
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

## Ноутбук

notebooks/01_demo.ipynb — быстрый интерактивный обзор: df.show(), базовые проверки и (при желании) пара графиков.
Вся логика пайплайна находится в src/, ноут — только для демонстрации.

## Тонкости и отладка

Java/Spark: убедитесь, что установлены Java 11/17 и корректно прописан JAVA_HOME.

Windows: winutils опционален для локального режима; если используете — положите в D:\hadoop\bin и добавьте в PATH.

Производительность: можно менять spark.sql.shuffle.partitions через конфиг.

## План расширения

Добавить Spark ML (фича-пайплайн + логистическая регрессия по Churn).

CI (GitHub Actions): pytest и линтеры.

Докер-образ для оффлайн-запуска.

## Лицензия

MIT — см. LICENSE
.
Датасет: IBM Telco Customer Churn (educational sample).