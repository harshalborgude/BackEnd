package org.hrb.FactoryDesignPattern;

// In this pattern we are not exposing class names to create it's object , we are getting object by passing some strings to 
//	OperatingSystemFactory's Object , and that Factory Objects created Objects for us using some strings or method's
// How it is creating objects internally it is totally hidden from us , This pattern called as "Factory Design Pattern"


public class FactoryDesignPatternApp {

	public static void main(String[] args) {
		
		OperatingSystemFactory osFactory = new OperatingSystemFactory();
		
//		OS object = osFactory.getInstance("Powerfull");
//		OS object = osFactory.getInstance("Secured");
		OS object = osFactory.getInstance("Any");
		
		object.getSpecs();
		
	}

}
