package org.hrb;

import java.util.Arrays;

//str1 = "Army"
// str2 = "Mary"


public class CheckStringAnagram {

	public static void main(String[] args) {
		
//		String str1 = "Army";
//		String str2 = "Mary";
		
		char[] str1 = "Army".toLowerCase().toCharArray();
		char[] str2 = "Mary".toLowerCase().toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		System.out.println("Str1 :"+str1.toString()+" , Str2 :"+str2.toString());
		if(Arrays.equals(str1, str2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}

	}

}
