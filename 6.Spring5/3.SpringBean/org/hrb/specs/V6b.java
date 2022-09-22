package org.hrb.specs;

import org.hrb.interfaces.EngineB;
import org.springframework.stereotype.Component;

// @component("V6Engineb") annotation have removed from here and added into AppConfig file with @Bean

public class V6b implements EngineB {

	@Override
	public String type() {
		
		return "V6 engine!";
	}

}
