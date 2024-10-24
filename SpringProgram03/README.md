# Annotation Based Configuration

The `@Component` annotation in Spring is used to *declare a class as a Spring Bean*, which is a managed component in the *Spring Application Context*. It helps Spring automatically detect and manage these beans during application startup, making	them available for **dependency injection** and other Spring features. It is also known as **stereotype annotation**.
   - Some commonly used annotations that are based on `@Component` are:
      1. `@Service`
      2. `@Repository`
      3. `@Controller` etc 

In a Spring **XML Configuration file**, `<context:component-scan>` is used to *instruct the Spring framework to perform component scanning*. It scans specified packages in the application's classpath for classes annotated with annotations like `@Component`, `@Service`, `@Repository`, and `@Controller`. These discovered classes are then registered as Spring beans, enabling automatic dependency injection and other Spring features.

The `@Value` annotation in Spring is used to *inject values into Spring bean fields or methods*. `@Value`
is mostly used to inject values from external resources (e.g., properties files or environment variables).
