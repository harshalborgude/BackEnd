package org.hrb.controller;

public class Name {
	
	private String firstName;
	private String lastName;
		
	public Name() {
		
	}

	public Name(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
