package org.hrb.cars;

import org.hrb.interfaces.Car;
import org.springframework.stereotype.Component;

@Component("swift")
public class Swift implements Car {

	public String specs() {
		return "Hatchback from Suzuki";
	}

}
