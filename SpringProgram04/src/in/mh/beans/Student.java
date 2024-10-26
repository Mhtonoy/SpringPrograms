package in.mh.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Mozammal")
	private String name;
	
	@Value("101")
	private int rollno;
	
	@Value("94.99f")
	private float marks;
	
	public Student() {
		System.out.println("Student object created through no argument constructor.");
	}
	
	public void setName(String name) {
		System.out.println("setName() method invoked.");
		this.name = name;
	}
	
	public void setRollno(int rollno) {
		System.out.println("setRollno() method invoked.");
		this.rollno = rollno;
	}
	
	public void setMarks(float marks) {
		System.out.println("setMarks() method invoked.");
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Name	: " + name);
		System.out.println("Roll no	: " + rollno);
		System.out.println("Marks	: " + marks);
		System.out.println();
	}
	
}

/*
 * The @Component annotation in Spring is used to declare a class as a Spring
 * Bean, which is a managed component in the Spring Application Context. It
 * helps Spring automatically detect and manage these beans during application
 * startup, making them available for dependency injection and other Spring
 * features.
 * 
 * The @Value annotation in Spring is used to inject values into Spring bean
 * fields or methods. @Value is mostly used to inject values from external
 * resources (e.g., properties files or environment variables).
 */