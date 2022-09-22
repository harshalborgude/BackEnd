package org.hrb;

import java.util.Arrays;
import java.util.List;

public class StreamForEachMethodReference_3 {
	
	// Method reference : Passing method as a reference. 

	public static void main(String[] args) {
		
		List<Integer> values= Arrays.asList(1,2,3,4);
		
		//values.forEach(i -> System.out.println(i));
		// for each can take method defination by telling it what to do and from where to do
		
		//values.forEach(System.out :: println);   
		// System.out.println(i) -> Here passing method as a reference and telling it to use
		// It will work same as above
		
		
		//////////////////////////////////////////////////////
		
//		values.forEach(i -> doubleIt(i));
		values.forEach(StreamForEachMethodReference_3 :: doubleIt);  // double it method belongs to StreamForEachMethodReference class.  
		
		
		
	}
	
	public static void doubleIt(int i) {
		
		System.out.println(i*2);
		
	}

}
