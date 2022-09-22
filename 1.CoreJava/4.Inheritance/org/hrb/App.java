package org.hrb;

//Extend - keywords are used to inherit the properties of the class.

// Inheritance is used to store information and manage the information in a hierarchical order.
// It is the process of defining a new class based on an existing class where a child class acquires the properties of the parent class.
// The subclass (Child/Derived class) inherits the properties of the parent class, and the class from which the properties are inherited is called a 
// Super Class
// Inheritance allows us to reuse code and improve the reusability in Java application so that a class has to write only the unique features and 
// the rest of the common properties and functionality can be extended by the other class.
// Super Class- Superclass is a class whose properties and behaviour are used by the child class.
// Sub Class- Subclass is a class that inherits the properties of another class.
// Reusability- Inheritance allows the reuse of code. When we create a new class and there is already a class that includes some common properties or 
// features that a class has to write. It can be driven to the new class from the existing class by reusing the field and method.
// Note: The advantage of Inheritance is that the code that already exists in a superclass can be reused in a sub/derived class.
// Parent class parameterized constructor is called in child class using super ().super () should be the written in the first line inside the constructor.
// toString() method is used to get a String representation of an object.

//******** Method overriding *********
// The method override is used for the runtime polymorphism. It helps to define a behavior that is specific to the subclass or child class type, 
// which means a subclass can implement a parent class based on your request.
// rules for method overriding
// The method must have the same name as in the parent class
// The method must be IS-A relationship(inheritance)
// The method must have the same parameters as in the parent class.

//******** Multiple Inheritance **********
// In Java, Single ( A-B ), Multilevel ( A-B-C) and Hierarchical (A-B , A-C , A-D) inheritances are only used .
// Multiple and Hybrid inheritance isn’t supported by Java.
// Single inheritance: One class extends to another class(only one class) is called Single inheritance.
// Multiple inheritance: If one class extending more than one class is called Multiple inheritance. Java does not allow multiple inheritance directly 
// through the class. For example: Class C extends Class A and Class B both.
// Note: To make use of this inheritance we need to implement the Interface concept.
// Hybrid inheritance:  A combination of Single and Multiple inheritance is called Hybrid inheritance. This inheritance is also not supported by Java.
// Multilevel inheritance: In Multilevel inheritance, if one class can inherit properties from a derived class. Hence, the derived class becomes 
// 	the base class for the new class.
// Hierarchical inheritance: If one base class property is inherited by several subclasses it is known as Hierarchical inheritance.
// Interfaces are used to perform multiple inheritances
// Extend - keywords are used to inherit the properties of the class.

public class App {

	public static void main(String[] args) {
		Bike bike = new Bike();
		// bike.handle = "short";
		// bike.engine = "Petrol";
		System.out.println("Handle: " + bike.getHandle());
		System.out.println("Engine type: " + bike.getEngine());

		Car car = new Car("Power steering", "dizel", 4, 4, 40, "LED");

		/*
		 * System.out.println("Steering: " + car.getSteering());
		 * System.out.println("Engine type: " + car.getEngine());
		 * System.out.println("Number of seats: " + car.getSeats());
		 * System.out.println("Fuel tank capacity: " + car.getFueTank());
		 * System.out.println("Head lamp type: " + car.getLights());
		 * System.out.println("Number of wheels: " + car.getWheels());
		 */
		
		System.out.println("car:"+car);
		car.run();

	}

}
