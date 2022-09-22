package org.hrb.Bean;

import org.hrb.Bean.AppConfig;
import org.hrb.cars.CorollaB;
import org.hrb.cars.SwiftB;
import org.hrb.interfaces.CarB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppB {

	public static void main(String[] args) {
	
		
		  AnnotationConfigApplicationContext context = new
		  AnnotationConfigApplicationContext(AppConfig.class);	
		  
		 // CarB myCar = context.getBean("swiftB",CarB.class);
		 
		  CarB myCar = context.getBean("corollaB",CarB.class);
		  System.out.println(myCar.specs()); 
		  context.close();
		 
	}

}
