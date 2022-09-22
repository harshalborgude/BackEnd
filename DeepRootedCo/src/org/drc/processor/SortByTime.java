package org.drc.processor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

import org.drc.model.OrderData;

public class SortByTime implements Comparator<OrderData>{
	
	@Override
	public int compare(OrderData obj1,OrderData obj2) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		
		Date date1 = null;
		Date date2 = null;
		try {
			date1=sdf.parse(obj1.getsTime());
			date2=sdf.parse(obj2.getsTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return date1.compareTo(date2);
	
	}

}
