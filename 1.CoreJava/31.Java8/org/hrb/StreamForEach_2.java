package org.hrb;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamForEach_2 {

	public static void main(String[] args) {

		List<Integer> values= Arrays.asList(1,2,3,4);

		//Step 1
		Consumer<Integer> c1= new Consumer<>(){
				@Override
				public void accept(Integer t) {
					System.out.println(t);
				}
		};
		//For each accepts consumes interfaces's object. Consumer is the interface and have to implement accept method.
		System.out.println("Step 1");
		values.forEach(c1);
		System.out.println("***********");

/////////////////////////////////////////////////////////////

		//Step2
		// For consumer interface only accept method is there , so if using consumer interface then use of consumer interface with overrided accept method
		// is obvious so we can remove that, it will take those things as by default , so only write imp things.
		// so object creation part and overriden method is removed and only kept argument and code part.
		// also consumer type we have method for parent interface as integer so no need to mention while taking args.

		Consumer<Integer> c2 = t -> System.out.println(t);


		// For each accepts consumes interfaces's object. Consumer is the interface and
		// have to implement accept method.
		System.out.println("Step 2");
		values.forEach(c2);
		System.out.println("***********");



/////////////////////////////////////////////////////////////

		//Step last
		// Above we have passed consumer interface  to foreach , but instead passing object that content we can pass directly , it will consider it as a Consumer
		// input , and data type is auto detected.
		System.out.println("Step last");

		values.forEach( i -> System.out.println(i));

		System.out.println("***********");

	}

}
