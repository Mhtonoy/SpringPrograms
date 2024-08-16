package in.mh.beans;


public class Student {
	
	private String name;
	private int rollno;
	private Address address;
	
	public Student() {
		System.out.println("Student object created.");
	}
	
	public void setName(String name) {
		System.out.println("setName() method of Student object invoked.");
		this.name = name;
	}

	public void setRollno(int rollno) {
		System.out.println("setRollno() method of Student object invoked.");
		this.rollno = rollno;
	}
	
	public void setAddress(Address address) {
		System.out.println("setAddress() method of Student object invoked.\n");
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name	: " + name);
		System.out.println("Roll no	: " + rollno);
		System.out.println(address.toString());
		System.out.println();
	}
	
}

