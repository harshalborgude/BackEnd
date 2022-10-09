package org.hrb.Encora;


//		1 2 3 4 5
//		  2 3 4 5
//		    3 4 5
//		      4 5
//		        5

public class NumberPattern {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=0;i<n+1;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i+1;j<n+1;j++) {
				
				System.out.print(j);
			}
			System.out.println();
		}
		
		

	}

}
