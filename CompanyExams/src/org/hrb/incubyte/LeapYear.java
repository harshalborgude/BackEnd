package org.hrb.incubyte;

public class LeapYear  {

	public static void main(String[] args) {
		
	

	}
	
	public boolean isLeap(int year) {
		
		if(( (year%400)==0) ) {
			return true;
		}else if((year%100==0)&&((year%400)!=0)){
			return false;
		}else if((year%4==0)&&((year%100)!=0)) {
			return true;
		}else if((year%4)!=0){
			return false;
		}
		
		
		return false;
	}
	

}
