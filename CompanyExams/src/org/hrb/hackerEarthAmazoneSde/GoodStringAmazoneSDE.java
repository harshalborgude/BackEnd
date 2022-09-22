package org.hrb.hackerEarthAmazoneSde;

// To learn use of Stream API

/*
1) Good String is a String when after replacing given array chars , strings of substring dont have same char left.
2) At whatever array replaceMent , string become good that is the output.

// Sample input 
 Input
1  -> T no of test cases , below all input lines will be repeated.
8 3  -> N Q
abbabaab  -> S
6 3 5 1 4 2 7 8   -> arr
1 3  	-> Q1
4 7	  	-> Q2
3 5		-> Q3
Output
5
Expected Correct Output
5

// Analysys
[Time (sec)
0.127052
 
Memory (KiB)
83528

Language
Java 8]

*/

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class GoodStringAmazoneSDE {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine().trim());
		for (int t_i = 0; t_i < T; t_i++) {
			String[] line = br.readLine().split(" ");
			int N = Integer.parseInt(line[0]);
			int Q = Integer.parseInt(line[1]);
			String S = br.readLine();
			String[] arr_arr = br.readLine().split(" ");
			int[] arr = new int[N];
			for (int i_arr = 0; i_arr < arr_arr.length; i_arr++) {
				arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
			}
			int[][] ranges = new int[Q][2];
			for (int i_ranges = 0; i_ranges < Q; i_ranges++) {
				String[] arr_ranges = br.readLine().split(" ");
				for (int j_ranges = 0; j_ranges < arr_ranges.length; j_ranges++) {
					ranges[i_ranges][j_ranges] = Integer.parseInt(arr_ranges[j_ranges]);
				}
			}

			int out_ = goodString(N, Q, S, arr, ranges);
			System.out.println(out_);

		}

		wr.close();
		br.close();
	}

	static int goodString(int N, int Q, String S, int[] arr, int[][] ranges) {
		// StringBuilder str= new StringBuilder(s);
		int result = 0;
		for (int i = 1; i < N; i++) {
			S = S.substring(0, (arr[i - 1] - 1)) + "_" + S.substring((arr[i - 1]), (N));
			// System.out.println("Str at indes "+i+" :"+S);
			if (testGoodStr(N, Q, S, ranges)) {
				result = i;
				break;
			}
		}
		return result;

	}

	static boolean testGoodStr(int N, int Q, String S, int[][] ranges) {
		// System.out.println("S :"+S);
		int distCases = 0;
		for (int testCase = 0; testCase < Q; testCase++) {
			String subStr = S.substring(ranges[testCase][0] - 1, ranges[testCase][1]);
			// System.out.println("testCase :"+testCase+", Str :"+subStr);	
			
			Collection<String> list = Arrays.asList(subStr.split(""));
			// List<String> distList=list.stream()
			// .distinct()
			// .collect(Collectors.toList());
			HashSet<String> distList = new HashSet<>();
			Random r = new Random();
			list.forEach((ch) -> {
				// System.out.println("ch :"+ch);
				if (ch.contentEquals("_")) {
					ch = r.nextInt(30) + "*" + r.nextInt(30);
				}

				distList.add(ch);
			});

			// System.out.println("distList :"+distList);
			// System.out.println("Lstr :"+subStr.length()+" LdistList
			// :"+(distList.size()));
			if (subStr.length() == distList.size()) {
				// System.out.println("String str and distList of same size");
				distCases++;
			}

		}
		// System.out.println("distCases :"+distCases);
		if (Q == distCases) {
			return true;
		} else {
			return false;
		}
		
		
	}

}
// Test Cases 2 :




