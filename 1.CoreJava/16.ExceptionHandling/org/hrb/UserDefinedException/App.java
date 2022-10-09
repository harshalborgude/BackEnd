package org.hrb.UserDefinedException;

import java.io.FileNotFoundException;

// class should extends exception class : class UserDefinedException extends Exception { }
// All exception should be a child of Throwable.
// If you want to write a checked exception that is automatically enforced by the Handle or declare rule, you must extend the Exception class.

// Java makes this division of exceptions depending on the level of importance of the exception. The checked exceptions are handled by the java
//	compiler itself and the unchecked exception are handled by the user (not mandatory) in case of occurrence of such exceptions.
// checked exceptions : FileNotFoundException
// unchecked exceptions : ArithmeticException

public class App {

	public static void main(String[] args) {
		try {
			someMethod();
		} catch (FileNotFoundException e) {
			System.out.println("catch block of main method(FileNotFoundException)");
		} catch (UserDefinedException e){
			System.out.println("catch block of main method (UserDefined Exception)");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("catch block of main method (Exception)");
		}

	}

	public static void someMethod() throws Exception,FileNotFoundException, UserDefinedException {
		int x = 3;

		switch (x) {
		case 1:
			throw new FileNotFoundException();

		case 2:
			throw new Exception();
		default:
				throw new UserDefinedException();
		}

	}
}
