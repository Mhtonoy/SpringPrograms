package in.mh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.mh.beans.Student;
import in.mh.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std1 = (Student) context.getBean("stdId1"); 
		std1.display();
		
		System.out.println();
		
		Student std3 = (Student)context.getBean("stdObj2");
		std3.display();
		
		System.out.println();
		
		Student std2 = (Student)context.getBean("stdObj1");
		std2.display();

	}
}
/*
 * @Configuration indicates that the class is spring configuration class.It
 * means that annotated Java class contains bean definitions and configuration
 * settings* for the Spring Application Context.
 * 
 * @configuration allows us to define beans and their dependencies in a
 * Java-based way instead of using XML configuration files.
 */