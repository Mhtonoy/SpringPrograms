package in.mh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.mh.beans.Student;

public class Main 
{
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("in/mh/resources/applicationContext.xml");
		
		System.out.println();
		Student std = (Student)context.getBean(Student.class);
		System.out.println(std.toString());
		
	}
	
}
