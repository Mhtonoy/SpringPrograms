package in.mh.beans;

public class Address 
{
	private int houseno;
	private String city;
	private int pincode;
	
	public Address()
	{
		System.out.println("Address object created through no-argument constructor.");
	}
	
	public void setHouseno(int houseno) {
		System.out.println("setHouseno() method invoked.");
		this.houseno = houseno;
	}
	public void setCity(String city) {
		this.city = city;
		System.out.println("setCity() method invoked.");
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
		System.out.println("setPincode() method invoked.");
	}
	
	@Override
	public String toString() {
		return "Houseno = #" + houseno + ", City = " + city + ", Pincode = " + pincode;
	}
		
}
