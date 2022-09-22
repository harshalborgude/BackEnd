package org.hrb;

// In Java, Method overloading allows having multiple methods with the same name, if they differ in the number of arguments.
//Method overloading can be achieved in the following ways:
//1.Differs in numbers of parameter
//2.Differs in the data type of parameters
//3.Differs in the order of parameters.
//  Method overloading cannot be achieved by changing the return type.
// if class is public then it should have its own file, otherwise non public classes can be defined in one file

class Overloading {

	public void orderParameters(int id,String name){
		System.out.println( "id :"+id+"name :"+name);
	}	
 
	public  void orderParameters(String name,int id){
		System.out.println("name "+ name + "Id :"+id);
	}
	
}

public class MethodOverloading {
	
	/*
	//1.Differs in numbers of parameter
	public static void main(String[] args) {
		System.out.println("Area of rectangle " + area(14.25d, 10.65d));
		System.out.println("Area of Square " + area(5.0d));
	}
 
	public static double area(double length, double width) {
		return (length * width);
	}
 
	public static double area(double side) {
		return (side * side);
	}*/
	
	/*
	// 2. Method overloading with a different data type of parameter
	public static void main(String[] args) {
		System.out.println("1+2=" + sum(1, 2));
		System.out.println("1+2.5=" + sum(1, 2.5f));
		System.out.println("1.3+2.3=" + sum(1.3, 2.3));
	}
 
	public static int sum(int x, int y) {
		System.out.println("Adding two integer entities");
		return x + y;
	}
 
	public static float sum(int x, float y) {
		System.out.println("Adding one integer and one float entity");
		return x + y;
	}
 
	public static double sum(double x, double y) {
		System.out.println("Adding two double entities");
		return x + y;
	}*/
	
	
	//3. Method overloading with the difference in order of parameters.
	public static void main(String[] args){
		Overloading o=new Overloading();
		
		o.orderParameters("harsh",10);
		o.orderParameters(10, "harsh");	
	}
	
	
}


