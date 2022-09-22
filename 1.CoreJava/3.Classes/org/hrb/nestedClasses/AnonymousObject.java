package org.hrb.nestedClasses;

// The anonymous object simply means creating a new Object without assigning it to a reference. 
// Hence this could be used only once in the execution of a program as it is not referenced to any object.
// Java anonymous inner class can be created in two ways, it can be abstract or concrete.
// The class that has no name and that is used to overwrite an interface or an abstract method is called an anonymous inner class.

// Advantage of Inner Class
// When we declare a class within a class, the inner class can access all the private members, in addition to the inner class, it can hide from the outside world.
// The inner class could be used only by outer class. Inner classes represent a special type of relationship that allows access to all members (data members and methods) of the outer class, including the private class.
// Inner classes are used to develop a more readable and maintainable code because they logically group classes and interfaces in one place.
// Easy access, as the inner object, is implicitly available inside an outer Code optimization requires less code to write. It can avoid having a separate class.


class Door1{
	
	public boolean isLocked(String key) {
		 
		class Lock {
			public boolean isLocked(String key) {
				if (key.equals("qwerty")) {
					return false;
				} else {
					return true;
				}
			}
		}
		return new Lock().isLocked(key);
	}

}
public class AnonymousObject {   
    public static void main(String[] args) {
		
		//Door door = new Door();
		
		if(new Door1().isLocked("true")) {
		System.out.println("Shop has closed, visit later");
	}else{
		System.out.println("Welcome, we are open :)");
	}
	
		
	}
}