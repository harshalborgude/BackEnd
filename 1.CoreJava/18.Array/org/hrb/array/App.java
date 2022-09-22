package org.hrb.array;

// An array is basically a collection, an arrangement of similar datatypes entities.

// Data stored in an array has contiguous memory locations.
// An array is a static data structure to store more than one value, it acts as a container that contains a collection of homogeneous elements.
// In Java, we don’t have an array of arrays known as two-dimensional arrays.
// Declaration of an array in Java:
// int[] intVariableArray = {1,2,3,4,5,6,7,8,9,10};
// int[] intArray=new int[3];

// Issues with Array
// user once assigned any memory to the array cannot add or change the memory and append any other element to it.
// Fixed-size , entries of an array must be of the same type ,
// 

public class App {

	public static void main(String[] args) {
		int[] intVariableArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		//int[] intArray=new int[3];
		//intArray[0]=1;
		System.out.println(intVariableArray[5]);

		float[] floatVariableArray = { 0.0f, 1.0f, 2.0f, 3.0f, 4.0f };
		System.out.println(floatVariableArray[4]);

		String[] stringArray = { "Chaand", "John", "Pooja", "Mia", "Salim" };
		
		// for loop for array
		for (int i = 0; i <= stringArray.length - 1; i++) {
			System.out.println(stringArray[i]);
		}
		
		// for each loop of array
		for(String name: stringArray){
			System.out.println(name);
		}

	}

}
