---
marp: true
theme: gaia
class:
  - lead
  - invert
paginate: true
footer: 'Docker'
---

# Docker
## Профессия Java-разработчик на Hexlet
### Преподаватель: Яковлев Егор
<!-- _color: white -->
<!-- _color: white -->

---

# Вопросы к лекции

* Что такое Docker?
* Для чего используется Docker?
* Как создать Dockerfile для приложения на SpringBoot?

---

# План

1. Docker
2. Команды Docker
3. Демо

---

# Docker

Docker – программное обеспечение для автоматизации развёртывания и управления приложениями в средах с поддержкой контейнеризации

---

# Docker

Установка: https://docs.docker.com/engine/install

---

# Команды Docker

* docker build . -t example_project/example_image – сборка образа
* docker images – все собранные образы
* docker run -it -p 80:8080 example_project/example_image – запуск образа
* docker run -it -p 80:8080 my_account_name/awesome_image bash – запустить образ и подключиться по bash

---

# Демо
