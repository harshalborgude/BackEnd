package org.hrb.ArrayList;

import java.util.ArrayList;

//Collections Framework
//The collections framework is a set of useful interface and classes of use data structures such as a Map, List, etc.
//The Collection in Java is a framework that provides an architecture for storing and manipulating a group of objects.
//collection : List, Set, map, Queue, Deque, stack, etc.
//classes 	: HashSet, LinkedHashSet, TreeSet, ArrayList, LinkedList,HashMap, TreeMap, PriorityQueue,Vector(stack) , etc.

//List : ArrayList, LinkedList
// set :  HashSet, LinkedHashSet, TreeSet
// map :  HashMap, LinkedHashMap,TreeMap
// Queue : LinkedBlockingQueue , ArrayBlockingQueue 
// Deque : LinkedBlockingDeque , ArrayBlockingDeque
// Stack : stack

//Collection framework is tested and optimized
//No third-party API required for accessing collection framework.


// Array List
// ArrayList in Java is used to store a collection of dynamic-sized elements. Unlike arrays that have a fixed size, an ArrayList automatically
// 	increases its size when new elements are added.
// ArrayList only accepts the elements that are objects of a class such as an Integer class or any class defined by the user, but not for any
//	primitive data type
// to store the elements in an array dynamically we make use of ArrayList.
// An ArrayList is an object which can be a resizable array.
// It is an implementation of List interface where the elements can be dynamically added or removed from the List.
// add() method is used to add data in a newly created linked list.
// pros : Fast , Easy to access any element from any location
// cons : Operations are slow , Tends to use more memory while operating


//Linkedlist
//Here, every node is interconnected to the next node through a memory address link.
//This is one of the most useful data structures and highly used in real-world scenarios because of its high-speed capacity and fast addition and deletion. 
//This basic collection structure is the data in and the address which points to the next node functions as the guide of the respective node (That
//	is the reason for it being called the Linked List).
//add() method is used to add data in a newly created linked list.

//List Interface
//The interface is an outline of the methods for a particular class to implement.
//List of countries is declared with List interface and later initialize with type ArrayList.

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

//Maps
//A map contains values based on the key, for example, key and value pair. 
//Each pair of key and value is known as an entry. Both the key and values are objects
//A map cannot contain duplicate keys, it must be unique, but the value can be duplicated.
//The Map.Entry is a key and its value combined into one class,which allows you to iterate over Map entrySet() instead of having to iterate
//	over Map.keySet(), then get the value for each key.
//for( Map.Entry<Integer,String> entry : student.entrySet()) { }
//The get(Object key) method will return the value associated with a specified key in this Java hashmap.
//HashMap : HashMap does not maintain the order of its element.
//TreeMap : The natural order of the keys is preserved.
//HashMap is an unordered collection while TreeMap is sorted in the ascending order of its keys.


// Stack 
// java Stack is a LIFO (Last in first out) object.
// Extends the Vector class but supports only five operations.
// The Java stack class only has one constructor that is empty or the default constructor.
// peek() , pop() , push(),search() , Empty()
// Peek() method is used to check the last element of the stack.
// pop() method is always performed on the top of stack element. If we perform pop() operation, it will remove the top element of the stack.
// Search() method returns  1 if it finds the searched element and it returns -1 if it does not find the searched element.


// Queue
// The queue is a data structure that First in First Out(FIFO) structure.
//LinkedBlockingQueue
//LinkedBlockingQueue is of dynamic size. It’s not required to provide size while creating LinkedBlockingQueue.
//add() method is used to add data at the end of the queue
//ArrayBlockingQueue 
//Like Arrays, ArrayBlockingQueue is of fixed size.
//Size of ArrayBlockingQueue should be provided as arguments while creating a queue.
//add() method is used to add data at the end of the queue.
//When the size of the queue is exceeded, it throws IllegalStateException.
//remove()  method removes the first element of the queue. If we try to remove an element from an empty queue, it throws NoSuchElementException.
//element() method returns the first element of the queue. . If we try to examine any empty queue, it throws NoSuchElementException.
// offer() is a special method used for adding data into a queue, which returns true if data is successfully added into a queue and false if data
//	is not added.
//poll()  is a special method that removes the first element of the queue and returns the element which is removed from the queue. If we try to poll
//	any element from an empty queue, it returns null.
//peek() is also a special method that checks for the first element of the queue. It returns null if implemented on an empty queue.

// Dequeue
//This means a DOUBLE ENDED QUEUE.
//The double-ended queue means insertion and deletion can take place from both ends.
//all the Queue methods can be used with Deque, but Deque has its own methods which allow to add and remove elements at the beginning and end of Deque.
//addfirst() , removelast() , offerFirst() , pollFirst()



public class ArrayListApp {

static ArrayList<String> listNames = new ArrayList<>();
	
	public static void main(String[] args) {
		listNames.add("Chaand"); //Autoboxing
		listNames.add("John");
		listNames.add("Steve");
		listNames.add("Pooja");
		listNames.add("Salim");
		listNames.add("Rahul");
		listNames.add("Mia");
		listNames.add("Angel");
		System.out.println("************");
		ArrayListApp app = new ArrayListApp();
		app.displayList(listNames);
		app.removeNameByString("Pooja");
		app.displayList(listNames);
		System.out.println("************");
		System.out.println(listNames.get(3)); // unboxing
	}
	
	void displayList(ArrayList<String> names){
		for(String name: names){
			System.out.println(name);
		}
		
	}
	void removeNameByPosition(int position){
	   listNames.remove(position);
	}
	void removeNameByString(String name){
		listNames.remove(name);
	}
	
}
