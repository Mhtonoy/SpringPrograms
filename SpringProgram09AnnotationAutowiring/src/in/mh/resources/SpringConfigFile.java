package in.mh.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.mh.beans.Address;
import in.mh.beans.Student;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public Address createAddressObject()
	{
		Address addr = new Address();
		addr.setCity("Cumilla");
		addr.setHouseno(1196);
		addr.setPincode(3500);
		
		return addr;
	}
	
	@Bean
	public Student createStudentObject()
	{
		Student std = new Student();
//		std.setAddress(createAddressObject());  // manual dependency injection
		std.setName("Mozammal");
		std.setRollno(1001);
		
		return std;
	}
}
