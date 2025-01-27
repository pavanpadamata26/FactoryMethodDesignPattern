# Factory Design Pattern
This repository demonstrates the implementation of the **Factory Design Pattern** in Java.
The Factory Design Pattern is a creational design pattern that provides a way to create objects without specifying the exact class of the object being created.
## Key Features
- Abstracts the logic of database connection creation.
- Easily extendable to add new database types.
- Uses the Factory Design Pattern to decouple connection logic from application code.
Note:- **Add JDBC Driver Dependencies**:
   - For MySQL, PostgreSQL, or SQLite, make sure the respective JDBC drivers are available in your classpath.
  To add support for a new database, simply create a new ConnectionFactory and update the ConnectionFactoryProducer.
## How It Works
ConnectionFactory Interface: Creates a method to establish a connection.
Concrete Factories: Each database has a concrete factory that implements the ConnectionFactory interface.
FactoryProducer: Decides which factory to use based on the database name.
## Error Handling:
The code includes proper exception handling in the try-catch block for SQLException.
The finally block ensures that the connection is closed properly after usage.
## Conclusion:
The Factory Design Pattern allows for easy extension and maintenance of the code.
This pattern helps achieve loose coupling by abstracting the database connection creation logic, allowing the application to easily switch between different database types.
