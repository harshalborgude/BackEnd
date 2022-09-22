package org.hrb.pubMatic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

//str = [annabella] -> [aaannllbe]
//str = [pineapple] -> [pppeeinal]

// sort the above strings as per the number of occurances.

public class SortStringBasedOnOccurances {

	public static void main(String[] args) {
		
		//String data1="annabella";
		List<String> data1=new ArrayList<>(Arrays.asList("annabella".split("")));
		TreeSet<strData> dataSet=new TreeSet<>();
		
		
		int dataLength=data1.size();
		for(int i=0;i<dataLength;i++) {
		
			String ch=data1.get(i);
			int count=Collections.frequency(data1, ch);
			dataSet.add(new strData(ch,count));
			
			System.out.println("ch:"+ch+","+count);
			
		}
		
		System.out.println(dataSet);
		
		
		//data1.forEach(str->System.out.println(str));

	}

}

class strData implements Comparable<strData> {
	
	String ch;
	int count;
	
	public strData(String ch, int count) {
		this.ch = ch;
		this.count = count;
	}

	@Override
	public int compareTo(strData data) {
		
		if(data.getCount()==this.count) {
			return 0;
		}
		else if(data.getCount()>this.count) {
			return 1;
		}
		else if(data.getCount()<this.count) {
			return -1;
		}
		return 0;
		
	}

	public String getCh() {
		return ch;
	}


	public void setCh(String ch) {
		this.ch = ch;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "[ch=" + ch + ", count=" + count + "]";
	}
	
	
}
