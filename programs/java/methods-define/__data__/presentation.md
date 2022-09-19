---
marp: true
theme: gaia
class:
  - lead
  - invert
paginate: true
footer: 'Лекция 5: Функции и методы (определение)'
---

# Функции и методы (определение)
## Профессия Java-разработчик на Hexlet
### Преподаватель: Яковлев Егор
<!-- _color: white -->
<!-- _color: white -->

---
# План

1. Вызов функции/метода
2. Сигнатура функции/метода
3. Аргументы как выражения
4. Побочные эффекты
5. Неизменяемость аргументов

---

# Вызов функции/метода

* +, /, ... - самые частые операции имеют свой символ (оператор)
* расширить набор операций позволяют **функции**
```java
  int result = Math.min(1, 5); // 1
```

(1, 5) - аргументы или параметры функции (метода)
1 - возвращаемое значение

---

# Сигнатура функции/метода

```java
Math.sin(0);

Math.min();

"abc".length();

System.out.println("Hello, world!");
```


---
```java
boolean isPositive(int input) {
  return input > 0; 
}

static boolean isPositiveStatic(int input) {
  return input > 0; 
}
```

---

* return - возврат значения и **завершение выполнения кода метода**
* void - метод не возвращает никакое значение - не возможно присвоить результат выполнения метода какой-либо переменной

---

# Аргументы как выражения

```java
int sinResult = Math.sin(0 + 0.3333);

int minResult = Math.min(1 + 2, 19999/22134);

int maxResult = Math.max(1 - 9, Math.min(-1, -3));

```
---
# Побочные эффекты

```java
System.out.println("Java forever!"); // в консоли: Java forever! - но void
```
вывести выражение в консоль и вернуть значение - две приницпиально **разные** операции!

побочный эффект - любые действия функции, которые помимо вычисления результата меняют что-то в программе (кроме переменных), называть побочными эффектами

---

# Неизменяемость аргументов

```java
double num = 6.9;

long numRounded = Math.round(num);
System.out.println(numRounded); // 7

System.out.println(num); //???
```

Аргументы в Java **неизменяемы**.

---   

# Домашнее задание

```bash
hexlet program download java methods-define

hexlet program submit java
```

---
# Вопросы?
