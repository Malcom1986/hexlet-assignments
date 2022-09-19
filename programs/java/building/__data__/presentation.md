---
marp: true
theme: gaia
class:
  - lead
  - invert
paginate: true
footer: 'Лекция 15: Сборка проекта'
---

# Сборка проекта
## Профессия Java-разработчик на Hexlet
### Преподаватель: Яковлев Егор
<!-- _color: white -->
<!-- _color: white -->

---

# Вопросы к лекции:

* Что такое система сборки проекта и какие проблемы решает?
* Какие бывают системы сборки проекта?
* Чем отличаются системы сборки друг от дурга?

---

# План

* Система сборки проекта
* Ant
* Maven
* Gradle


---

# Система сборки проекта

**Система сборки** обеспечивает автоматизацию *сборки* проекта.

Что может входить в понятие "сборка"...

---

# Сборка проекта

* загрузить зависимые библиотеки для вашего проекта из сети (репозитория)
* скомпилировать классы модуля или всего проекта
* сгенерировать дополнительные файлы: SQL-скрипты, XML-конфиги и т.п.
* упаковка скомпилированных классов проекта в архивы различных форматов: zip, jar, ear, war и др.
* установка (deploy) файлов проекта на удаленный сервер
* генерация документации и отчетов

---

# Системы сборки 

Наиболее популярные: Ant, Maven, Gradle

Теперь сборка проекта - это тоже код

---

# Ant

Аналог make-файла - по-сути набор скриптов

```ant
<javac srcdir="${src.dir}" destdir="${build.classes}"
    <classpath refid="libs.dir"/>
</javac>
```

Да прибудет с нами maven...


---

# maven

* в формате xml
* весь конфиг - в файле pom.xml
* из коробки - различные типы сборки: JAR, WAR, EAR...
* введена стандартная структура каталогов для проекта 
(см. [структура](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html))
* цикл сборки разбит на phases (фазы) (см. [фазы](http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html#Built-in_Lifecycle_Bindings))
* поддерживается модульная архитектура проекта
* поддерживаются профили
* репозиторий - централизованное хранение библиотек

---

# maven: библиотеки

Каждая библиотека определяется уникальными параметрами:
* groupId
* artifactId
* version

---

# maven: библиотеки

```xml
<dependencies>
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.12.2</version>
    </dependency>
</dependencies>
```

**демо**


---

# maven: библиотеки

автоматическое разрешение зависимостей:

* библиотека А зависит от библиотеки B
* библиотека C также зависит от библиотеки B, но другой версии

---

# gradle

* groovy DSL
* gradle выполняет task, которые предоставляются различными plugin-ами
* аналогичная структура файлов с maven

```groovy
plugins {
    id 'java' // jar, compileJava
    id 'application' // run
}
```

---

# gradle: библиотеки

репозиторий:

```groovy
repositories {
    mavenCentral()
}
```

библиотеки: 

```groovy
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
}
```

---

# Домашнее задание

```bash
hexlet program download java building
hexlet program submit java
```

---

# Вопросы?
