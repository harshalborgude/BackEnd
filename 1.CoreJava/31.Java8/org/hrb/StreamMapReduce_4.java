package org.hrb;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

// stream will convert all the values into stream.
// map can take values from stream and convert it into specified output. and it accept object of function.

public class StreamMapReduce_4 {

	public static void main(String[] args) {

		List<Integer> values= Arrays.asList(1,2,3,4);

		//s.forEach(System.out :: println);
		// passing object of function to the map.and it returns stream.
		// s1 will be having values with i*2; as in apply method.
		Function<Integer,Integer> f = new Function<>(){
			@Override
			public Integer apply(Integer i) {

				return i*2;
			}
		};
		BinaryOperator<Integer> b = new BinaryOperator<>() {
			@Override
			public Integer apply(Integer c,Integer e) {
				return c+e;
			}
		};

		Stream s = values.stream();
		Stream s1 = s.map(f);		// returning a stream with each value multiplied by 2.
		//s1.forEach(System.out :: println);
		Integer result = (Integer) s1.reduce(0, b);		// returning a result of addition.

//		System.out.println(result);

// ---------------------------------------------------------------------------
		// in reduce , 0 is the initial value , whatever result will be there that will be get added in c (carry) and next value is e.

		Integer res = values.stream().map(i -> i*2).reduce(0,(c,e)-> c+e);
//		Integer res = values.stream().map(i -> i*2).reduce(0,(c,e)-> Integer.sum(c, e));
//		Integer res = values.stream().map(i -> i*2).reduce(0, Integer :: sum);

		System.out.println(res);






	}

}


















