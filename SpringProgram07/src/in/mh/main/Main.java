package in.mh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.mh.beans.Student;
import in.mh.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		System.out.println();
		
		Student std1 = (Student) context.getBean(Student.class);
		std1.display();
		
		System.out.println();
		
		Student std2 = (Student) context.getBean(Student.class);
		System.out.println(std2.toString());
	}
}

/*
 * We will use AnnotationConfigApplicationContext class in case of Java-based Configuration.
 * AnnotationConfigApplicationContext is a Spring class for programmatic configuration, using annotations like @Configuration and
 * @Bean. It initializes the application context, managing beans defined in annotated classes.
 */
