package in.mh.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.mh.beans.Address;
import in.mh.beans.Student;
import in.mh.beans.Subjects;

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
//		std.setSubjects(createSubjectObject()); // manual dependency injection
		
		return std;
	}
	
	@Bean
	public Subjects createSubjectObject()
	{
		Subjects sub = new Subjects();
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("C/C++");
		list.add("Javascript");
		
		sub.setSubjects(list);
		
		return sub;
	}
}
