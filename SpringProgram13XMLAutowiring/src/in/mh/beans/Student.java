package in.mh.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student 
{
	private String name;
	private int rollno;

	private Address address;
	private Subjects subjects;
	
	public Student()
	{
		System.out.println("Student object created through no-argument constructor.");
	}
	
	public void setName(String name) 
	{
		this.name = name;
		System.out.println("setName() method invoked.");
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
		System.out.println("setRollno() method invoked.");
	}
	public void setAddress(Address address) 
	{
		this.address = address;
		System.out.println("setAddress() method invoked.");
	}
	
	public void setSubjects(Subjects subjects) 
	{
		this.subjects = subjects;
		System.out.println("setSubjects() method invoked.");
	}

	@Override
	public String toString() {
		return "Name = " + name + "\nRollno = " + rollno + "\nAddress: " + address + "\nSubjects: " + subjects;
	}
	
}
