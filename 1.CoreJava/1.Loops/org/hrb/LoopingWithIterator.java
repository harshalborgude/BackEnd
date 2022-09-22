package org.hrb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LoopingWithIterator {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,7,8,9);
		
		// enhanced for each loop
		for (Integer integer : list) {
			//System.out.println(integer);
		}
		
		
		
		Iterator<Integer> values = list.iterator();
		while(values.hasNext()) {
			System.out.println(values.next());
		}
		
		
		
		Map<String,String> map = new HashMap<>();
		Iterator<Entry<String, String>> items = map.entrySet().iterator();
		while(items.hasNext()) {
			Map.Entry<String, String> item = items.next();
			System.out.println(item.getKey()+item.getValue());
		}

	}

}
