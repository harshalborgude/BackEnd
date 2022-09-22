package org.hrb;

// For loop is used when we know the number of iterations. For example when we are sure that how many times we need to execute a loop.
// While loop is used when we are unsure about the number of iteration and want to loop while some condition is true. It will loop that block until the condition is false.
// In Java Do While loop, the expression is evaluated at the end of the loop so even if the expression returns false, statements inside the code block will be executed at least once.
// Use while loop when a loop might not be executed at all.
// Use do-while loop when the loop is executed at least once.
// continue statements are used. Generally, the continue statement ends the current iteration of the loop.

public class Loops {
	
	
	public static void main(String[] args) {
		
		/*// Infinite for loop
		for ( ; ; ) {
			System.out.println("Testing text");
		}*/

		/*// Infinite while loop
		while (true) {
			System.out.println("Infinite loop");
			// break;
		}*/
		
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	
	}

}
