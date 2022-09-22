package org.hrb.cars;

import org.hrb.interfaces.CarQ;
import org.springframework.stereotype.Component;

@Component("swiftQ")
public class SwiftQ implements CarQ {

	public String specs() {
		return "Hatchback from Suzuki";
	}

}
