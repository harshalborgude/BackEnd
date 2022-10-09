package org.hrb.Throw;

import java.io.FileNotFoundException;

// Throws : Throws are used to suppress the error if the user doesn’t want to specify the try and catch block.
// Note that this doesn’t handle the error only suppresses it. It should be used only when the developer is sure that the error doesn’t occur.

// Throw : The throw is used to forcefully throw an error where it is decided by the developer regarding certain conditions.

// The keyword “throw” is used to throw an exception from any method or static block,
// while the keyword “throws”, used in a method declaration,indicates what exception can be thrown with this method. They are not interchangeable.
// We can use the keyword throws to delegate the responsibility of handling exceptions to the caller, then the caller method is responsible for
//	handling that exception.

// in below example , in some method , exception have thrown with throws and , throws throw it out of the class and its cached in calling method.
//To avoid this compile-time error, we can handle the exception in two ways:
//1)	By using try-catch block
//2) 	By using throws keyword
public class ThrowApp {

	public static void main(String[] args) {

		try {
			someMethod();
		} catch (FileNotFoundException e) {
			System.out.println("catch block of main method");

		}
	}

	public static void someMethod() throws FileNotFoundException {
		System.out.println("Message from someMethod");
		throw new FileNotFoundException();

	}

	/*
	 *
 	public static void main(String[] args) {
		someMethod();

	}

	public static void someMethod() {
		try {
	FileReader in = new FileReader("file.txt");
		} catch (FileNotFoundException e) {
			System.out.println("message from catch block");

		}
		System.out.println("Message from someMethod");
	}
	 */



}
