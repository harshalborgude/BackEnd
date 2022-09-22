package org.hrb.cars;

import org.hrb.interfaces.CarB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.hrb.interfaces.EngineB;

// @component was removed as this annoations have added in AppConfig class with @Bean

public class CorollaB implements CarB {
	
	
	
	@Autowired
	@Qualifier("V8Engineb")
	EngineB engine;

		
	  public String specs() { 
		  String specs="Sedan from Toyota with engine type as :"+engine.type();
		  return specs; 
	  }
	 
}













