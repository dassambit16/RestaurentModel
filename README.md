# Restaurant Management Application

The Restaurant Management Application is a Spring Boot-based web application designed to help manage restaurant information. It allows users to perform various operations related to restaurant management, including adding new restaurants, updating specialties, and deleting restaurants from the system.

## Technologies Used

- Framework: Spring Boot
- Language: Java
- Build Tool: Maven

## Table of Contents

- [Overview](#overview)
- [Technologies Used](#technologies-used)
- [Table of Contents](#table-of-contents)
- [API Endpoints](#api-endpoints)
- [Project Structure](#project-structure)
- [Database Design](#database-design)
- [Data Structures](#data-structures)
- [Project Summary](#project-summary)
- [License](#license)
- [Acknowledgments](#acknowledgments)

## API Endpoints

### Get All Restaurants

This endpoint retrieves a list of all registered restaurants.

**HTTP Method**: GET

**Endpoint**: `/restaurants`

### Get Restaurant by ID

This endpoint retrieves detailed information about a specific restaurant by its ID.

**HTTP Method**: GET

**Endpoint**: `/restaurant/{id}`

### Add Restaurant

This endpoint adds a new restaurant to the system.

**HTTP Method**: POST

**Endpoint**: `/restaurant`

### Add Restaurants

This endpoint adds multiple restaurants to the system.

**HTTP Method**: POST

**Endpoint**: `/restaurants`

### Update Restaurant Specialty

This endpoint updates the specialty of a restaurant by its ID.

**HTTP Method**: PUT

**Endpoint**: `/restaurant/id/{id}/specialty/{specialty}`

### Delete Restaurant

This endpoint deletes a restaurant by its ID.

**HTTP Method**: DELETE

**Endpoint**: `/restaurant/{id}`

## Project Structure

The project follows a layered architecture:

- **Controller**: Handles incoming HTTP requests and delegates them to services.
- **Services**: Implements core business logic, data processing, and interacts with the data repository.
- **Repository**: Manages data access to the database.

## Database Design

The database design includes tables for restaurant management with fields such as:

- restaurantId
- restaurantName
- restaurantAddress
- restaurantContact
- restaurantEmail
- restaurantSpecialty
- numberOfStaff
- restaurantType
- created_at
- updated_at

## Data Structures

- **Restaurant Class**: Defines the structure for restaurant data.
- **Type Enum**: Enumerates possible restaurant types.
- **ArrayList**: Used to store and manage lists of Restaurant objects.

## Project Summary

The Restaurant Management Application is a robust Spring Boot application designed for efficient restaurant data management. It offers a set of RESTful API endpoints for various restaurant-related operations, including adding, retrieving, updating, and deleting restaurant information.

**Key Features**:

- RESTful API endpoints for restaurant management.
- Data validation to ensure data integrity.
- Clean code separation with a layered architecture.
- Robust error handling for improved reliability.
- Java-based backend and Maven for build management.

The application serves as a practical example of Spring Boot application development, demonstrating best practices in API design and restaurant data management. It offers a solid foundation for building and extending restaurant management systems in various applications.

## License

This project is licensed under the GNU General Public License v3.0.

## Acknowledgments

Thank you to the Spring Boot and Java communities for providing excellent tools and resources.
