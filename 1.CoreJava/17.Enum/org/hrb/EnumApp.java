package org.hrb;

// Enum is used to define a set of constants in java.
// Not only constant by it could also call any method, constructor associated with it.
// We should always use enum when a variable (especially a method parameter) can only take one from a small set of possible values.
// Enum is default public static hence we can directly reference variable by Enum Name.

public class EnumApp {
	
public static void main(String[] args) {
		
		Learning learn = Learning.COREJAVA;
		
		switch(learn){
		case COLLECTIONS:
			System.out.println("Step 2 : Learning Collections framework");
			break;
		case COREJAVA:
			System.out.println("Step 1 : learning Core Java");
			break;
		case GENERICS:
			System.out.println("Step 3 : Learning Generics ");
			break;
		case JSPANDSERVLETS:
			System.out.println("Step 4 : Learning JSP and Servlets");
			break;
		case MUILTITHREADING:
			System.out.println("Step 5 : Learning MuiltThreading");
			break;
		default:
			System.out.println("Element not in the enumarated list");
			break;
		
		}
		
	}

}


// defining enum independantly
 enum Learning {
	COREJAVA,COLLECTIONS,GENERICS,JSPANDSERVLETS,MUILTITHREADING
	
}