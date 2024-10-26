package in.mh.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

//@ComponentScan("in.mh.beans")
//@ComponentScan({"in.mh.beans"})
@ComponentScan(basePackages = {"in.mh.beans"})
public class SpringConfigFile {

	
	
}
/*
 * @ComponentScan annotation is used to instruct the Spring framework to perform
 * component scanning. It will scans specified packages in the application
 * classpath for the classes annotated with annotations
 * like @Component, @Service, @Repository & @Controller and then registered them
 * as Spring beans for further use.
 */