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
		
		Student std2 = (Student)context.getBean("stdObj1");
		std2.display();
		
		Student std3 = (Student)context.getBean("stdObj2");
		std3.display();

	}
}
