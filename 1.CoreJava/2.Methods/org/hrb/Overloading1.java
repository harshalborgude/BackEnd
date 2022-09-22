package org.hrb;

public class Overloading1 {

	public void orderParameters(int id,String name){
		System.out.println( "id :"+id+"name :"+name);
	}	
 
	public  void orderParameters(String name,int id){
		System.out.println("name "+ name + "Id :"+id);
	}
	
}
