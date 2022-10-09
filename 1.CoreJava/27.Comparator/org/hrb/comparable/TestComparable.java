package org.hrb.comparable;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* implements comparable

 * 1) If we are using TreeMap to store any objects instead of primitive data types then have to implement comparable<Object> interface with over ridded
 * 		compareTo() method in the objects to be added in map.
 * 2) As tree map adds entries in map in sorted order so it uses overrided compareTo method to sort them.
 * 3) Whenever we are sorting List(ArrayList,LinkedList) using COllection.sort(List) , then if list is of not premitiver data type and if it is of
 * 		any objects then to sort that , we have to implement comparable<Object> interface and by overriding compareTo method , sorting algo can work.
 *
 */

// Difference between Comparable and Comparator
/*
				Comparable																	Comparator
1) Comparable provides a single sorting sequence. In other words,		1) The Comparator provides multiple sorting sequences.In other words,
 	we can sort the collection on the basis of a single element 				we can sort the collection on the basis of multiple elements
 	such as id, name, and price.	   											such as id, name, and price etc.
2) Comparable affects the original class, i.e., 						2) Comparator doesn't affect the original class, i.e., the actual class 
	the actual class is modified.												is not modified.
3) Comparable provides compareTo() method to sort elements.				3) Comparator provides compare() method to sort elements.
4) Comparable is present in java.lang package.							4) A Comparator is present in the java.util package.
5) We can sort the list elements of Comparable type by 					5) We can sort the list elements of Comparator type by 
	Collections.sort(List) method.												Collections.sort(List, Comparator) method.

*/

class MyCode implements Comparable<MyCode>{
	private String sectionNo;
	private String lectureNo;
	public MyCode(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public String getLectureNo() {
		return lectureNo;
	}
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}
	@Override
	public int compareTo(MyCode o) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = o.getSectionNo()+o.getLectureNo();
		return code1.compareTo(code2);
	}

}

public class TestComparable {

	public static void main(String[] args) {
		Map<MyCode,String> lectures = new TreeMap<>();
		lectures.put(new MyCode("S01","L03"), "Generics");
		lectures.put(new MyCode("S01","L01"), "Files under Java");
		lectures.put(new MyCode("S02","L03"), "Network programming");
		lectures.put(new MyCode("S01","L07"), "OOPS");
		lectures.put(new MyCode("S01","L05"), "Methods");
		lectures.put(new MyCode("S01","L03"), "Expressions");

		for(Map.Entry<MyCode, String> entry: lectures.entrySet()){
		   System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}

		System.out.println("*****Iterator******");

		Iterator<Map.Entry<MyCode,String>> entries=lectures.entrySet().iterator();

		while(entries.hasNext()) {
			Map.Entry<MyCode,String> entry=entries.next();
			System.out.println("Key :"+entry.getKey()+" Value :"+entry.getValue());
		}

	}

}
