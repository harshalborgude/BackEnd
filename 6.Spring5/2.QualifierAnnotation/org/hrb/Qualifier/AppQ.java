package org.hrb.Qualifier;

import org.hrb.Bean.AppConfig;
import org.hrb.cars.CorollaQ;
import org.hrb.cars.SwiftQ;
import org.hrb.interfaces.CarQ;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppQ {

	public static void main(String[] args) {
	
		
		  AnnotationConfigApplicationContext context = new
		  AnnotationConfigApplicationContext(AppConfig.class);	
		  
		 // Car myCar = context.getBean("swift",Car.class);
		 
		  CarQ myCar = context.getBean("corollaQ",CarQ.class);
		  System.out.println(myCar.specs()); 
		  context.close();
		 
	}

}
