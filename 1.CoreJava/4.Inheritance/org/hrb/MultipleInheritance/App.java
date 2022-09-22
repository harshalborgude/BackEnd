package org.hrb.MultipleInheritance;

public class App {
	
	public static void main(String[] args) {
		Person john = new Vegan();
		john.breathe();
		john.eat();
		john.speak();
		john.message();
	}

}
