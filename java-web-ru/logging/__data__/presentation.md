---
marp: true
theme: gaia
class:
  - lead
  - invert
paginate: true
footer: 'Лекция 8: Logger'
---

# Logger
## Профессия Java-разработчик на Hexlet
### Преподаватель: Яковлев Егор
<!-- _color: white -->
<!-- _color: white -->

---

# Вопросы к лекции:

* 

---

# План

1. 

---

# Session

Сессия — это диалоговое состояние между клиентом и сервером, включающее информацию о предыдущих запросах клиента и ответах сервера.

##### Хакаем stateless HTTP

---

# Как работает?

Каждый запрос от клиента сервер ассоциирует с некоторой уникальной информацией об установленной сессии (идентификатор сессии), пробрасывая её в каждом запросе и ответе.

Идентификатор сессии представляет собой случайно сгенерированное число.

---

# Как передаётся UID?

* cookies
* hidden поля формы
* передача в адресе запроса

---

# Завершение сессии

До тех пор пока клиент передает свой персональный ключ, сессия считается активной. 

Прекращение сессии может произойти: 

* вручную на стороне сервера
* по истечении какого-то установленного времени (таймаут)

---

# Session

**Демо**

---


# Домашнее задание

```bash
hexlet program download java session
hexlet program submit java
```

---

# Вопросы?