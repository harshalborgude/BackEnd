package org.hrb.StaticInnerClass;

// The static inner class can only access static members. Hence the non-static members when tried to access give an error.
// A static class in Java, created within a class is called a static nested class.
// If a class is static , all the methods and vars inside , should be static.



class Outer {
	
	
	public static class Inner {
        public static int x = 0;
		public static void testingInnerMethod() {
			System.out.println("Testing inner class method.");
		}
	}
 
}

public class App {
	
	public static void main(String[] args) {
		Outer.Inner.testingInnerMethod();
        System.out.println(Outer.Inner.x);
	}

}
