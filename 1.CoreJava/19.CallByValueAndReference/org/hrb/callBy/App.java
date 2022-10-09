package org.hrb.callBy;

// Call by value means to call a method with a parameter as a value. Through this, the value of the argument is passed to the parameter.
// Call by reference means call a method with a parameter as a reference. Through this, argument reference is used to pass the parameter.

// By while passing the value by reference, (such as we pass a pointer to the memory location in C) we can pass the array (which by default passes
//	the address) so that the change can be seen in the variable.
// call by ref is bydefault done.

public class App {

	public static void main(String[] args) {
		String[] names = { "Chaand", "John", "Steve", "Pooja", "Rahul" };
		String[] name2 = new String[5];
		name2[0]="char";
		System.out.println(name2[0]);
		App app = new App();
		app.displayNames(names);

	}

	void displayNames(String[] names) {

		for (String name : names) {
			System.out.println(name);
		}
		names[0] = "Salim";
	}

}
