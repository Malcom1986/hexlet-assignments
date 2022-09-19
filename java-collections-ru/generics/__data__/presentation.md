---
marp: true
theme: gaia
class:
  - lead
  - invert
paginate: true
footer: 'Лекция 3: Дженерики'
---

# Generics

## Профессия Java-разработчик на Hexlet

### Преподаватель: Яковлев Егор
<!-- _color: white -->
<!-- _color: white -->

---

# Вопросы к лекции

* Как бороться с Runtime Error при кастовании?
* Как с помощью generic  создавать "безопасный код"?
* Помогают ли generics избавиться от лишнего кода?

---
# План

1. Проблематика
2. Решение проблемы небезопасного кастования в языках программирования
3. Создание generic-класса
4. О коллекциях и методах
5. Generic методы

---

# Проблематика

**Демо**

---

# Решение проблемы небезопасного кастования в языках программирования

* Python: отсутствие статической типизации
* Go / Java < 1.5: boilerplate
* Java > 1.5: Generic

---

# Создание generic-класса

```java
public class GEntry<T> {
    private int value1;
    private T value2;

    public GEntry(int value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}
```

Класс (тип) `Т` определяется только в момент создания объекта

---

# Немного о коллекциях и методах

**Демо**

---

# Generic методы

```java
public static <T> int getIndex(List<T> list, T element) {
    // some code here
}
```

Подставляем тип в момент вызова метода

**Демо**
