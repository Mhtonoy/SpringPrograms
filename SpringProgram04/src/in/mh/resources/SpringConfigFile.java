package in.mh.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

//@ComponentScan("in.mh.beans")
//@ComponentScan({"in.mh.beans"})
@ComponentScan(basePackages = {"in.mh.beans"})
public class SpringConfigFile {

	
	
}









//@ComponentScan annotation is used to instruct the Spring framework to perform component scanning and then
//register them as Spring beans for further use.