package org.hrb;

// Final keyword can be applied to variables, methods, classes, etc
// It is used in various contexts to define an entity that can only be assigned once.
// Once a final variable has been assigned, the variable cannot be changed.
// A variable that is not initialized at the time of declaration is known as a final blank variable. We must initialize the final variable in the
// 	constructor of the class, otherwise, it will throw a compilation error.


class B extends A{
	private final int x;


	public B(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}

}
class A {

}

public class Final {

	public static void main(String[] args) {

		B obj1 = new B(12);
		System.out.println(obj1.getX());


	}

}
