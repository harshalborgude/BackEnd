package org.hrb;

import java.util.Scanner;

// user input using the Scanner class.
//  The Java Scanner class comes under java.util package
// you have to tell java that this will be the system’s entry (System.in).

// BufferedReader to read from inpput stream = BufferedReader -> InputStreamReader(System.in)
// BufferedWriter to write into output Stream. = BufferedWriter -> OutputStreamWriter(System.out)

public class ScannerClass {

	public static void main(String[] args) {
		System.out.println("What's your age?");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("Your age is " + age);
		sc.close();
	}

}
