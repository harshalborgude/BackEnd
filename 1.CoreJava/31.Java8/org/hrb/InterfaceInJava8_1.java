package org.hrb;


/*
 * 1) Before java 8 , we had only interface and abstract classes , in interface we can only declare methods not define.
 * 		and default modifier for those methods are public abstract.
 * 2) In abstract class , we can define and declare method as per need.
 *
 * * Default :
 * 3) But From Java 8 , methods can be defined in interfaces with Default and Static words with defination.
 * 4) If we defined 2 interfaces and have method default show(){..} method with some defination and try to implement both interfaces
 * 		in other 3rd class , then it will create ambiguity and will not able implement multiple inheritance in java 8 also ,
 * 		so the solution is , we have to define new show() method in implemented class and its object will refer that show method ,
 * 		it will not check both show() methods from those 2 implemented interfaces.
 * 5) But if we extends class C , and implements interfaces A and B , and both interfaces have default show() method ,
 * 		then object of that class prefers show method of class instead of interfaces.
 * 6) In method overriding , priority is always to class methods , not to interface methods.
 *
 * * Static :
 * Static methods inside interfaces also works same as default methods of interfaces.
 *
 */

// Difference between Default method and Static method :
/*
	- Default methods enable you to add new functionality to the interfaces of your libraries and ensure binary compatibility with code written 
		for older versions of those interfaces.
	- A static method is a method that is associated with the class in which it is defined rather than with any object. Every instance of the 
		class shares its static methods.
	- Static method in interface are part of the interface class can’t implement or override it whereas class can override the default method.

 
// What is functional Interface : refer FunctionalInterfaces_7.java file

 	- A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. 
	- From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. 
	- A functional interface can have any number of default methods. Runnable, ActionListener, Comparable are some of the examples of functional 
		interfaces.
	 Ex :  Runnable,Comparable, ActionListener
	- will be anotated with @FunctionalInterface
	- Functional interfaces are interfaces that ensure that they include precisely only one abstract method.
	- As described earlier, functional interfaces can contain only one abstract method. However, they can include any quantity of default and 
		static methods. 
	- In Functional interfaces, there is no need to use the abstract keyword as it is optional to use the abstract keyword because, by default, 
		the method defined inside the interface is abstract only.
	- We can also call Lambda expressions as the instance of functional interface.
	- @FunctionalInterface annotation is used to ensure that the functional interface can’t have more than one abstract method.
	- In case more than one abstract methods are present, the compiler flags an ‘Unexpected @FunctionalInterface annotation’
	
	- Since Java SE 1.8 onwards, there are many interfaces that are converted into functional interface. All these interfaces are annotated with 
		@FunctionalInterface. These interfaces are as follows – 
		1) Runnable –> This interface only contains the run() method.
		2) Comparable –> This interface only contains the compareTo() method.
		3) ActionListener –> This interface only contains the actionPerformed() method.
		4) Callable –> This interface only contains the call() method.
		
	- If more than one functional interface, that interface will not be called a functional interface. It is called a non-functional interface.
	- There is no such need for the @FunctionalInterface annotation as it is voluntary only. This is written because it helps in checking the 
		compiler level. Besides this, it is optional.
	- An infinite number of methods (whether static or default) can be added to the functional interface. In simple words, there is no limit to 
		a functional interface containing static and default methods.
	
	

// What is predicate in java8 ?
 	
 	- There are some predefined functional interface in Java like Predicate, consumer, supplier etc.
 	- Predicate having some methods like 
 		test(T t) - used in filter() method.
 		or(Predicate other)
 		isEqual(Object targetRef)
 		and(Predicate other)


// What are the marker interfaces in java?
 
 	- A marker interface is an interface that has no methods or constants inside it (empty interface)
 	
 	1) Serializable - To serialize the object of that class this marker interface is used
 	2) Cloneable - By implementing Cloneable interface we make sure that instances of class A can be cloned.
 		
 	Cloneable interface is present in java.lang package. There is a method clone() in Object class. A class that implements the Cloneable 
 	interface indicates that it is legal for clone() method to make a field-for-field copy of instances of that class. 
 		

*/


public class InterfaceInJava8_1 {

}
