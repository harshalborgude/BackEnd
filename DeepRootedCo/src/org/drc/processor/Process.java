package org.drc.processor;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.drc.model.MatchedOrder;
import org.drc.model.OrderData;

public class Process {

	// takes list of input lines in supply order list and demand order list , and
	// will sort it based on time.
	// this method is called from test cases.
	public List<MatchedOrder> processList(List<String> inputList) {

		Process process = new Process();
		List<OrderData> supplyOrderList = new ArrayList<>();
		List<OrderData> demandOrderList = new ArrayList<>();

		for (String inputLine : inputList) {

			if (inputLine.startsWith("s")) {

				OrderData data = process.parceInput(inputLine);
				supplyOrderList.add(data);

			} else if (inputLine.startsWith("d")) {

				OrderData data = process.parceInput(inputLine);
				demandOrderList.add(data);

			}
		}

		List<MatchedOrder> matchedOrderList = null;

		if ((supplyOrderList.size() > 0) && (demandOrderList.size() > 0)) {

			// Sort by Price
			// Collections.sort(supplyOrderList, new SortByPriceAsc());
			// Collections.sort(demandOrderList, new SortByPriceDesc());

			// Sorting by time.
			Collections.sort(supplyOrderList, new SortByTime());
			Collections.sort(demandOrderList, new SortByTime());

//			System.out.println("*** Supply orders List ***");
//			supplyOrderList.stream().forEach(data -> System.out.println(data));
//			System.out.println("*** Demand orders List ***");
//			demandOrderList.stream().forEach(data -> System.out.println(data));

			matchedOrderList = process.tradeMatching(demandOrderList, supplyOrderList);
		}
		// System.out.println("*** Final Output ***");
		matchedOrderList.stream().forEach(matchedOrder -> System.out.println(matchedOrder));

		return matchedOrderList;
	}

	// trade matching will be done in this method and will return lits of all
	// matched orders
	public List<MatchedOrder> tradeMatching(List<OrderData> demandOrderList, List<OrderData> supplyOrderList) {
		List<MatchedOrder> matchedOrderList = new ArrayList<>();

		for (int demandOrderIndex = 0; demandOrderIndex < demandOrderList.size(); demandOrderIndex++) {

			for (int supplyOrderIndex = 0; supplyOrderIndex < supplyOrderList.size()
					&& (demandOrderList.get(demandOrderIndex).getiQuantityInKg() > 0); supplyOrderIndex++) {

				if (demandOrderList.get(demandOrderIndex).getsProduce()
						.equalsIgnoreCase(supplyOrderList.get(supplyOrderIndex).getsProduce())
						&& (supplyOrderList.get(supplyOrderIndex).getiPrice() <= demandOrderList.get(demandOrderIndex)
								.getiPrice())
						&& (supplyOrderList.get(supplyOrderIndex).getiQuantityInKg() > 0)) {

					if (demandOrderList.get(demandOrderIndex).getiQuantityInKg() < supplyOrderList.get(supplyOrderIndex)
							.getiQuantityInKg()) {

						int demandQty = demandOrderList.get(demandOrderIndex).getiQuantityInKg();
						demandOrderList.get(demandOrderIndex).setiQuantityInKg(0);
						supplyOrderList.get(supplyOrderIndex)
								.setiQuantityInKg(supplyOrderList.get(supplyOrderIndex).getiQuantityInKg() - demandQty);

						MatchedOrder matchedOrder = new MatchedOrder(
								demandOrderList.get(demandOrderIndex).getsOrderId(),
								supplyOrderList.get(supplyOrderIndex).getsOrderId(),
								supplyOrderList.get(supplyOrderIndex).getiPrice(), demandQty);

						matchedOrderList.add(matchedOrder);

					} else if (demandOrderList.get(demandOrderIndex).getiQuantityInKg() > supplyOrderList
							.get(supplyOrderIndex).getiQuantityInKg()) {

						int supplyQty = supplyOrderList.get(supplyOrderIndex).getiQuantityInKg();
						supplyOrderList.get(supplyOrderIndex).setiQuantityInKg(0);
						demandOrderList.get(demandOrderIndex)
								.setiQuantityInKg(demandOrderList.get(demandOrderIndex).getiQuantityInKg() - supplyQty);

						MatchedOrder matchedOrder = new MatchedOrder(
								demandOrderList.get(demandOrderIndex).getsOrderId(),
								supplyOrderList.get(supplyOrderIndex).getsOrderId(),
								supplyOrderList.get(supplyOrderIndex).getiPrice(), supplyQty);

						matchedOrderList.add(matchedOrder);

					} else if (demandOrderList.get(demandOrderIndex).getiQuantityInKg() == supplyOrderList
							.get(supplyOrderIndex).getiQuantityInKg()) {

						int quantity = demandOrderList.get(demandOrderIndex).getiQuantityInKg();
						supplyOrderList.get(supplyOrderIndex).setiQuantityInKg(0);
						demandOrderList.get(demandOrderIndex).setiQuantityInKg(0);

						MatchedOrder matchedOrder = new MatchedOrder(
								demandOrderList.get(demandOrderIndex).getsOrderId(),
								supplyOrderList.get(supplyOrderIndex).getsOrderId(),
								supplyOrderList.get(supplyOrderIndex).getiPrice(), quantity);

						matchedOrderList.add(matchedOrder);

					}

				}

			}

		}

		return matchedOrderList;
	}

	// Will parse line input and will map to OrderData class.
	// s2 09:46 tomato 20/kg 90kg
	// d1 09:47 tomato 22/kg 110kg
	public OrderData parceInput(String inputLine) {

		inputLine = inputLine.replaceAll("kg", "").replaceAll("/", "");
		// System.out.println("parceInput2 :" + inputLine);
		Scanner sc = new Scanner(inputLine);

		OrderData data = new OrderData(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
		// System.out.println("Data :"+data);

		return data;
	}

}
