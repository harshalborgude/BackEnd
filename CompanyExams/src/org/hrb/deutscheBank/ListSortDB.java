package org.hrb.deutscheBank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;


// to sort by name
public class nameComparator implements Comparator<Emp>{
	
	@Override
	public int compare(Emp obj1,Emp obj2){
		return Obj1.getName().compareTo(Obj2.getName());
	}	
}
// to sort by id
Public class idComparator implements Comparator<Emp>{
	@Override
	public int compare(Emp obj1,Emp obj2){

		if(Obj1.getId == Obj2.getId){
			return 0;
		}
		if(Obj1.getId > Obj2.getId){
			return 1;
		}
		if(Obj1.getId < Obj2.getId){
			return -1;
		}
	}
}

public class ListSortDB {

	public static void main(String[] args){

		ArrayList<Emp> list = new ArrayList<Emp>();
		
		// Sorting by name or id by implementing Comparator class.	
		Collection.sort(list,new nameComparator());
		Collection.sort(list,new idComparator());
		
		
		// Or sorting using Comparator as lambda expression.
		Collection.sort(list,new Comparator<Emp>(){
			
		// to sort on name
		@Override
		public int compare(Emp obj1,Emp obj2){
			return Obj1.getName().compareTo(Obj2.getName());
		}
				OR

		/*@Override
		public int compare(Emp obj1,Emp obj2){

			if(Obj1.getId == Obj2.getId){
				return 0;
			}
			if(Obj1.getId > Obj2.getId){
				return 1;
			}
			if(Obj1.getId < Obj2.getId){
				return -1;
			}

		}*/
	}	
			
   }
	
}
