package in.mh.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.mh.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Student stdId1() {
		
		Student std = new Student();
		std.setName("Kamal");
		std.setRollno(103);
		std.setEmail("kamal@gmail.com");
		
		return std;
	}
	
	@Bean("stdObj1")
	public Student createStdBeanObj1() {
		
		Student std = new Student();
		std.setName("Jamal");
		std.setRollno(104);
		std.setEmail("jamal@gmail.com");
		
		return std;
	}
	
	@Bean("stdObj2")
	public Student createStdBeanObj2() {
		
		Student std = new Student();
		std.setName("Ankit");
		std.setRollno(105);
		std.setEmail("ankit@gmail.com");
		
		return std;
	}
	
	
}
/*
 *1. The @Bean annotation is used to declare a method as a factory for creating a bean managed by the Spring Container. 
 *2. The object created by stdId1() method which is annotated with @Bean, is managed and created by Spring Container.
 *3. When the Spring Container initializes, it will invoke stdId1() method to create the Student Object.
 *4. The method annotated with @Bean will:
 *			--> Create a new Student object.
 *			--> Configure the Student object setting its properties using setxxx methods.
 *			--> The default bean name for this method will be "stdId1" which is same as the method name.
 *			--> Return the configured Student object.
 */