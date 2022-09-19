---
marp: true
theme: gaia
class:
  - lead
  - invert
paginate: true
footer: 'Лекция 8: Code generation'
---

# Code generation
## Профессия Java-разработчик на Hexlet
### Преподаватель: Яковлев Егор
<!-- _color: white -->
<!-- _color: white -->

---

# Вопросы к лекции:

1. Как бороться с бойлерплейт-кодом в Java?
2. Что такое lombok?
3. Что умеет делать lombok?

---

# План

1. Бойлерплейт-код
2. Lombok
3. Основные аннотации Lombok
4. Недостатки Lombok

---

# Бойлерплейт-код в Java

```java
public class User {
    private Integer id;
    private String name;

    // boilerplate getters
    public String getName() {
        return this.name;
    }

    // boilerplate setters
    public void setName(String name) {
        this.name = name;
    }
}
```

---

# Lombok

```java
@Data
public class User {
    private Integer id;
    private String name;

    // getters, setters, equals, hashcode, toString
}
```

**демо**

---

# Добавление в проект

```xml
<dependencies>
  <dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.16.18</version>
    <scope>provided</scope>
  </dependency>
</dependencies>
```

---

# It is a kind of magic

* Lombok генерирует код на этапе компиляции (см. .class)
* При использовании Lombok мы пишем не валидный код на Java – требуется плагин для IDE

[Шпаргалка по Lombok](https://habr.com/ru/post/345520/)

---

# Основные аннотации Lombok

Аннотация                   | Функционал |
--------------------------- | ---------- |
@Data                       | toString, equals, hashcode, getters, setters, no args constructor
@Getter                     | getter для свойства
@Setter                     | setter для свойства
@Getter/@Setter над классом | getter / setter для всех свойств

---

# Основные аннотации Lombok

Аннотация                             | Функционал |
------------------------------------- | ---------- |
@NoArgsConstructor/@NoArgsConstructor | Конструктор без аргументов / Конструктор со всеми аргументами
@Builder                              | Реализация паттерна builder
@NotNull                              | Аргумент не null

---

# Недостатки Lombok

* "Невидимый" код
* Невалидный Java-код
* Лишняя зависимость
