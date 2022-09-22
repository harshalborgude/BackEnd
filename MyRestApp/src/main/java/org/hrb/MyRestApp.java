package org.hrb;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping("/my")
public class MyRestApp {

	public static void main(String[] args) {
		SpringApplication.run(MyRestApp.class, args);
	}
	
	@GetMapping("/message")
	public String getMessage() throws JSONException {
		
		JSONObject obj = new JSONObject();
//		JSONArray arr = new JSONArray();
		
		obj.put("name", "harshal");
		
		return obj.toString();
	}

}
