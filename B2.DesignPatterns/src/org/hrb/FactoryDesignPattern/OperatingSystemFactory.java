package org.hrb.FactoryDesignPattern;

public class OperatingSystemFactory {
	
	public OS getInstance(String str) {
		
		if(str.equals("Powerfull")) {
			return new Android();
		}
		else if(str.equals("Secured")) {
			return new IOS();
		}
		else 
			return new Windows();
	}

}
