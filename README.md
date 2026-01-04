# Spring Boot REST API

Une API REST complète développée avec Spring Boot pour la gestion d'articles. Ce projet démontre l'implémentation d'opérations CRUD (Create, Read, Update, Delete) en utilisant une architecture en couches professionnelle.

## 📋 Description

Cette application REST API permet de gérer des articles avec les fonctionnalités suivantes :
- Création, lecture, mise à jour et suppression d'articles
- Validation des données avec Spring Validation
- Gestion centralisée des exceptions
- Support des formats JSON et XML
- Tests unitaires et d'intégration

## 🛠️ Stack Technique

- **Java 17** - Langage de programmation
- **Spring Boot 3.5.6** - Framework principal
- **Maven** - Gestionnaire de dépendances
- **Lombok** - Réduction du code boilerplate
- **Spring Web** - Support REST
- **Spring Validation** - Validation des données
- **Jackson XML** - Support XML/JSON
- **JUnit 5** - Framework de tests

## 🏗️ Architecture

Le projet suit une architecture en couches :

```
Controller → Service → DAO → Domain/Model
```

- **Controller** : Gestion des endpoints REST et des requêtes HTTP
- **Service** : Logique métier et règles de gestion
- **DAO** : Accès aux données (simulation en mémoire)
- **Domain/Model** : DTOs (Data Transfer Objects) et entités métier

## 🚀 Installation et Exécution

### Prérequis
- Java 17 ou supérieur
- Maven 3.6+

### Étapes d'installation

1. **Cloner le dépôt**
   ```bash
   git clone https://github.com/ABDELFATTAHBEZZAZ/Spring-Boot-REST-API.git
   cd Spring-Boot-REST-API
   ```

2. **Compiler le projet**
   ```bash
   mvn clean install
   ```

3. **Lancer l'application**
   ```bash
   mvn spring-boot:run
   ```

L'application sera accessible sur : **http://localhost:7777**

## 📡 Endpoints API

| Méthode | Endpoint                      | Description                    |
|---------|-------------------------------|--------------------------------|
| GET     | `/api/articles/all`           | Récupérer tous les articles    |
| GET     | `/api/articles/id/{id}`       | Récupérer un article par ID    |
| GET     | `/api/articles?id={id}`       | Récupérer un article (query)   |
| POST    | `/api/articles/create`        | Créer un nouvel article        |
| PUT     | `/api/articles/update/{id}`    | Mettre à jour un article       |
| DELETE  | `/api/articles/delete/{id}`    | Supprimer un article           |

## 📝 Exemples d'utilisation

### Créer un article

**POST** `/api/articles/create`

**Content-Type:** `application/json`

```json
{
  "id": 1,
  "description": "HP Laptop i7",
  "price": 15000.0,
  "quantity": 10.0
}
```

**Réponse :**
```
HTTP 201 Created
Article is created successfully
```

### Récupérer tous les articles

**GET** `/api/articles/all`

**Accept:** `application/json` ou `application/xml`

**Réponse :**
```json
[
  {
    "id": 1,
    "description": "HP Laptop i7",
    "price": 15000.0,
    "quantity": 10.0
  }
]
```

### Récupérer un article par ID

**GET** `/api/articles/id/1`

**Réponse :**
```json
{
  "id": 1,
  "description": "HP Laptop i7",
  "price": 15000.0,
  "quantity": 10.0
}
```

### Mettre à jour un article

**PUT** `/api/articles/update/1`

```json
{
  "description": "HP Laptop i7 - Updated",
  "price": 16000.0,
  "quantity": 15.0
}
```

### Supprimer un article

**DELETE** `/api/articles/delete/1`

**Réponse :**
```
HTTP 200 OK
Article is deleted successfully
```

## ✅ Validation des données

L'API valide automatiquement les données d'entrée :

- **description** : Entre 1 et 30 caractères
- **quantity** : Minimum 1

En cas d'erreur de validation, l'API retourne un message d'erreur détaillé.

## 🧪 Tests

Le projet inclut des tests unitaires et d'intégration :

```bash
mvn test
```

## 📦 Structure du projet

```
src/
├── main/
│   ├── java/
│   │   └── ma/formations/rest/tprest/
│   │       ├── controller/     # Contrôleurs REST
│   │       ├── service/        # Logique métier
│   │       ├── dao/            # Accès aux données
│   │       ├── domaine/        # DTOs et convertisseurs
│   │       └── MainApplication.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/                   # Tests unitaires et d'intégration
```

## 🔧 Configuration

Le fichier `application.properties` contient :

```properties
spring.application.name=tprest
server.port=7777
```

## 📄 Licence

Ce projet a été développé dans le cadre d'un travail pratique universitaire.

## 👤 Auteur

**ABDELFATTAH BEZZAZ**

- GitHub: [@ABDELFATTAHBEZZAZ](https://github.com/ABDELFATTAHBEZZAZ)

## 🤝 Contribution

Les contributions sont les bienvenues ! N'hésitez pas à ouvrir une issue ou soumettre une pull request.

