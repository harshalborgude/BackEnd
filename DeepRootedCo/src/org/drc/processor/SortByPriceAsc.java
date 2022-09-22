package org.drc.processor;

import java.util.Comparator;

import org.drc.model.OrderData;

public class SortByPriceAsc implements Comparator<OrderData> {
	
	@Override
	public int compare(OrderData obj1,OrderData obj2) {
		
		if(obj1.getiPrice()==obj2.getiPrice()) {
			return 0;
		}else if(obj1.getiPrice() > obj2.getiPrice()) {
			return 1;
		}else if(obj1.getiPrice() < obj2.getiPrice()) {
			return -1;
		}
		return 0;
		
	}
	
}