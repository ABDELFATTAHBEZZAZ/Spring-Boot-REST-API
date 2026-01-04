# Spring-Boot-REST-API
A simple Spring Boot REST API built for a university practical assignment.  It demonstrates basic CRUD operations for an Article entity using a layered architecture.

##  Tech Stack
- Java 17  
- Spring Boot 3.1.4  
- Maven  
- Lombok  
- Spring Web & Validation  
- JUnit 5  


##  Architecture

controller → service → dao → domaine → model
- **Controller:** Handles REST endpoints  
- **Service:** Business logic  
- **DAO:** Simulated database (in-memory list)  
- **Domain/Model:** DTOs and entities  


##  Run the Project
git clone https://github.com/sarael302/Spring-Boot-REST-API.git
cd Spring-Boot-REST-API
mvn spring-boot:run

App runs on **[http://localhost:7777](http://localhost:7777)**


## API Endpoints

| Method | Endpoint                    | Description        |
| ------ | --------------------------- | ------------------ |
| GET    | `/api/articles/all`         | Get all articles   |
| GET    | `/api/articles/id/{id}`     | Get article by ID  |
| POST   | `/api/articles/create`      | Create new article |
| PUT    | `/api/articles/update/{id}` | Update article     |
| DELETE | `/api/articles/delete/{id}` | Delete article     |


## Example Request

**POST** `/api/articles/create`
{
  "id": 5,
  "description": "HP Laptop i7",
  "price": 15000,
  "quantity": 10
}


