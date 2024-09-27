# SpringHomeWork3

## Описание

SpringHomeWork3 — это серверное приложение, которое обрабатывает HTTP-запросы и возвращает JSON-ответы. Это приложение предназначено для управления пользователями, включая создание, получение, обновление и удаление пользователей.

## Технологии

- Java 21
- Spring Boot 3.2.1
- Maven
- REST API
- cURL

## Установка

1. Клонируйте репозиторий:

   ```bash
   git clone https://github.com/ваш_репозиторий.git
   cd SpringHomeWork3
2. Соберите проект с помощью Maven:

   ```bash
    mvn clean install
    
3. Запустите приложение:

    ```bash
    mvn spring-boot:run
   
4. Доступные HTTP-запросы:

   * Создание пользователя:
       ```bash
      curl -X POST http://localhost:8080/users -H "Content-Type: application/json" -d "{\"id\": 1, \"name\": \"Alice\", \"age\": 28}"

   * Получение всех пользователей:
       ```bash
      curl -X GET http://localhost:8080/users

   * Получение пользователя по ID:
       ```bash
      curl -X GET http://localhost:8080/users/1

   * Обновление пользователя:
       ```bash
     curl -X PUT http://localhost:8080/users/1 -H "Content-Type: application/json" -d "{\"name\": \"Alice Updated\", \"age\": 30}"

   * Удаление пользователя:
       ```bash
     curl -X DELETE http://localhost:8080/users/1

   * Добавление нескольких пользователей:
       ```bash
       curl -X POST http://localhost:8080/users -H "Content-Type: application/json" -d "{\"id\": 1, \"name\": \"Alice\", \"age\": 28}"
       curl -X POST http://localhost:8080/users -H "Content-Type: application/json" -d "{\"id\": 2, \"name\": \"Bob\", \"age\": 34}"
       curl -X POST http://localhost:8080/users -H "Content-Type: application/json" -d "{\"id\": 3, \"name\": \"Charlie\", \"age\": 25}"
       curl -X POST http://localhost:8080/users -H "Content-Type: application/json" -d "{\"id\": 4, \"name\": \"David\", \"age\": 42}"
       curl -X POST http://localhost:8080/users -H "Content-Type: application/json" -d "{\"id\": 5, \"name\": \"Eva\", \"age\": 29}"
  
   * Проверка добавленных пользователей
     ```bash
       curl -X GET http://localhost:8080/users

5. Запустите тесты с помощью команды:
  ```bash
    mvn test