package in.mh.beans;

public class Student {
	
	private String name;
	private int rollno;
	private String email;
	
	public Student() {
		System.out.println("Student object created.");
	}
	
	public void setName(String name) {
		System.out.println("setName() method invoked.");
		this.name = name;
	}
	
	public void setRollno(int rollno) {
		System.out.println("setRollno() method invoked.");
		this.rollno = rollno;
	}
	
	public void setEmail(String email) {
		System.out.println("setEmail() method invoked.\n");
		this.email = email;
	}
	
	public void display() {
		System.out.println("Name	: " + name);
		System.out.println("Roll no	: " + rollno);
		System.out.println("Email	: " + email);
		System.out.println();
	}
}
