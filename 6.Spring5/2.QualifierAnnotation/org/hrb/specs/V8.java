package org.hrb.specs;

import org.hrb.interfaces.EngineQ;
import org.springframework.stereotype.Component;


//here we can give name of the class which helps in autowiring.
@Component("V8Engine")
public class V8 implements EngineQ {

	@Override
	public String type() {
		
		return "V8 engine!";
	}

}
