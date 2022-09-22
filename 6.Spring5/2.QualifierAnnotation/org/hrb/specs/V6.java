package org.hrb.specs;

import org.hrb.interfaces.EngineQ;
import org.springframework.stereotype.Component;

@Component("V6Engine")
public class V6 implements EngineQ {

	@Override
	public String type() {
		
		return "V6 engine!";
	}

}
