package in.mh.beans;

public class Address {
	
	private int houseNumber;
	private String city;
	private int pincode;
	
	public Address(int houseNumber, String city, int pincode) {
		//super();
		System.out.println("Address object costructor invoked.\n");
		this.houseNumber = houseNumber;
		this.city = city;
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address : [House Number : #" + houseNumber + ", City : " + city + ", Pin Code: " + pincode + "]";
	}
	
	
}
