package in.mh.beans;

public class Address {
	
	private int houseNumber;
	private String city;
	private int pinCode;
	
	public Address() {
		System.out.println("Address object created.");
	}
	
	public void setHouseNumber(int houseNumber) {
		
		System.out.println("setHouseNumber() method invoked.");
		this.houseNumber = houseNumber;
	}

	public void setCity(String city) {
		
		System.out.println("setCity() method invoked.");
		this.city = city;
	}

	public void setPinCode(int pinCode) {
		
		System.out.println("setPinCode() method invoked.");
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "[" + "House Number: #" + houseNumber + ", City: " + city + ", Pin Code: " + pinCode + "]";
	}
	
	
}
