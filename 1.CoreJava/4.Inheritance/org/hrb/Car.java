package org.hrb;

public class Car extends Vehicle {

	public String steering;
	public String musicSystem;
	public String airConditioner;
	public String fridge;
	public String entertainmentSystem;
	
	public Car() {
		super();
		this.steering = "Power Steering";
	}
	public Car(String steering, String engine, int wheels, int seats, int fueTank, String lights) {
		super(engine,wheels, seats,fueTank,lights);
		this.steering = steering;
	}
	public String getSteering() {
		return steering;
	}
	@Override
	public String toString() {
		return "Car [steering=" + steering + ", musicSystem=" + musicSystem + ", airConditioner=" + airConditioner
				+ ", fridge=" + fridge + ", entertainmentSystem=" + entertainmentSystem + ", engine=" + engine
				+ ", wheels=" + wheels + ", seats=" + seats + ", fueTank=" + fueTank + ", lights=" + lights + "]";
	}
	
	public void run() {
		System.out.println("Running car");
		//System.out.println(toString());
		}
	
	
}
