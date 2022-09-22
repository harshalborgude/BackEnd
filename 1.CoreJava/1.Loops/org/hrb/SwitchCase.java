package org.hrb;

// It is not necessary to write case statements in sequence.
// Only int, char, String, and Enum are allowed as switch expressions.
// lower case and upper case characters are evaluated differently.
// string cases are case sensitive so better to convert it into lower case.

public class SwitchCase {
	
	public static void main(String[] args) {
		/* INT 
		int x = 3;
		switch (x) {
		case 1:
			System.out.println ("The value of x is 1");
			break;
		case 2: 
			System.out.println ("The value of x is 2");
			break;
		case 3:
			System.out.println ("The value of x is 3");
			break;
		default:
			System.out.println ("The value of x is other than 1, 2, 3");
			break;
		}*/
		
		/* Char
		char x = 'a';
		switch (x) {
		case 'a':
		case 'A':
			System.out.println("The value of x is a");
			break;
		case 'b':
		case 'B:
			System.out.println("The value of x is b");
			break;
		case 'c':
		case 'C':
			System.out.println ("The value of x is c");
			break;
		default:
			System.out.println ("The value of x is other than a, b, c");
			break;
		}*/
		
		// String
		String  name = "AUTHOR";
		 
		switch (name.toLowerCase()) {
		case "author":
			System.out.println("Chaand");
			break;
		case "team":
			System.out.println("Team StudyEasy");
			break;
		case "editor":
			System.out.println("Shabaz & Salim");
			break;
		default:
			System.out.println("Invalid Entry");
			break;
		}
		
		
	}

}
