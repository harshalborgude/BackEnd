package org.hrb.cars;

import org.springframework.stereotype.Component;

// by marking class as Component , String will be able to make object by itself.
@Component
public class Engine {
	
	String type;

	public Engine() {
		
		this.type = "V8";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
