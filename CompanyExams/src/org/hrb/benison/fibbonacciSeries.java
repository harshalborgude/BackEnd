package org.hrb.benison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 0,1,1,2,3

public class fibbonacciSeries {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		int count = 10;
		
		List<Integer> fibList = new ArrayList<>(Arrays.asList(0,1));
		

		System.out.print(num1 + " " + num2 + " ");
		for (int i = 2; i < count; i++) {

			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			
			int a = 10/0;
			
			if (!(sum % 2 == 0)) {
				System.out.print(sum + " ");
				fibList.add(sum);
			}

		}
		System.out.println();
		
		for(int i=fibList.size()-1;i>=0;i--) {
			System.out.print(fibList.get(i)+" ");
		}

	}
	
    
//	String str = null;
//	String str1="abc";
//	System.out.println(str1.equals("abc") | str.equals(null));  // true
//	String x = "abc";
//	String y = "abc";
//	x.concat(y);
//	System.out.print(x);  // abcabc

}

