# employee

# Employee Management Service

This project is an employee management service implemented using Spring Boot. The service provides functionality to manage employee records, including finding all employees, saving a new employee, updating an existing employee, and deleting an employee.

## Project Structure

The project structure follows the typical Spring Boot project conventions:

- **package miu.edu.abc.employee_management.entity**: Contains the `Employee` entity class.
- **package miu.edu.abc.employee_management.repository**: Contains the `EmployeeRepository` interface that extends `JpaRepository`.
- **package miu.edu.abc.employee_management.service**: Contains the `EmployeeService` interface that defines the service methods.
- **package miu.edu.abc.employee_management.service.impl**: Contains the `EmployeeServiceImpl` class that implements the `EmployeeService` interface.

## Classes and Interfaces

### Employee

The `Employee` class represents an employee entity. It includes fields such as `id`, `firstName`, `lastName`, `salary`, and others.

### EmployeeRepository

The `EmployeeRepository` interface extends `JpaRepository` to provide CRUD operations for `Employee` entities.

### EmployeeService

The `EmployeeService` interface defines the methods for employee management, including:

- `List<Employee> findAll()`
- `Employee save(Employee employee)`
- `Employee update(Employee employee)`
- `void delete(Employee employee)`

### EmployeeServiceImpl

The `EmployeeServiceImpl` class is a service implementation that provides the actual logic for managing employees. It uses `EmployeeRepository` for data access and implements the methods defined in `EmployeeService`.

#### Methods

- **findAll()**: Retrieves all employees, sorted by salary in ascending order and then by last name in descending order.
- **save(Employee employee)**: Saves a new employee to the repository.
- **update(Employee employee)**: Updates an existing employee in the repository.
- **delete(Employee employee)**: Deletes an employee from the repository.

## Dependencies

The project uses the following dependencies:

- spring-boot-starter-data-mongodb
- Lombok


