package org.hrb;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Performance of stream api's
//
//1) Map and filters are called as a lazy functions.they uses lazy evaluation.
//2) so after stream function converting all element into stream , it will passes to other functions.
//3) map and filter will do it's task when they get any terminal method like find first.
//4) so in process after filter , map , if it gets findFirst() method , then map will start mapping elements and filter
//	will start filtering elements.so in this way performance is optimized by doing lazy evaluation.
//	when asked for final result then this method will do its task according to requirement.


public class StreamFilter_6 {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

		// filter predicate taken 1 argument and return boolean.
		Predicate<Integer> p = new Predicate<>() {
			@Override
			public boolean test(Integer t) {
				return t % 5 == 0;
			}
		};

		// if condition is true then only filter will keep that element in stream otherwise it will remove it from stream.
		values.stream()
			  .filter(p)
			  .forEach(System.out::println);

		System.out.println(values.stream()
			      				 .filter(p)
			      				 .reduce((c,e)-> c+e));


		// get first value which is divisible by 5, after multiplying by 2
		System.out.println(values.stream()
 				 .filter(i -> i%5==0)
 				 .map(i-> i*2)
 				 .findFirst()
 				 .orElse(0));
		// Optional[40] -> there is always possibility that will get null result , so getting optional result.
		// Optional.empty -> if null is returned as a result.
		// orElse(0) -> if result is empty then , 0 is returned.

		/*
		 * In above operation , in stream when find first will be executed as its a terminal method , so after its
		 * execution , map will start mapping , as we want only first element , map will process only for first element
		 * 	so map will ask filter method to filter only first element and then it returns the answer.
		 * So in stream api , it dont process all the data , it process only required data , called as lazy evaluation.
		 */

		// To proove above all things

		System.out.println("******************");

		System.out.println(values.stream()
				 .filter(StreamFilter_6::isDivisible)
				 .map(StreamFilter_6::mapDouble)
				 .findFirst()
				 .orElse(0));

	}

	public static boolean isDivisible(int i) {
		System.out.println("in isDivisible :"+i);
		return i%5==0;
	}

	public static int mapDouble(int i) {
		System.out.println("in mapDouble :"+i);
		return i*2;
	}


}
