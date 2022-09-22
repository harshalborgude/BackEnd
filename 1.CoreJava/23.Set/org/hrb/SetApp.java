package org.hrb;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Sets
//The sets are a unique type of data structure mostly used because it does not allow the repetition of the elements.
//elements are stored in the set using the add() method.
//Types of sets : linked set, hashed set, and tree set.
//HashSet uses the Hashing table,
//LinkedHashSet uses the Hashing table
//and LinkedList and TreeSet uses Tree for internal working.
//HashSet : doesn't guarantee order, allow one null key , faster for common operations like add , search , remove
//LinkedHashSet : it keep element in order they are added, speed comes after hashset
//TreeSet : It sorts all objects , doesn't allow null key , much slower bcz needs to perform sorting 


public class SetApp {
	
	public static void main(String[] args) {
		
		// Hash set
		Set<String> set = new HashSet<>();
		set.add("Chaand");
		set.add("John");
		set.add("Aafiya");
		set.add("Armaan");
		set.add("Mia");
		set.add("chaand");
		
		System.out.println("**** Hash Set : unordered *****");
		for(String name: set){
			System.out.println(name);
		}
		
        System.out.println(set.contains(1));
        
        
        // Linked Hash Set 
        Set<String> hashSet = new LinkedHashSet<>();
        System.out.println("**** Linked Hash Set : ordered *****");
		for(int i = 30; i>0; i--){
			hashSet.add("A"+i);
		}
		for(String i: hashSet){
			System.out.println(i);
		}
		
		
		// Tree Set 
		Set<String> treeSet = new TreeSet<>();
		 System.out.println("**** Tree Set : sorted data *****");
		for(int i = 30; i>0; i--){
			treeSet.add("A"+i);
		}
		for(String i: treeSet){
			System.out.println(i);
		}
	}

}
