# 🛍️ Product Recommendation System

<div align="center">
  
![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![H2 Database](https://img.shields.io/badge/H2%20Database-1021FF?style=for-the-badge&logo=h2&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

</div>

## 🔍 Overview

This project is a **backend API service** built with **Java Spring Boot** that mimics the behavior of a basic recommendation engine, similar to what you'd find on platforms like **Amazon**. The system provides intelligent product recommendations based on user preferences and behavior patterns.

## ✨ Features

- 🛒 **Product Management** - Create, update, and manage product catalogs
- 👥 **User Management** - Handle user registration and profile management
- 🎯 **Smart Recommendations** - Generate personalized product suggestions
- 💾 **Data Persistence** - Store and retrieve data using Spring Data JPA
- 🗄️ **In-Memory Database** - H2 database integration for development & testing
- 🔧 **API Testing** - Comprehensive testing with Postman

## 🚀 Tech Stack

<div align="center">

| Technology | Purpose | Version |
|------------|---------|---------|
| **Java** | Core Programming Language | 11+ |
| **Spring Boot** | Application Framework | 2.7+ |
| **Spring Data JPA** | Data Access Layer | 2.7+ |
| **H2 Database** | In-Memory Database | Runtime |
| **Maven** | Dependency Management | 3.8+ |
| **Postman** | API Testing | Latest |
| **IntelliJ IDEA** | Development Environment | 2022+ |

</div>

## 📋 API Endpoints

### 👤 User Management
```
POST   /api/users           - Create new user
GET    /api/users           - Get all users
GET    /api/users/{id}      - Get user by ID
PUT    /api/users/{id}      - Update user
DELETE /api/users/{id}      - Delete user
```

### 🛍️ Product Management
```
POST   /api/products        - Create new product
GET    /api/products        - Get all products
GET    /api/products/{id}   - Get product by ID
PUT    /api/products/{id}   - Update product
DELETE /api/products/{id}   - Delete product
```

### 🎯 Recommendations
```
GET    /api/recommendations/{userId}  - Get personalized recommendations
POST   /api/recommendations/feedback  - Submit user feedback
```

## 🛠️ Setup & Installation

### Prerequisites
- Java 11 or higher
- Maven 3.8+
- IntelliJ IDEA or your preferred IDE
- Postman (for API testing)

### Steps
1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/Product-Recommendation-System.git
   cd Product-Recommendation-System
   ```

2. **Build the project**
   ```bash
   mvn clean install
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the application**
   - API Base URL: `http://localhost:8080/api`
   - H2 Console: `http://localhost:8080/h2-console`

## 🗄️ Database Configuration

The project uses **H2 in-memory database** for development and testing:

```properties
# H2 Database Configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create-drop
```

## 📊 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/recommendation/
│   │       ├── controller/          # REST Controllers
│   │       ├── service/             # Business Logic
│   │       ├── repository/          # Data Access Layer
│   │       ├── model/               # Entity Classes
│   │       └── RecommendationApplication.java
│   └── resources/
│       ├── application.properties
│       └── data.sql                 # Sample data
└── test/
    └── java/                        # Unit & Integration Tests
```

## 🧪 Testing

### Running Tests
```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=UserServiceTest

# Run with coverage
mvn test jacoco:report
```

### Postman Testing
1. Import the provided Postman collection
2. Set environment variables:
   - `baseUrl`: `http://localhost:8080/api`
3. Run the test suite to verify all endpoints

## 🔮 Future Enhancements

- 🤖 **Machine Learning Integration** - Advanced recommendation algorithms
- 📱 **Mobile API** - Dedicated mobile endpoints
- 🔐 **Authentication & Authorization** - JWT-based security
- 📈 **Analytics Dashboard** - User behavior tracking
- 🐳 **Docker Support** - Containerization for easy deployment
- ☁️ **Cloud Deployment** - AWS/Azure integration

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request



## 📞 Contact

**Your Name** - hadinasser067@gmail.com

Project Link: [https://github.com/HA11723/Product-Recommendation-System](https://github.com/HA11723/Product-Recommendation-System)

---

<div align="center">
  
**⭐ Star this repo if you found it helpful!**

</div>
