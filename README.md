# Recipe API connection on java SpringBoot

A simple Spring Boot REST API for managing recipes and fetching data from the Spoonacular API.

This project demonstrates how to:

* build a backend with Spring Boot
* connect to a MySQL database
* integrate an external API
* structure a clean REST API

---

## What does this project do?

* Stores recipes in a MySQL database
* Allows creating and retrieving recipes
* Fetches random recipes from the Spoonacular API

---

## Technologies used for this project

* Java 23
* Spring Boot
* Spring Data JPA
* MySQL
* Maven

---

## How to run the project

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/recipe-api.git
cd recipe-api
```

---

### 2. Create the database

Open MySQL and create:

```sql
CREATE DATABASE recipes_db;
```

---

### 3. Set environment variables

In your terminal:

```bash
export DB_PASSWORD=your_mysql_password
export SPOONACULAR_API_KEY=your_api_key
```

---

### 4. Configure application.properties

Make sure it contains:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/recipes_db
spring.datasource.username=root
spring.datasource.password=${DB_PASSWORD}

spoonacular.api.key=${SPOONACULAR_API_KEY}
```

---

### 5. Run the application

You can run it:

* from IntelliJ (Run button), or
* using Maven:

```bash
./mvnw spring-boot:run
```

---

### 6. Open in browser

Once running, open:

```text
http://localhost:8080/recipes
```

or:

```text
http://localhost:8080/recipes/external
```

---

## API Endpoints

### Get all recipes

```
GET /recipes
```

### Create a recipe

```
POST /recipes
```

### Get recipes from external API

```
GET /recipes/external
```

---


## 👩‍💻 Author

Sofia Loukisa 

License MIT
