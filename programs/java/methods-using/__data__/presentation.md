---
marp: true
theme: gaia
class:
  - lead
  - invert
paginate: true
footer: 'Лекция 4: Свойства и методы (использование)'
---

# Свойства и методы (использование)
## Профессия Java-разработчик на Hexlet
### Преподаватель: Яковлев Егор
<!-- _color: white -->
<!-- _color: white -->

---
# План

1. Свойства
2. Методы

---

# Свойства (поля)
* данные могут обладать свойствами: имя, рамер, длина, цвет ...
* значение свойства можно получать и измененять

```java
    long userId = user.id;
    System.out.println(userId);

    user.name = "Ivanov Ivan";
```
**Демо**

---

# Методы
* метод у данных вызывается как свойство - через точку
* есть методы, которые оперируют с теми данными, с которыми связаны (not static)
* есть методы, применимые ко всем переменным класса (static)

---

# Методы

```java
boolean isAdult = user.isAdult();

if (isAdult) {
    //some logic here if user is adult...
}

String formattedUsername = User.formatUsername(user.username);
System.out.println(formattedUsername);

```

---

# Домашнее задание
 
```bash
hexlet program download java methods-using

hexlet program submit java methods-using
```

---

# Вопросы?
