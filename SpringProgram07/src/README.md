# Setter method Dependency Injection through Java Configuration file

-	We will use `AnnotationConfigApplicationContext` class in case of Java-based Configuration.

-	`AnnotationConfigApplicationContext` is a Spring class for programmatic configuration, using annotations like `@Configuration` and `@Bean`. It initializes the application context, managing beans defined in annotated classes.

-	`@Configuration` in Spring marks a *class as providing bean definitions for the application context*, enabling Java-based configuration.

-	`@Bean` in Spring marks *a method to produce a bean object which is managed by the Spring Container*.

- If `@Bean` is not mentioned then object will not be created.