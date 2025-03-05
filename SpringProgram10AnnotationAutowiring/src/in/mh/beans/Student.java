package in.mh.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
	private String name;
	private int rollno;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Subjects subjects;
	
	public Student()
	{
		System.out.println("Student object created through no-argument constructor.");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Name = " + name + "\nRollno = " + rollno + "\nAddress: " + address + "\nSubjects: " + subjects;
	}
	
}
