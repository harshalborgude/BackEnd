package org.hrb;

// static members are class level and can be accessed directly without any instance.
// The static keyword means that the variable or function is shared among all the instances of that class since it belongs to the type, not to
//		the real objects themselves.


class TestStatic {
	private static int staticVariable=0;

	public static int getStaticVariable() {
		return staticVariable;
	}

	public static void setStaticVariable(int staticVariable) {
		TestStatic.staticVariable = staticVariable;
	}


}

public class StaticApp{

	public static void main(String[] args) {

	   System.out.println("Current variable value: "+TestStatic.getStaticVariable());
	   TestStatic.setStaticVariable(1);
	   System.out.println("Current variable value: "+TestStatic.getStaticVariable());
	   TestStatic.setStaticVariable(24);
	   System.out.println("Current variable value: "+TestStatic.getStaticVariable());

	   TestStatic Obj=new TestStatic();
	   System.out.println("Current obj variable value: "+TestStatic.getStaticVariable());
	   TestStatic.setStaticVariable(50);
	   System.out.println("Current obj variable value: "+TestStatic.getStaticVariable());

	   TestStatic Obj2=new TestStatic();
	   System.out.println("Current obj2 variable value: "+TestStatic.getStaticVariable());

	}

}