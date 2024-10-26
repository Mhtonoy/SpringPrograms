package in.mh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.mh.beans.Student;
import in.mh.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std1 = (Student) context.getBean("student"); // "student" is the name of the POJO class "Student.java" 
		std1.display();
		
		Student std2 = (Student) context.getBean(Student.class);
		std2.display();
	}
}
