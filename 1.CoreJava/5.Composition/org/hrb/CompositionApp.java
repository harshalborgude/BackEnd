package org.hrb;

// In inheritance, we deal with the attributes of other classes. Composition studies have a relationship in which we ‘inherit’ or use objects
//	from other classes.
// The composition is the design technique to implement has-a relationship between different types of object/classes.
// In inheritance, we can derive some functionality to a subclass of the parent class, in the composition a class reuses the functionality by
//	creating a reference to the object of the class.
// the classes inherit the objects of other classes
// By using composition, we can control the visibility of another object for customer classes and reuse only what we need.
// The composition allows the creation of backend classes when necessary.


public class CompositionApp {

	public static void main(String[] args) {
		Laptop lappy = new Laptop();
		System.out.println(lappy.getProcessor().getBrand());

	}

}
