package org.hrb.encapsulation;

// Encapsulation

// Encapsulation is the process of binding the class members (variables and methods) into a single unit. It protects the data of class to be
//	accessed from outside the class.
// In Encapsulation, we hide the implementation details from the outer class and provided them the controlled access to the class.
// Encapsulation can be achieved by declaring the instance variables as private.However, we can access the private variable through the getter and
//	setter method.


/* Abstraction in java

	 *  Abstract Class
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
	- A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.

	Points to Remember
	- An abstract class must be declared with an abstract keyword.
	- It can have abstract and non-abstract methods.
	- It cannot be instantiated.
	- It can have constructors and static methods also.
	- It can have final methods which will force the subclass not to change the body of the method.

*/


public class App {

public static void main(String[] args) {

		Person john = new Person();
		john.setName ("John");
		john.setAge (-10);
		john.setGender ("Male");

		System.out.println (john.getName());
		System.out.println (john.getAge());
		System.out.println (john.getGender());

	}

}
