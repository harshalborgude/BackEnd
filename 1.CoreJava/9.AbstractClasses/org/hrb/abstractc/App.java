package org.hrb.abstractc;

// Abstract classes are created by using the abstract keyword in the class definition.
// An abstract class is used to achieve the abstraction. We can achieve 0 – 100% abstraction by using an abstract. (100% means interface/contract)
// An abstract class can have abstract and concrete method both.
// An abstract class cannot be instantiated, it means we cannot create an object of the class. We need a different class for the implementation of
//	the abstract class.
// Note: A class must be an abstract class to contain an abstract method.
// concrete class (a class which does not contain any abstract method in it) must extend the abstract class to implement the abstract method.
// 	As soon as we extend an abstract class, Java displays an error message to implements the abstract method of the class.


/* Abstract Class
	- A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods
		(method with the body).

	Abstraction in Java
	- Abstraction is a process of hiding the implementation details and showing only functionality to the user.
	- Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text
		and send the message. You don't know the internal processing about the message delivery.
	- Abstraction lets you focus on what the object does instead of how it does it.
	There are two ways to achieve abstraction in java
		1) Abstract class (0 to 100%)
		2) Interface (100%)

	Abstract class in Java
	- A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended
	 	and its method implemented. It cannot be instantiated.

	Points to Remember
	- An abstract class must be declared with an abstract keyword.
	- It can have abstract and non-abstract methods.
	- It cannot be instantiated.
	- It can have constructors and static methods also.
	- It can have final methods which will force the subclass not to change the body of the method.

*/


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
