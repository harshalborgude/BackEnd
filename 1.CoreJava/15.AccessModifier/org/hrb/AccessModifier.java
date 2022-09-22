package org.hrb;

// Access modifiers in Java help to restrict the scope of a class, constructor, variable, method, and data member.
// There are four types of access modifiers:
// 1) Private -  It is accessible only within the class. methods or data members declared as private are accessible only within the class in which they are declared.
//			  - Any other class in the same package will not be able to access these members.
//			  - Classes or the top-level interface cannot be declared private because of private means “only visible within the attached class”.
//			  
// 2) Public  - The public variable is visible everywhere in contrast to the private variable which is local variable to a class and protected 
//					variable which is also not visible in the different classes until It has the same package.
// 3) Protected - The protected access modifier is accessible within the package and outside the package but only through inheritance.
//				- It can be applied to the data member, the method, and the constructor. It cannot be applied in the class.
// 4) Default – No keyword is required 
//			  - In general default access modifier is accessible only within the package. If you do not use any modifier, it will be treated as default.


public class AccessModifier {
	
	private int num;
	protected int num1;
	int num2;			// default
	public int num3;

}
