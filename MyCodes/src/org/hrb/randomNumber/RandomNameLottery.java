package org.hrb.randomNumber;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RandomNameLottery {

	public static void main(String[] args) {
		
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		Set<Integer> numberList = new HashSet<Integer>();
		
		System.out.print("Enter a number between 0 to 1000 :");
		int number=sc.nextInt();
		
		for(int i=0;i<50;i++) {
				
			numberList.add(rand.nextInt(1000));	
		
		}
		
		//System.out.println("Entered number is :"+number);
		
		  	  
		  
		  System.out.println();
		  if(numberList.contains(number)) {
			  System.out.println("won..........!!!");
			  System.out.println("The "+number+" is a lucky number!");
		  }
		  else {
			  System.out.println("Lost.........!!!");
			  System.out.println("The "+number+ " is not a lucky number");
		  }
		  
		  System.out.println("\n\nLucky numbers are :");
		  for (Integer integer : numberList) {
			  System.out.print(integer+",");
		  }
		  
	}

}
