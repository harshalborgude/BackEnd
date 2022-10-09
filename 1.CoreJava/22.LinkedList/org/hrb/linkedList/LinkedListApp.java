package org.hrb.linkedList;

import java.util.LinkedList;

//Linkedlist
//Here, every node is interconnected to the next node through a memory address link.
//This is one of the most useful data structures and highly used in real-world scenarios because of its high-speed capacity and fast addition and deletion.
//This basic collection structure is the data in and the address which points to the next node functions as the guide of the respective node (That
//	is the reason for it being called the Linked List).
//add() method is used to add data in a newly created linked list.
// remove() method is used to remove the data from the specified location.

public class LinkedListApp {

	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		countries.add(1, "Canada");  // will modify data at 1 location
		 countries.set(7, "Brazil"); // will set data at 7th position.
		new LinkedListApp().printList(countries);

       }
	   void printList(LinkedList<String> list){
		for(String element: list){
			System.out.println("Element: "+element);
		}
		System.out.println("*****************************");
	}

}
