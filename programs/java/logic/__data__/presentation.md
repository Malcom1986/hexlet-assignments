---
marp: true
theme: gaia
class:
  - lead
  - invert
paginate: true
footer: 'Лекция 3: Основы'
---

# Логика
## Профессия Java-разработчик на Hexlet
### Преподаватель: Яковлев Егор
<!-- _color: white -->
<!-- _color: white -->

---
# План

1. Логический тип
2. Предикаты
3. Булева логика
4. Логические операции
5. Условные конструкции (if, else, :?, switch)

---

# Логический тип. Операции сравнения
* \<
* \>
* \<=
* \>=
* ==
* !=

Результат - значение типа *boolean*: true/false
**Демо**

---
# Предикаты

Приедикат отвечает "да" или "нет": значение типа *boolean*

Нейминг предикатов в Java:
* isSmth
* hasSmth

**Демо**

---
# Булева логика

Операторы
* конъюкция (пересечение)
* дизъюнкция (объединение)
* отрицание (НЕ)
* значения: 1 или 0 (true или false)

---

# Логические операции

* &&
* ||
* !

**Демо**

---

# Условные конструкции
* условный оператор if
```java
if (a > 0) {
    System.out.println("a больше нуля");
}
```

---

# Условные конструкции
* расширенный оператор if с использованием else
```java
if (a > 0) {
    System.out.println("a больше нуля");
}
else {
    System.out.println("a меньше или равно нуля");
}
```

**Демо**

---

# Условные конструкции
* расширенный оператор if с использованием else
```java
if (a > 0) {
    System.out.println("a больше нуля");
} else {
    System.out.println("a меньше или равно нуля");
}
```

**Демо**

---

# Условные конструкции
* тернарный оператор - сокращенный аналог конструкции else-if
### Вариант 1
```java
int result = 0;
int a = 5;
if (a < 4) {
    result = a;
} else {
    result = a + 1;
}
```
---

# Условные конструкции. Тернарный оператор.
### Вариант 2
```java
int result = a < 4 ? a : a + 1;
```
**Демо**

---

# Условные конструкции. Switch-case.
```java
int mark = 4;
switch (mark) {
    case 1: {
        System.out.println("Вы получили кол!");
        break;
    }
    ...
    default: {
        System.out.println("Таких оценок не бывает!");
        break;
    }
}
```
---

# Условные конструкции. Switch-case.

* *switch-case* - основывается на **конкретных** значениях
* *break* - прерывает выполнения программы в блоке switch-case

Тип выражения для оператора *switch* :
* byte, short, char, int
* String
* ещё некоторые классы, которые мы с вами обсудим позже...

**Демо**

---

# Домашнее задание

```bash
hexlet program download java logic

hexlet program submit java
```

---

# Вопросы?
