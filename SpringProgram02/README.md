# Java-based Configuration

-	`@Configuration` indicates that the class is spring configuration class.It means that annotated Java class contains *bean definitions and configuration settings* for the **Spring Application Context**.


-	`@configuration` allows us to *define beans and their dependencies in a Java-based way* instead of using XML configuration files. 


-	In Java-based configuration, we use methods annotated with `@Bean` to define beans. This annotation *declares a method as a factory for creating and configuring a bean managed by the Spring Container*.


-	In Java configuration, the **method name** becomes the *default bean name*, and the **return type** of the method *determines the class of the object that will be created as the bean*.


-	The object created by `stdId1()` method which is annotated with `@Bean`, is managed and created by Spring Container.

 
 -	When the Spring Container initializes, it will invoke `stdId1()` method to create the **Student Object**.
 
 
 -	The method annotated with `@Bean` will:<br>
 	1.	Create a new Student object.<br>
 	2.	Configure the Student object by setting its properties using `setXXX` methods.<br>
 	3.	The default bean name for this method will be `stdId1` which is same as the method name.<br>
 	4.	Return the configured Student object.
 	
 	
 -	The `ApplicationContext (Spring Container)` is an *interface* in Spring which is used to manage beans, handle application events, and access resources.<br><br>
 	Some implemented classes of ApplicationContext are <br>
 		1.	`ClassPathXmlApplicationContext` (Used for XML configuration)<br>
 		2.	`AnnotationConfigApplicationContext` (Used for Java configuration) etc
