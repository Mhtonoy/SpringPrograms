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
		Address address = new Address(1196, "Cumilla", 3500);
		return address;
	}
	
	@Bean
	public Student createStudentObject()
	{
		Student std = new Student(102, "Tonoy", createAddressObject());
		return std;
	}

}
