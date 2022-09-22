package org.hrb.store;

import org.hrb.device.Device;
import org.hrb.device.Devices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;


// Hitting url of another microservice and get results in this microservice - uses RestTemplate object
@Controller
public class Store {
	
	private Devices devices;
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/{brandName}")
	public Devices getBrands(@PathVariable("brandName")String brandName) {
		
		
		
		// store2 - localhost:8082
		// this store2 is registed on eureka so will get its name
		devices=restTemplate.getForObject("http://STORETWO/samsung/devices", Devices.class);
		System.out.println("devices for "+brandName+" :"+devices);
		return devices;
		
	}
	
}
