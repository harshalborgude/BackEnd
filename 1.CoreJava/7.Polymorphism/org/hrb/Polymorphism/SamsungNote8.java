package org.hrb.Polymorphism;

public class SamsungNote8 extends Phone {

	public SamsungNote8(String model) {
		super(model);
	}

	@Override
	public void features() {
		System.out.println("Andriod flagship");
	}
}
