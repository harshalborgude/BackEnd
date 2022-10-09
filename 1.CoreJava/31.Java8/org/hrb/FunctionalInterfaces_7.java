
// Functional Interfaces
/*
 	- A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. 
	- From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. 
	- A functional interface can have any number of default methods. Runnable, ActionListener, Comparable are some of the examples of functional 
		interfaces.
	 Ex :  Runnable,Comparable, ActionListener
	- will be anotated with @FunctionalInterface
	- Functional interfaces are interfaces that ensure that they include precisely only one abstract method.
	- As described earlier, functional interfaces can contain only one abstract method. However, they can include any quantity of default and 
		static methods. 
	- In Functional interfaces, there is no need to use the abstract keyword as it is optional to use the abstract keyword because, by default, 
		the method defined inside the interface is abstract only.
	- We can also call Lambda expressions as the instance of functional interface.
	- @FunctionalInterface annotation is used to ensure that the functional interface can’t have more than one abstract method.
	- In case more than one abstract methods are present, the compiler flags an ‘Unexpected @FunctionalInterface annotation’
	
	- Since Java SE 1.8 onwards, there are many interfaces that are converted into functional interface. All these interfaces are annotated with 
		@FunctionalInterface. These interfaces are as follows – 
		1) Runnable –> This interface only contains the run() method.
		2) Comparable –> This interface only contains the compareTo() method.
		3) ActionListener –> This interface only contains the actionPerformed() method.
		4) Callable –> This interface only contains the call() method.
		
	- If more than one functional interface, that interface will not be called a functional interface. It is called a non-functional interface.
	- There is no such need for the @FunctionalInterface annotation as it is voluntary only. This is written because it helps in checking the 
		compiler level. Besides this, it is optional.
	- An infinite number of methods (whether static or default) can be added to the functional interface. In simple words, there is no limit to 
		a functional interface containing static and default methods.
	
		
----------------------------------------------------------------------------------------------------

	- Java SE 8 included four main kinds of functional interfaces which can be applied in multiple situations. 
	1) Consumer : .ForEach()
	2) Predicate : .filter()
	3) Function :  .map()
	4) Supplier
	
	--------------------
	1) Consumer : .ForEach()
		- The consumer interface of the functional interface is the one that accepts only one argument or a gentrified argument. The consumer 
			interface has no return value. It returns nothing.
		-  There are also functional variants of the Consumer — DoubleConsumer, IntConsumer, and LongConsumer. These variants accept primitive 
			values as arguments. 
			
		Ex : 
			- Consumer<Integer> consumer = (value) -> System.out.println(value);
			- ForEach() method : In ForEach() method , we have to pass "Consumer" Interface and have to override accept() method, so "Consumer" 
				is functional interface.
		
	  Bi-Consumer :
	   - Bi-Consumer is the most exciting variant of the Consumer interface. The consumer interface takes only one argument, but on the other side,
	     the Bi-Consumer interface takes two arguments. Both, Consumer and Bi-Consumer have no return value. It also returns noting just like the 
	     Consumer interface. It is used in iterating through the entries of the map. 
	     
				Map<String, Integer> map = new HashMap<>();	
        		map.entrySet().forEach( ( Key, Value )->{
        			 System.out.print("Key = " + k);
        			System.out.print(" Value = " + v);
        		})
        		
       ---------------------
       2) Predicate :
       		- a function that accepts an argument and, in return, generates a boolean value as an answer is known as a predicate.
       		- Just like the Consumer functional interface, Predicate functional interface also has some extensions. 
       			These are IntPredicate, DoublePredicate, and LongPredicate.
       			
       			public interface Predicate<T> {
				    boolean test(T t);
				}
				
			Ex :
			`	- Filter() method : accepts instance of "Predicate",its also a functional interface.
				- list.filter(value -> value>4 );
				
				
       	Bi-Predicate :
       	 	- Bi-Predicate is also an extension of the Predicate functional interface, which, instead of one, takes two arguments, does some 
       	 		processing, and returns the boolean value.
		
		
		-----------------------
		3) Function :
			- A function is a type of functional interface in Java that receives only a single argument and returns a value after the required 
				processing.
				
			Ex :
				- Map() method : accepts instance of "Function" interface , its also a functional interface
					list.map( val -> val*2 );
			
		 Bi-Function :
		  	- The Bi-Function is substantially related to a Function. Besides, it takes two arguments, whereas Function accepts one argument. 
				
						@FunctionalInterface
						public interface BiFunction<T, U, R> 
						{
						   R apply(T t, U u);
						}
		
		-----------------------
		4) Suppler : 
		
			- The Supplier functional interface is also a type of functional interface that does not take any input or argument and yet returns 
				a single output.
			- This type of functional interface is generally used in the lazy generation of values.
			- Supplier functional interfaces are also used for defining the logic for the generation of any sequence.
			- The logic behind the Fibonacci Series can be generated with the help of the Stream.generate method, which is implemented by the 
				Supplier functional Interface. 
			- The different extensions of the Supplier functional interface hold many other supplier functions like BooleanSupplier, DoubleSupplier,
			 	LongSupplier, and IntSupplier.
			
-------------------------------------------------------------------------------------------------------------------------------------
		
	- ForEach() method : In ForEach() method , we have to pass "Consumer" Interface and have to override accept() method, so "Consumer" is functional interface.
	- Map() method : accepts instance of "Function" interface , its also a functional interface
	- Filter() method : accepts instance of "Predicate",its also a functional interface.
	- Reduce() method : accepts instance of "BinaryOperator", its also a functional interface.
 
  

 */



public class FunctionalInterfaces_7 {

	public static void main(String[] args) {
		
		
		
		
	}

}
