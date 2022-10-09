package org.hrb.abstractc;

public class Vegan extends Person{

	@Override
	public void eat() {
		  System.out.println ("Eats Vegan");

	}

}

class NonVegan extends Person{
    @Override
	public void eat() {
            System.out.println ("Eats NonVegan");
	}
}
