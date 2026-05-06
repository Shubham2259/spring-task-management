# Spring Boot Task Management System

## Overview

This is a Task Management System developed using Spring Boot.
The project implements authentication, authorization, task management, project management, REST APIs, and database integration.

---

# Technologies Used

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* Thymeleaf
* H2 Database
* Maven
* Postman

---

# Features

* User Signup and Login
* BCrypt Password Encryption
* Role-Based Authorization
* Admin and Member Roles
* Add Projects
* Add Tasks
* Dashboard with Task Statistics
* REST API for Tasks
* H2 Database Integration

---

# Project Architecture

The project follows layered architecture:

* Controller Layer
* Service Layer
* Repository Layer
* Entity Layer
* Security Layer

---

# Security Features

* Spring Security Authentication
* Role-Based Access Control
* Session-Based Login
* BCrypt Password Encoding

---

# Roles

## ADMIN

Can access:

* `/admin/**`
* `/member/**`
* Dashboard
* APIs

## MEMBER

Can access:

* `/member/**`
* Dashboard
* APIs

Cannot access:

* `/admin/**`

---

# API Endpoints

## Authentication

### Signup

```http
GET /signup
```

### Login

```http
GET /login
```

---

## Dashboard

```http
GET /dashboard
```

---

## Task APIs

### Get All Tasks

```http
GET /api/tasks
```

### Add Task

```http
POST /addTask
```

---

## Project APIs

### Add Project

```http
POST /addProject
```

---

# Database

Currently using:

* H2 In-Memory Database

H2 Console:

```http
/h2-console
```

---

# Running the Project

## Clone Repository

```bash
git clone https://github.com/Shubham2259/spring-task-management.git
```

## Open Project

Open using IntelliJ IDEA or any Java IDE.

---

## Run Application

```bash
mvn spring-boot:run
```

---

# Default URL

```text
http://localhost:8080
```

---

# Future Improvements

* JWT Authentication
* PostgreSQL/MySQL
* Docker Deployment
* React Frontend
* Swagger Documentation
* Email Verification

---

# Author

Shubham Kumar
