package org.hrb;

import org.hrb.cars.Corolla;
import org.hrb.cars.Swift;
import org.hrb.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		//Car swift = new Swift();
		
		//System.out.println(swift.specs());
		//System.out.println(corolla.specs());
		
        
		//Car myCar = new Swift();
		//System.out.println(myCar.specs());
		
		
		  AnnotationConfigApplicationContext context = new
		  AnnotationConfigApplicationContext(AppConfig.class);
		  
		  Car myCar = context.getBean("swift",Car.class);
		  //Car myCar = context.getBean("corolla",Car.class);
		  System.out.println(myCar.specs()); 
		  context.close();
		 
	}

}
