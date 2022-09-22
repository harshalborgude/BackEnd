package org.hrb.specs;

import org.hrb.interfaces.EngineB;
import org.springframework.stereotype.Component;


//@component("V8Engineb") annotation have removed from here and added into AppConfig file with @Bean


public class V8b implements EngineB {

	@Override
	public String type() {
		
		return "V8 engine!";
	}

}
