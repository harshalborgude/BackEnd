package org.hrb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Spring boot dont support jsp and if HTML pages are there it is considered as homepage
// In spring boot embedded tomcat is used - so no need to deploy that application in web server.
// In application.property file we can overwrite properties
// @RestController is important annotation to implement a restfull API

@SpringBootApplication
public class BlogApp {

	public static void main(String[] args) {
		
		SpringApplication.run(BlogApp.class, args);

		//1. This below line loads the defaults
		//2. Starts the spring boot app
		//3. performs the class path scan - when app is started then spring boot will scan all the classes and paths
		// if @controller annotation is there then will consider that class as controller
		//4. starts local tomcat - This 4 things are taken care by Spring boot
	}

}
