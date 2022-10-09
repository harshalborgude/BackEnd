package org;

import java.util.ArrayList;
import java.util.Arrays;


//Remove immediate duplicates
// aaacbbbbddc
// cc

// aaacbbbbddc
// aacbbbbddc

public class RemoveImmediateDuplicates {

	public static void main(String[] args) {

		ArrayList<String> string = new ArrayList<String>(Arrays.asList("aaacbbbbddc".split("")));

		String prevCh = "";
		for (int i = 0; i < string.size(); i++) {

			try {
				String ch = string.get(i);
				if (string.size() != i + 1 && ch.equals(string.get(i + 1))) {
					string.remove(i--);
					prevCh = ch;
				} else if (ch.equals(prevCh)) {
					string.remove(i--);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println(string);

	}

}
