# Product Demo Application

A multi-tier Spring Boot application demonstrating a clean architecture pattern with microservices principles. 
The application manages a product catalog with database persistence and containerized deployment.

## Project Overview

This application is a demonstration of a **multi-tier architecture** where:
- **Presentation Layer (Controller)**: Handles HTTP requests and responses
- **Service Layer (Service)**: Contains business logic
- **Persistence Layer (Repository & Entity)**: Manages database operations

The application fetches product information from a PostgreSQL database through a well-structured layered architecture.

## Architecture

### Multi-Tier Architecture Design

```
┌─────────────────────────────────────────────────┐
│         REST API (HTTP Requests)                │
├─────────────────────────────────────────────────┤
│    ProductController (Presentation Layer)       │
├─────────────────────────────────────────────────┤
│    ProductService (Service/Business Logic)      │
├─────────────────────────────────────────────────┤
│  ProductRepository (Persistence/Data Access)    │
├─────────────────────────────────────────────────┤
│    PostgreSQL Database                          │
└─────────────────────────────────────────────────┘
```

### Components

1. **ProductDemoApplication**: Spring Boot entry point
2. **ProductController**: REST endpoint handler (`@RestController`)
3. **ProductService**: Business logic and service operations
4. **ProductRepository**: JPA repository for database operations
5. **Product**: Entity class representing the product model

## Technology Stack

| Component | Technology | Version |
|-----------|-----------|---------|
| Language | Java | 21 |
| Framework | Spring Boot | 4.1.0 |
| Build Tool | Maven | Latest |
| Database | PostgreSQL | 17 |
| ORM | JPA/Hibernate | Spring Data JPA |
| Containerization | Docker | Latest |
| Runtime | Eclipse Temurin | 21-JRE-Alpine |

### Key Dependencies

- **Spring Boot Starter Web**: REST API support
- **Spring Boot Starter Data JPA**: Database operations
- **Spring Boot Starter Validation**: Input validation
- **PostgreSQL Driver**: Database connectivity
- **Lombok**: Boilerplate code reduction
- **Spring Boot Actuator**: Application monitoring

## Prerequisites

### Local Development

- **Java Development Kit (JDK) 21** or higher
- **Maven 3.6+**
- **PostgreSQL 12+**
- **Git** (for version control)

### Docker Deployment

- **Docker** (latest version)
- **Docker Compose** (optional, for orchestration)

## Project Structure

```
demo/
├── src/
│   ├── main/
│   │   ├── java/com/nagp/demo/
│   │   │   ├── ProductDemoApplication.java      # Entry point
│   │   │   ├── controller/
│   │   │   │   └── ProductController.java       # REST endpoints
│   │   │   ├── entity/
│   │   │   │   └── Product.java                 # JPA entity
│   │   │   ├── service/
│   │   │   │   └── ProductService.java          # Business logic
│   │   │   └── repository/
│   │   │       └── ProductRepository.java       # Data access
│   │   └── resources/
│   │       └── application.properties           # Configuration
│   └── test/
│       └── java/com/nagp/demo/
├── db/
│   ├── Dockerfile                               # Database container
│   └── init_data.sql                           # Database initialization
├── Dockerfile                                  # Application container
├── pom.xml                                     # Maven configuration
├── README.md                                   # This file
└── mvnw, mvnw.cmd                              # Maven wrapper
```

## DockerHub URL
https://hub.docker.com/repositories/kapilchadockerid

## github URL
https://github.com/KapilCha/kubernetesDemo








