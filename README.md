# Employee Management System Backend

This is a backend application for an Employee Management System built using **Spring Boot** and **MongoDB**. The application provides REST APIs for managing employee records, including creating, retrieving, updating, and deleting employee data.

---

## Features

- **Create Employee**: Add a new employee record to the database.
- **Get Employee by ID**: Retrieve a specific employee's details using their unique ID.
- **Get All Employees**: Fetch all employee records from the database.
- **Update Employee**: Update the details of an existing employee.
- **Delete Employee**: Remove an employee record from the database.

---

## Technologies Used

- **Java 17** or later
- **Spring Boot 3.0**
  - Spring Web
  - Spring Data MongoDB
- **MongoDB**
- **Maven** for dependency management

---

## Getting Started

### Prerequisites

1. **Java** installed (version 17 or later)
2. **IntelliJ with Maven** installed
3. **MongoDB** installed and running
4. **Lombok** plugin installed in IntelliJ

### Installation and Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ems-backend.git
   cd ems-backend
   ```
2. MongoDB Configuration:
- Create a new cluster and name it Cluster0 (or any preferred name).
- After creating the cluster, click the Connect button in the Atlas dashboard. Select Connect your application and copy the connection string URI.
- Replace <username> and <password> in the URI with your MongoDB credentials.
- Open the application.properties file located in the src/main/resources directory. Replace the default MongoDB connection URI with the modified URI.

3. Run the APIs in Postman.
