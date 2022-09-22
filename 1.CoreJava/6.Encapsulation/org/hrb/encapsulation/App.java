package org.hrb.encapsulation;

// Encapsulation is the process of binding the class members (variables and methods) into a single unit. It protects the data of class to be 
//	accessed from outside the class.
// In Encapsulation, we hide the implementation details from the outer class and provided them the controlled access to the class.
// Encapsulation can be achieved by declaring the instance variables as private.However, we can access the private variable through the getter and 
//	setter method. 


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
