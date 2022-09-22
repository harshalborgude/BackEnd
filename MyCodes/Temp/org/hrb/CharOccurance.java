package org.hrb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//coderolls

public class CharOccurance {
	
	public static void main(String[] args) {
		
		String str = "coderolls";
		
		List<String> strList = Arrays.asList(str.split(""));
		
		for(int i=0;i<str.length();i++) {
			System.out.println(strList.get(i) +" :"+ Collections.frequency(strList, strList.get(i)));
			
		}
		
		if("String".startsWith("Strn")) {
			System.out.println("At Start");
		}else if("String".endsWith("ingn")){
			System.out.println("At End");
		}else if("String".contains("trn")){
			System.out.println("In Middle");
		}else {
			System.out.println("Not a part");
		}
		
		
		
		
	}

}
