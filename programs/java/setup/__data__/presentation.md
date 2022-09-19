---
marp: true
theme: gaia
class:
  - lead
  - invert
paginate: true
footer: 'Лекция 1: Настройка окружения'
---

# Настройка окружения
## Профессия Java-разработчик на Hexlet
### Преподаватель: Яковлев Егор
<!-- _color: white -->
<!-- _color: white -->

---
# План

1. Установка и настройка среды разработки
2. Hello, world!
3. JShell
4. javac
5. Первая программа: погружаемся
6. Домашнее задание

---

# Установка и настройка среды разработки

* [JDK](https://www.oracle.com/ru/java/technologies/javase-downloads.html "JDK")
* [IDE](https://www.jetbrains.com/idea/ "IJ")
* [Gradle](https://gradle.org/releases/ "Gradle")
* [Что нужно для Java](https://github.com/Hexlet/instructions/blob/main/java.md "Java/Gradle")
* [Cli Hexlet](https://github.com/Hexlet/cli "Cli")

[Что нужно для ДЗ](https://help.hexlet.io/ru/articles/192894-domasnie-zadaniya "ДЗ")

---

# Hello, world!

```java
class App {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```

---

# JShell
  * REPL - read-eval-print loop — цикл: чтение — вычисление — вывод
  * консольная утилита

---

# JShell
  * jshell - старт утилиты
  * /exit - выйти из утилиты
  
---

# javac
  * javac Main.java - компиляция: .java -> .class
  * java Main - запуск скомпилированный программы
  
---
# Первая программа: погружение

  Демо

---

# Домашнее задание
 
```bash
hexlet program download java setup

hexlet program submit java
```

---

# Вопросы?
