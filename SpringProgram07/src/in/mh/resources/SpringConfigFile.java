package in.mh.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.mh.beans.Address;
import in.mh.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddressObject() {
		
		Address addr = new Address();
		
		addr.setCity("Cumilla");
		addr.setHouseNumber(223);
		addr.setPinCode(1196);
		
		return addr;
	}
	
	@Bean
	public Student createStudentObject() {
		
		Student std = new Student();
		
		std.setName("Mozammal");
		std.setRollno(111);
		std.setAddress(createAddressObject());
		
		return std;
	}

}

/*
 *	@Configuration in Spring marks a class as providing bean definitions for the application
 *	context, enabling Java-based configuration. 
 *
 *	@Bean in Spring marks a method to produce a bean object which is managed by the Spring Container.
 *
 *	If **@Bean** is not mentioned then object will not be created.
 */