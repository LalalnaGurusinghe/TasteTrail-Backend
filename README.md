## 🍽️ Restaurant Review Platform – Backend

A powerful backend service for a restaurant review platform built using modern Java technologies. This application provides RESTful APIs for managing restaurants, user reviews, photo uploads, and secure authentication with OAuth2.

---

### 🔧 Tech Stack

- **Language & Framework:** Java 21, Spring Boot
- **Database:** Spring Data JPA with H2 (dev mode)
- **Authentication:** OAuth2, Keycloak
- **Search Engine:** Elasticsearch (via Docker)
- **Tools & Utilities:** MapStruct, Lombok, Docker Compose, Swagger

---

### ✅ Features Implemented (Backend Only)

- 🔐 **Secure Authentication** using OAuth2 with Keycloak (Role-based access)
- 🧾 **Restaurant & Review Management** – CRUD APIs for restaurants and user reviews
- ⭐ **Star Ratings & Photo Uploads** – Multipart data handling
- 🔎 **Advanced Search** – Full-text search & filtering with Elasticsearch
- 🧩 **Modular Design** – DTOs, services, repositories, and controllers cleanly separated
- 🐳 **Containerized Setup** – Elasticsearch and Keycloak managed via Docker Compose

---

### 💡 Highlights

1. **Robust REST API Design** with clean, scalable architecture
2. **OAuth2 Security Integration** using Keycloak for secure access management
3. **Full-text Search** powered by Elasticsearch
4. **Use of Modern Java Tools** – MapStruct for object mapping, Lombok for boilerplate reduction
5. **Containerized Services** – Easy to spin up full stack with Docker

---

### 📂 Project Modules

| Layer         | Responsibility                                      |
|---------------|------------------------------------------------------|
| `entity`      | Java models for Restaurant, Review, User, etc.      |
| `dto`         | Data transfer objects for clean API communication   |
| `repository`  | Spring Data JPA interfaces                          |
| `service`     | Business logic layer                                |
| `controller`  | REST API endpoints                                  |
| `config`      | Security, CORS, Keycloak integration                |

---

### 🔐 Security Features

- Integrated **Keycloak** for user management and secure authentication
- Role-based access control (e.g., admin vs. general user)
- JWT-based OAuth2 login flow

---

### 🔍 Search Functionality

- Uses **Elasticsearch** to enable fast and scalable full-text search on:
  - Restaurant names
  - Cuisine types
  - Ratings
  - Review content
- Results are paginated and filterable

---

### 🧠 Why I Built This Project

To gain hands-on experience in building a **secure, production-grade backend** using Spring Boot, while exploring:
- Authentication flows with OAuth2 and Keycloak
- Full-text search with Elasticsearch
- Clean code architecture using modern Java tooling

---

### 📸 Sample API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/restaurants` | List all restaurants |
| POST | `/api/reviews` | Add a review for a restaurant |
| GET | `/api/search?q=sushi` | Search for restaurants and reviews |
| POST | `/api/auth/signup` | Register a user (Keycloak) |

> For full endpoint documentation, see Swagger UI: `/swagger-ui.html`

---

### 🚀 How to Run (Backend)

1. Clone the repository
2. Start Docker Compose (Elasticsearch + Keycloak)
3. Run the Spring Boot app (via IDE or `mvn spring-boot:run`)
4. Access APIs at `http://localhost:8080`

---

### 🧠 Learnings

- Set up and configure **Keycloak** for enterprise-grade security
- Integrate **Elasticsearch** in a Spring Boot ecosystem
- Develop scalable, testable RESTful APIs
- Follow best practices for structuring Java backend applications

---

