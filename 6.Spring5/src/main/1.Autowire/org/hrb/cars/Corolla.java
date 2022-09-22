package org.hrb.cars;

import org.hrb.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



// with this component annotation , bean will identify this class.
// with Component annotation , it will have name of that class in small case.\

@Component("corolla")
public class Corolla implements Car {

	
	// here creating object with new keyword,instead we will create by spring.
	// here bcz of @Autowired , and @Component for class Engine , spring will create object by itself.
	// Autowire makes use of default constructor.
	// required flag tells that object may be required or may not be required.
	// we can make use of Autowired on property or on constructor are same , but if we are using setters.
	// But if we dont use Autowired on setter instead property , we will get old value only.
	
	//@Autowired(required=false)
	@Autowired()
	Engine engine;
	
	//@Autowired	
	public Corolla(Engine engine) {
		engine.type="new v8 version";
		this.engine = engine;
	}

	/*// Autowired is required for setters instead property itself, otherwise spring will ignore.
	 * @Autowired
	 * public void setEngine(Engine engine) {
	 *  engine.type="new v8 version";
	 * this.engine = engine;
	 *  }
	 */


	public String specs() {
		String specs= "Sedan from Toyota with engine type as :"+engine.getType();
		return specs;
	}

}













