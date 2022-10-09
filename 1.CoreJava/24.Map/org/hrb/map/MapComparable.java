package org.hrb.map;

// implements comparable.
//

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
	private String sectionNo;
	private String lectureNo;
	public Code(String sectionNo, String lectureNo) {
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

	// return 0 if both are equal
	// returns -1 if this string is less that other
	// returns +1 if this string is greater than other.
	@Override
	public int compareTo(Code o) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = o.getSectionNo()+o.getLectureNo();
		return code1.compareTo(code2);
	}
}
public class MapComparable {

	public static void main(String[] args) {
		Map<Code,String> lectures = new TreeMap<>();
		lectures.put(new Code("S01","L03"), "Generics");
		lectures.put(new Code("S01","L01"), "Files under Java");
		lectures.put(new Code("S02","L03"), "Network programming");
		lectures.put(new Code("S01","L07"), "OOPS");
		lectures.put(new Code("S01","L05"), "Methods");
		lectures.put(new Code("S01","L03"), "Expressions");

		Code code = null;
		for(Map.Entry<Code, String> entry: lectures.entrySet()){

		  if(entry.getValue().equals("OOPS")){
			  code = entry.getKey();
		  }
		}

		//System.out.println("The key for value \"OOPS\" :"+code);


		Iterator<Map.Entry<Code,String>> entrySet1=lectures.entrySet().iterator();
		while(entrySet1.hasNext()) {
			Map.Entry<Code, String> entry=entrySet1.next();

			System.out.println("Code :"+entry.getKey() +", str :"+entry.getValue());

		}


	}

}
