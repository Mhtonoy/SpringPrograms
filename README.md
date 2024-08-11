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

- A "Java Bean Object" is an instance of Java Bean Class.
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