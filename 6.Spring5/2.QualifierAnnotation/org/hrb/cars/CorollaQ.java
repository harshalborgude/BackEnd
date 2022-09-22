package org.hrb.cars;

import org.hrb.interfaces.CarQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.hrb.interfaces.EngineQ;


@Component("corollaQ")
public class CorollaQ implements CarQ {
	
	// here if we use object name as engine , it will be ambuiguity between v6 and v8.
	// so if we use object name as v6 , it will take reference of V6 class by name.
	
	// here using Qualifier annotation , we can provide name of class, just by changing qualifier name , it will create object of that class.
	
	@Autowired
	@Qualifier("V8Engine")
	EngineQ engine;

		
	  public String specs() { 
		  String specs="Sedan from Toyota with engine type as :"+engine.type();
		  return specs; 
	  }
	 
}













