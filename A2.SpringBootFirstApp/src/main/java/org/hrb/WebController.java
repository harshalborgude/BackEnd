package org.hrb;

import org.apache.tomcat.util.http.parser.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	final static Logger log= LoggerFactory.getLogger(WebController.class);

	@RequestMapping("welcome")
	public String welcome() {
		System.out.println("Inside Controller!");
		log.debug("First Log");
		return "welcome Spring Boot";
	}
	
}
