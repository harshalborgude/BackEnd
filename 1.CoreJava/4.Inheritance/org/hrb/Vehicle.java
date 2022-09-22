package org.hrb;

public class Vehicle {

	public String engine;
	public int wheels;
	public int seats;
	public int fueTank;
	public String lights;
	
	public Vehicle() {
		this.engine = "petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fueTank = 35;
		this.lights = "LED";
 
	}
 
	public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {
		 
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fueTank = fueTank;
		this.lights = lights;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getFueTank() {
		return fueTank;
	}

	public void setFueTank(int fueTank) {
		this.fueTank = fueTank;
	}

	public String getLights() {
		return lights;
	}

	public void setLights(String lights) {
		this.lights = lights;
	}
	
	public void run() {
		System.out.println( "Running vehicle");
	}

}
