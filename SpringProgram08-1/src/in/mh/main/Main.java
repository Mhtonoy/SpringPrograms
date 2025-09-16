package in.mh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.mh.beans.Student;
import in.mh.resources.SpringConfigFile;

public class Main 
{
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std = context.getBean(Student.class);
		std.Display();
		System.out.println(std.toString());
	}

}
