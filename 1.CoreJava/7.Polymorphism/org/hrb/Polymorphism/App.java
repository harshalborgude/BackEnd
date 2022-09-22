package org.hrb.Polymorphism;

// Polymorphism in simple words means to have multiple forms of a single entity.
// the same function depicting a different output when referenced by the object of the different class is shown.


public class App {
	
public static void main(String[] args) {
		
		Phone note8 = new SamsungNote8("Note 8");
		System.out.println(note8.getModel());
		note8.features();
		
		
		
		Phone nokia3310 = new Nokia3310("Nokia 3310");
		System.out.println(nokia3310.getModel());
		nokia3310.features();
		
		
	}

}
