package org.hrb.controller;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/your")
public class MyController {
	
	@GetMapping("/message")
	public String getMessage() throws JSONException {
		
		JSONObject obj = new JSONObject();
		JSONArray array = new JSONArray();
		
		obj.put("name", "Dipali");
		obj.put("MiddleName", "Harshal");
		array.put(obj);
		
		return array.toString();
	}

}
