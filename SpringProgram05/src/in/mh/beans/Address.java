package in.mh.beans;

public class Address {
	
	private int houseNumber;
	private String city;
	private int pincode;
	
	public Address() {
		System.out.println("Address object created through no-argument constructor.");
	}
	
	public void setHouseNumber(int houseNumber) {
		System.out.println("setHouseNumber() method of Address object invoked.");
		this.houseNumber = houseNumber;
	}
	public void setCity(String city) {
		System.out.println("setCity() method of Address object invoked.");
		this.city = city;
	}
	public void setPincode(int pincode) {
		System.out.println("setPincode() method of Address object invoked.");
		this.pincode = pincode;
		System.out.println();
	}
	@Override
	public String toString() {
		return "Address : [House Number: #" + houseNumber + ", City: " + city + ", Pincode: " + pincode + "]";
	}
	
	
}
