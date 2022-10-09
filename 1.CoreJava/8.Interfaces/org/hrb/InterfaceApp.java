package org.hrb;

// Interfaces serve as an outline of the class ‘implementing it'(inherit). The members declared in it are public, static by default.
// If any method (abstract by default) is not declared in the class implementing it then the class has to declared as abstract.
// Phone is interface and using it we can create object of any of it's implementation.Like parent class.
// Interfaces are used to perform multiple inheritances

public class InterfaceApp {

	public static void main(String[] args) {
		Phone phone = new OnePlus5();
		System.out.println("Processor: "+phone.processor());
		System.out.println("Space in GB: "+phone.spaceInGB());
		System.out.println("Os: "+phone.OS());

		Phone phone1 = new Iphone8();
		System.out.println("Processor: "+phone1.processor());
		System.out.println("Space in GB: "+phone1.spaceInGB());
		System.out.println("Os: "+phone1.OS());
	}

}
