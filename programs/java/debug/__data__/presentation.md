---
marp: true
theme: gaia
class:
  - lead
  - invert
paginate: true
footer: 'Лекция 6: Отладка'
---

# Отладка
## Профессия Java-разработчик на Hexlet
### Преподаватель: Яковлев Егор
<!-- _color: white -->
<!-- _color: white -->

---
# План

1. Стектрейс
2. Отладчик
3. Ошибки

---

# Стектрейс. Стек

![Стек](./src/Lifo_stack.png "Стек")

---

# Стектрейс

* Создаётся стек - StackTrace
* Вызывается метод - вызов помещается в StackTrace

---

# Отладчик

Демо

[Как эффективно отлаживать код?]("https://www.youtube.com/watch?v=9iwYRcw3A8A")

[Урок по теме "Ошибки" на Hexlet]("https://ru.hexlet.io/courses/programming-basics/lessons/debug/theory_unit")

---

# Ошибки

4 типа ошибок:

* syntax error
* reference error
* type error
* logic error

---

# Ошибки

* Как реагировать на ошибки? - приложения != воздушный шарик
* Передавать информацию об ошибке на более высокий уровень - **КАК**?
* **exceptions**

---

# Exception

* разделить места обноружения ошибки и реакции на неё
* не нужно проверять каждый вызов функции
* "прокидывание" ошибок на уровень выше
* поддерживаются на уровне языка 

---

# Домашнее задание

```bash
hexlet program download java debug
hexlet program submit java debug
```

#### После выполнения задания попробуйте использовать отладчик

---
# Вопросы?