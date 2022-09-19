---
marp: true
theme: gaia
class:
  - lead
  - invert
paginate: true
footer: 'Лекция 9: SQL'
---

# SQL
## Профессия Java-разработчик на Hexlet
### Преподаватель: Яковлев Егор
<!-- _color: white -->
<!-- _color: white -->

---

# Вопросы к лекции:

* Что такое SQL?
* Что такое РБД?
* Какие есть основные запросы?

---

# План

1. SQL
2. Создание таблицы
3. Вставка строки в таблицу
4. Обновление записи в таблице
5. SELECT
6. WHERE

---

# SQL

SQL (Structured Query Language) — язык управления базами данных для реляционных баз данных.

Реляционная база данных - база данных, построенная на основе реляционной модели. В реляционной базе каждый объект задается записью (строкой) в таблице.

Реляционная модель - совокупность данных, состоящая из набора двумерных таблиц.

---

# Создание и удаление БД

```sql
--- создание
CREATE DATABASE hexlet_example; 
--- удаление
DROP DATABASE hexlet_example;
```

---

# Создание таблицы

```sql
CREATE TABLE hexlet_table_example (
   id INT NOT NULL AUTO_INCREMENT,
   user VARCHAR(100) NOT NULL,
   pass VARCHAR(40) NOT NULL,
   date DATE,
   PRIMARY KEY ( id )
   );
```


---

# Вставка строки в таблицу

```sql
INSERT INTO hexlet_table_example (user, pass, data)
  VALUES ('root', '12345', '2019-11-24');
```

---

# Обновление записи в таблице

```sql
UPDATE hexlet_table_example
  SET user = 'test', pass = 'root'
  WHERE id = 1 ;
```

---

# SELECT

```sql
SELECT * FROM hexlet_table_example;

```
---

# WHERE

```sql
SELECT * FROM hexlet_table_example
  WHERE user = 'test';
```

---

# Домашнее задание

```bash
hexlet program download java sql
hexlet program submit java
```

---

# Вопросы?