# 📝 Blog Management API (Spring Boot)

A clean and fully functional RESTful backend for managing blog posts, users, and comments — built with **Spring Boot** and structured for maintainability, clarity, and scalability.

> 🚀 Designed for learning, portfolio-building, and real-world API development.

---

## ⚙️ Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL** 
- **Lombok**
- **Maven**

---

## 📦 Features

### 👤 User Management
- Create, update, delete users
- Partial updates supported
- Linked to posts and comments

### 📝 Post Management
- Create, retrieve, update, delete posts
- Each post linked to a user
- Supports full CRUD operations

### 💬 Comment System
- Add, edit, delete comments on posts
- Get all comments for a post
- Count comments for a post

### 🔐 Clean API Design
- RESTful conventions
- Uses `ResponseEntity` for consistent responses
- Path variables, request bodies, and status codes handled correctly

---

## 🔗 API Endpoints
### 🔹 Users
POST    /users                → Create user  
GET     /users/{id}           → Get user by ID  
PUT     /users/{id}           → Update user  
DELETE  /users/{id}           → Delete user

### 🔹 Posts
POST    /posts                → Create post  
GET     /posts/{id}           → Get post by ID  
PUT     /posts/{id}           → Update post  
DELETE  /posts/{id}           → Delete post

### 🔹 Comments
POST    /comments                     → Add comment  
GET     /comments/{id}                → Get comment by ID  
GET     /comments/post/{postId}       → Get comments for a post  
GET     /comments/count/{postId}      → Get number of comments on a post  
PUT     /comments/{id}                → Update comment  
DELETE  /comments/{id}                → Delete comment


---

## 🧪 How to Run Locally

1. **Clone the repo**
```bash
git clone https://github.com/your-username/blog-management-api.git
cd blog-management-api
Open the project in your IDE (IntelliJ / VS Code)

Run the application

Locate and run BlogManagementApplication.java

Test using Postman or cURL

Default server runs on http://localhost:8080

📌 Possible Enhancements
🔐 Add Spring Security + JWT for auth

🌐 Add Swagger for API documentation

🧪 Add unit and integration tests

🎨 Add Thymeleaf or React frontend

🚀 Deploy using Render / Railway / Heroku