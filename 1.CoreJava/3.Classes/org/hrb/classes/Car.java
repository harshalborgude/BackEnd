package org.hrb.classes;

//Classes are the blueprint of object creation. Classes are the user-defined implementation of real-life scenarios. 

// A class defines the state and behaviour of an object.// private variable of object can not be accessible outside the class.
// A constructor is a special method that does not has any return type.
// If you do not have any constructor in your class, Java compiler adds a default constructor to the class during compilation.
// Parameterized Constructor – Constructor which accepts the parameters is called the parameterized constructor.
// Note: If you add a parameterized constructor in the class then no default constructor will be added by JVM.

public class Car {

	private String doors;
	private String engine;
	private String drivers;
	public int speed;

	public void Car() {

	}

	public void Car(String doors, String engine, String Drivers) {
		this.doors = doors;
		this.engine = engine;
		this.drivers = drivers;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDrivers() {
		return drivers;
	}

	public void setDrivers(String drivers) {
		this.drivers = drivers;
	}

	int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String run() {
		if (doors.equals("closed") && engine.equals("on") && drivers.equals("seated") && speed > 0) {
			return "car is running";
		} else {
			return "car is not running";
		}

	}
}
