package in.mh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.mh.beans.Student;

public class Main {

	public static void main(String[] args) {
		
		String config_loc = "/in/mh/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student std1 = (Student) context.getBean("stdId1");
		std1.display();
		
		Student std2 = (Student) context.getBean("stdId2");
		std2.display();
		

	}

}
