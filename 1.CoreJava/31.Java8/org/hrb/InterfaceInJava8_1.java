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
 * 5) But if we extends class C , and implements infaces A and B , and both interfaces have default show() method ,
 * 		then object of that class prefers show method of class instead of interfaces.
 * 6) In method overriding , priority is always to class methods , not to interface methods. 
 * 
 * * Static :
 * Static methods inside interfaces also works same as default methods of interfaces.
 * 
 */

public class InterfaceInJava8_1 {

}
