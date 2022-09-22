package org.hrb.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


//Maps
//A map contains values based on the key, for example, key and value pair. 
//Each pair of key and value is known as an entry. Both the key and values are objects
//A map cannot contain duplicate keys, it must be unique, but the value can be duplicated.
// The Map.Entry is a key and its value combined into one class,which allows you to iterate over Map entrySet() instead of having to iterate over
//	Map.keySet(), then get the value for each key.
// for( Map.Entry<Integer,String> entry : student.entrySet()) { }
// The get(Object key) method will return the value associated with a specified key in this Java hashmap.
// HashMap : HashMap does not maintain the order of its element.
// TreeMap : The natural order of the keys is preserved.
// HashMap is an unordered collection while TreeMap is sorted in the ascending order of its keys.

public class MapApp {
	
	 public static void main(String[] args) {
			Map<Integer, String> student = new HashMap<>();
			student.put(1, "Rahul");
			student.put(2, "Mia");
			student.put(3, "Priyanka");
			
			// way 1 of iteration
			for( Map.Entry<Integer,String> entry : student.entrySet()) {
				System.out.println(entry);
				System.out.println("key :"+entry.getKey()+",Value :"+entry.getValue());
			}
			
			
			// way 2 of iteration
			Iterator<Map.Entry<Integer, String>> entry = student.entrySet().iterator();
			 
			while (entry.hasNext()) {
				//System.out.println("entry :"+entry.next());
				Map.Entry<Integer, String> temp = entry.next();
				System.out.println("Key: " + temp.getKey() + " Value: " + temp.getValue());
			}
			
	 }
	 
}

