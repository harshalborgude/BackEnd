package org.hrb.deutscheBank;

public class Emp {

	private int id;
	private String name;

	Emp(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;	
	}

}
