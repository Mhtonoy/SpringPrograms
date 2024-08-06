The `@Bean` annotation is used to declare a method as a factory for creating a bean managed by the Spring Container. 

The object created by `stdId1()` method which is annotated with `@Bean`, is managed and created by Spring Container.
 
 When the Spring Container initializes, it will invoke `stdId1()` method to create the **Student Object**.
 
 The method annotated with `@Bean` will:
 
 1.	Create a new Student object.
 2.	Configure the Student object by setting its properties using `setxxx` methods.
 3.	The default bean name for this method will be `stdId1` which is same as the method name.
 4. Return the configured Student object.
