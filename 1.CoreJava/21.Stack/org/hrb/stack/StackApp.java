package org.hrb.stack;

import java.util.Stack;

//Stack 
//java Stack is a LIFO (Last in first out) object.
//Extends the Vector class but supports only five operations.
//he Java stack class only has one constructor that is empty or the default constructor.
//peek() , pop() , push(),search() , Empty()
//Peek() method is used to check the last element of the stack.
//pop() method is always performed on the top of stack element. If we perform pop() operation, it will remove the top element of the stack.
//Search() method returns  1 if it finds the searched element and it returns -1 if it does not find the searched element.


public class StackApp {
	
	public static void main(String[] args) {
		Stack<Integer> demo = new Stack<>();
		demo.push(0);
		demo.push(1);
		demo.push(2);
		demo.push(3);
		demo.push(4);
		demo.push(5);
		
		for(Integer temp:demo) {
			System.out.println(temp);
		}
		
		
	}

}
