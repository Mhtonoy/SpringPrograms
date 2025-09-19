package in.mh.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student 
{
	private String name;
	private int rollno;

	private Address address;
	
	public Student(String name, int rollno, Address address)
	{
		System.out.println("Student object created through constructor.");
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Name = " + name + "\nRollno = " + rollno + "\nAddress: " + address ;
	}
	
}
