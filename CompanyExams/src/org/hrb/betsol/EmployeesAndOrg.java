package org;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EmployeesAndOrg {

	public static void main(String[] args) {
		
		String company = "TCS";
		
//		employees<empName,companyName>
		HashMap<String,String> employees = new HashMap<>();
		
		employees.put("Abc", "TCS");
		employees.put("Abc1", "TCS");
		employees.put("Abc2", "INFOSYS");
		employees.put("Abc3", "PTC");
		employees.put("Abc4", "PTC");
		
		HashSet<String> companies = new HashSet<>();
		for (Map.Entry<String, String> entry : employees.entrySet()) {
			companies.add(entry.getValue());
		}
		
		for(String com:companies ) {
			System.out.print(com +" :");
			for (Map.Entry<String, String> entry : employees.entrySet()) {
				if(entry.getValue().equalsIgnoreCase(com)){
					System.out.print(entry.getKey() + " ");
				}
			}
			System.out.println();
		}
	
	}

}
