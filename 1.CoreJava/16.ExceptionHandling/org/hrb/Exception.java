package org.hrb;

// Exception Handling is done to avoid errors that occur during the runtime of the program.
//  Hence in such cases, we take care of such exceptions to prevent the program from ending abruptly.
// The keyword “try” is used to specify a block where we must place the exception code. 
// A try block must be followed by a catch block, which means that we cannot use the try block alone.
// The “catch” block is used to handle the exception, it must be preceded by the try block. It means that we cannot use the catch block alone.
// the Exception catch block appears before the Arithmetic Exception Block then the latter will become unreachable as the Exception will catch all 
//	the thrown exceptions.
// All catch blocks should be ordered from the most specific to the most general. The catch for ArithmeticException must come before the catch for
//	Exception.

// Finally block
// The finally block is the block that always gets executed no matter the program throws an exception or not. But we have to follow some basic
//	conditions that the catch blocks always is after the throw block.
// This could be used to execute an important segment of code we always want the compiler to execute no matter what is the state of the exception.

public class Exception {
	
	public static void main(String[] args) {
		Exception obj = new Exception();
        obj.case2(10, 0);
	}
 
	public void case1(int x, int y) {
		if (y != 0) {
			System.out.println(x / y);
		}else{
			System.out.println("The value of y is 0");
		}
	}
 
	public void case2(int x, int y) {
		try{
		  System.out.println(x / y);
		}catch(ArithmeticException e ){
			System.out.println("The value of y is 0");
		}catch (RuntimeException e) {
			System.out.println("Inside exception block");
		}
		/*catch (Exception e) {
			System.out.println("Inside exception block");
		}*/
		finally{
			System.out.println("This will be get printed bcz of finally block");
			System.out.println();
		}
		
	}

}
