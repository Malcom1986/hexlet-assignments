---
marp: true
theme: gaia
class:
  - lead
  - invert
paginate: true
footer: 'Лекция 2: Интерфейсы'
---

# Интерфейсы
## Профессия Java-разработчик на Hexlet
### Преподаватель: Яковлев Егор
<!-- _color: white -->
<!-- _color: white -->

---

# Вопросы к лекции:

* Интерфейс? А причём тут Java?
* Как создавать реализацию интерфейса в Java?
* Какие есть способы хранения констант в Java?


---

# План

1. Обыденное понимаение интерфейса
2. Интерфейс в Java
3. Реализация интерфейса в Java
4. Методы интерфейса
5. Переменные и константы
6. Демо

---

# Обыденное понимание интерфейса

> Интерфейс — «общая граница» между отдельными системами, через которую они взаимодействуют.
Википедия

* Интерфейс сайта / компьютерной программы
* "пульт"
* **Итог**: некая оболчка, с которой взаимодействует человек или система, но не знает, что скрывается за ней...

---

#  Interface в Java

* ключевое слово *interface* (нельзя создать объект интерфейса)

```java
public interface RemoteControlService {
    public void turnUpVolume();
    public void turnDownVolume();
    public void nextTVProgram();
    public void previousTVProgram();
    public void setTVProgram (int number);
}
```

Таким образом мы создали "оболочку" для пользователей пульта.

---

# Interface в Java: реализация

* ключевое слово *implements*

```java
public class RemoteControlServiceImpl implements RemoteControlService {
    @Override
    public void turnUpVolume() {
        System.out.println("Громкость увеличена");
    }
    ...
}
```

Класс (not *abstract*) реализовывает **все** методы интерфейса.

---

# Interface в Java: методы

* RemoteControlServiceImpl implements RemoteControlService - класс RemoteControlServiceImpl реализует интерфейс RemoteControlService

* В интерфейсах только декларируют методы - их реализация помещается в класс
* **НО** - в Java 8 появилась возможность в интерфейсах прописывать реализацию методов с идентификатором доступа **default**, а с Java 9 - **private** методы.

---

# Interface в Java: методы

```java
public interface RemoteControlService {
    default void printDeviceName() {
        System.out.println(getDeviceName());
    }

    private String getDeviceName() {
        return "Пульт";
    }
}
```

---

# Interface в Java: переменные

* А можно ли определять константы и переменные в интерфейсах?

```java
public interface RemoteControlService {
    BUTTONS_AMOUNT = 10;
    DEVICE_NAME = "Remote control";
    ...
}
```

* **Только константы**

---

# Способы хранения констант в Java

* class

```java
public class MyConstants {
    public static final int MAX_AMOUNT_OF_USERS = 100;
}
```

---

# Способы хранения констант в Java


* interface

```java
public interface MyContstants {
    public int MAX_AMOUNT_OF_USERS = 100;
}
```

---

# Interface

**Демо**

---


# Домашнее задание

```bash
hexlet program download java interfaces
hexlet program submit java interfaces
```

---

# Вопросы?