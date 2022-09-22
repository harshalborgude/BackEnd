package org.hrb.nestedClasses;

// In Java, we can write a class within a method it is called a local inner type. 
// Like local variables, the scope of the inner class is restricted inside the method. If you want to invoke the methods of a local inner class, you must instantiate this class inside the method.
// The advantage of such a case is the inner class is completely hidden from the outside world.


class Door {
	
	public boolean isLocked(String key) {
		class Lock {
			public boolean isLocked(String key) {
				if (key.equals("qwerty")) {
					return false;
				} else {
					return true;
				}
			}
		}
		return new Lock().isLocked(key);
	}

}

public class LocalInnerClass {
	 
	public static void main(String[] args) {
		Door door = new Door();
		System.out.println(door.isLocked("qwerty"));
 
	}
 
}