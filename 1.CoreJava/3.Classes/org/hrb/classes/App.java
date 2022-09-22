package org.hrb.classes;

public class App {
	
	public static void main(String[] args) {
		Car obj = new Car();
		obj.setSpeed (10);
		obj.setDoors ("closed");
		obj.setEngine ("on");
		obj.setDrivers ("seated");
		System.out.println(obj.run());
		
	}

}
