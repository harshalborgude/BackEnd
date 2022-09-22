package org.hrb.cars;

import org.hrb.interfaces.CarB;
import org.springframework.stereotype.Component;


public class SwiftB implements CarB {

	public String specs() {
		return "Hatchback from Suzuki";
	}

}
