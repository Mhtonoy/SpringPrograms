In normal projects we have to download the **jar** files manually. But when we create **MAVEN** project, we provide **dependencies**, through which **jar** files are automatically downloaded. We don't need to download the jar files manually and add them in project.

The required **jar** files are:
   1.   spring-beans-xxx.jar
   2.   spring-core-xxx.jar
   3.   spring-context-xxx.jar
   4.   common-logging-xxx.jar
   5.   spring-expression-xxx.jar
   
All required jar files are available at [**springjars**](springjars) folder.

# Spring Container Responsibilities
1. Bean Lifecycle Management
2. Dependency Injection
3. Configuration Management
4. AOP (Aspect Oriented Programming) support
5. Transaction Management
6. Integration with other technologies
7. Security

# Properties of JavaBean class
A JavaBean is a Java class that follows the following conventions:-
1. `It should have private properties`

2. `It should have public getter and setter methods to get and set the property values.`

3. `It should have public no-arg constructor or default constructor.`

- A **Java Bean Object** is an instance of **Java Bean Class.**
- It is a reusable, encapsulated Java component with properties, getters, and setters, designed for easy integration and manipulation.  

# Loading Bean Definitions:
- Spring loads bean definitions from various resources, such as *XML configuration files, Java-based configuration classes or component scanning*.
- These bean definitions contain information about the bean class, dependencies, and other configuration details.

# Bean Instantiation
- After bean definitions are loaded, the Spring container creates *instances of beans* based on these definitions.
- This involves *invoking the bean class's constructor*, either the default constructor or a specified consturctor, to create an actual instance of the bean.
- The newly created bean instance is now ready for configuration and initialization.

# Bean Initialization
- Once the bean is instantiated, Spring proceeds to configure and initialize it.
- Property values are set using *setters, constructor arguments or field injection*, populating the bean's state.

# Dependency Injection (DI)
- Dependency Injection is a **design pattern** used in the Spring Framework to achive **Inversion of Control**.
    - Design patterns are like pre-tested and proven blueprints for solving common software problems.
    - They help developers write cleaner, more organized code by following established patterns for various tasks.
    - For example:
        1. Singleton Pattern
        2. Factory Method Pattern
        3. DAO Design Pattern
        4. MVC Design Pattern

- It's main task is to **inject** the **dependency**, means *inject one object into another object.*

- It is used to achieve **Loose Coupling** in java.

  - `Hard Coding` in java means directly putting specific  values (i.e numbers or Strings) in your code rather than using *variables or external configuration*. This can make your code less adaptable and more challenging to *change later.*

      For Example:

      ```Java
      public class Calculator{
         public int add(){
            int result = 5+3; //Hard-coded values
            return result;
         }
      }
      ```
   -  `Tightly Coupled Classes` Tightly coupled classes have a strong dependency, where one class directly depends on another.

      For Example:

      ```java
         class Engine {
            public void start() {
               // Start the engine
            }
         }
         public class Car {
            private Engine engine;
            public Car() {
               engine = new Engine() // Tightly coupled to Engine class
            }
            public void start(){
               engine.start();
            }
         }
      ```
   -  `Loosely Coupled Classes` Loosely coupled classes minimize dependencies and make the code more maintainable and flexible.

      For Example:

      ```java
         public interface Engine() {
            void start();
         }
         public class ElectricEngine implements Engine {
            public void start() {
               // Start the engine
            }
         }
         public class PetrolEngine implements Engine {
            public void start() {
               // Start the engine
            }
         }
         public class Car {
            private Engine engine;
            public Car(Engine engine) {
               this.engine = engine; // Loosely coupled to Engine class
            }
            public void start(){
               engine.start();
            }
         }
         ```
- **DI** can be achieved by two ways:
    1. Setter Method DI
    2. Constructor DI

# Setter Method Dependency Injection
1. Dependencies are injected into a class through setter methods
2. Setter methods DI is more readable
3. Setter methods DI is more flexible

# Constructor Dependency Injection
1. Dependencies are injected into class through constructor. 
2. Constructor DI is less readable.
3. Constructor DI is less flexible.

# Difference Between Setter method and Constructor Dependency Injection (DI)
| Setter Method DI | Constructor DI|
|------------------|---------------|
| Dependencies are injected into a class through setter methods | Dependencies are injected into class through constructor |
| Setter methods DI is more readable | Constructor DI is less readable |
| Setter methods DI is more flexible | Constructor DI is less flexible |