package in.mh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.mh.beans.Student;

public class Main {
	public static void main(String[] args) {
		
		String resource_file_path = "/in/mh/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(resource_file_path);
		
		Student std = (Student) context.getBean("student");
		std.display();
	}
}
