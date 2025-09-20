package in.mh.beans;

public class Address 
{
	private int houseno;
	private String city;
	private int pincode;
	
	public Address(int houseno, String city, int pincode)
	{
		System.out.println("Address object created through constructor.");
		this.houseno = houseno;
		this.city = city;
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Houseno = #" + houseno + ", City = " + city + ", Pincode = " + pincode;
	}
		
}
