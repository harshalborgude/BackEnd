package org.hrb.benison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FunctionalInterfaceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		funInterface obj = () -> System.out.println("MyMethod");
		
		obj.myMethod();

		ArrayList<String> list = new ArrayList<>(Arrays.asList("string", "Str2"));

		// list.forEach(str -> System.out.println(str));
		
		int[] intArray = new int[] { 1, 2, 3, 4 };

		int maxNum = 0;
		int secMax = 0;
//		for (int i = 0; i < intArray.length; i++) {
//			if (intArray[i] > maxNum) {
//				secMax = maxNum;
//				maxNum = intArray[i];
//			}
//		}
//		
//		for (int number : intArray) {
//			if (number > maxNum) {
//				secMax = maxNum;
//				maxNum = number;
//			}
//		}
//
//		System.out.println("MaxNum :" + maxNum +" ,secMax :"+secMax);

	}

}

@FunctionalInterface
interface funInterface {
	abstract void myMethod();
}
