package org.drc.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.drc.model.MatchedOrder;
import org.drc.processor.Process;

public class SupplyDemandProblem {

	public static void main(String[] args) {

		Process process = new Process();
		Scanner sc = new Scanner(System.in);
		List<String> inputList = new ArrayList<>();

		while (true) {

			String inputLine = "";
			try {

				inputLine = sc.nextLine();

			} catch (Exception e) {
			}

			if (inputLine.startsWith("s") || (inputLine.startsWith("d"))) {

				inputList.add(inputLine);

			} else {

				// System.out.println("*** input List ***");
				// inputList.stream().forEach(line -> System.out.println(line));

				List<MatchedOrder> matchedOrderList = process.processList(inputList);
				inputList.removeAll(inputList);

			}

		}
	}

}
