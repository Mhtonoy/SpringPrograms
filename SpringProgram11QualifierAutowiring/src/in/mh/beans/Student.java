package in.mh.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student 
{
	private String name;
	private int rollno;
	
	@Autowired
	@Qualifier("createAddressObject2")
	private Address address;
	
	@Autowired
	private Subjects subjects;
	
	public Student()
	{
		System.out.println("Student object created through no-argument constructor.");
	}
	
	public void setName(String name) {
		System.out.println("setName() method invoked.");
		this.name = name;
	}
	public void setRollno(int rollno) {
		System.out.println("setRollno() method invoked.");
		this.rollno = rollno;
	}
	public void setAddress(Address address) {
		System.out.println("setAddress() method invoked.");
		this.address = address;
	}
	
	public void setSubjects(Subjects subjects) {
		System.out.println("setSubjects() method invoked.");
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Name = " + name + "\nRollno = " + rollno + "\nAddress: " + address + "\nSubjects: " + subjects;
	}
	
}
