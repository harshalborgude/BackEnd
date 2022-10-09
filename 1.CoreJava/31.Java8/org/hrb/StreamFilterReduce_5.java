package org.hrb;

import java.util.Arrays;
import java.util.List;

public class StreamFilterReduce_5 {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(15, 20, 35, 46, 55, 68, 75);

		// add if divisible by 5
		int result = 0;
		for (Integer value : values) {
			if (value % 5 == 0) {
				result = result + value;
			}
		}
//		System.out.println("result :" + result);


		// doing above operation with stream api
		// filter will return only those value who passes the condition.
		// reduce will perform addition operation with all the stream values.
		Integer res = values.stream()
							.filter(i -> (i% 5 == 0))
							.reduce(0,(c,e)->c+e);

		System.out.println("res :"+res);

	}

}
