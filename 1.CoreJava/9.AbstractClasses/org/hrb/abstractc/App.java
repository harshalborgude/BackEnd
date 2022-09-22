package org.hrb.abstractc;

// Abstract classes are created by using the abstract keyword in the class definition.
// An abstract class is used to achieve the abstraction. We can achieve 0 – 100% abstraction by using an abstract.
// An abstract class can have abstract and concrete method both.
// An abstract class cannot be instantiated, it means we cannot create an object of the class. We need a different class for the implementation of 
//	the abstract class.
// Note: A class must be an abstract class to contain an abstract method.
// concrete class (a class which does not contain any abstract method in it) must extend the abstract class to implement the abstract method.
// 	As soon as we extend an abstract class, Java displays an error message to implements the abstract method of the class.
// 
// 

public class App {
	
	public static void main(String[] args) {
		Person john = new Vegan();
		john.speak();
		john.eat();
		System.out.println("=======================");
		Person mia = new NonVegan();
		mia.speak();
		mia.eat();
		
	}
}
