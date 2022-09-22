package org.hrb;

import java.util.Scanner;

/*Sample Input

java 100
cpp 65
python 50

Sample Output

================================
java           100 
cpp            065 
python         050 
================================*/

// printf is use to format output
// -15s will left justify output string with 15 width
// %03d will print 3 digits with 0 preccedded.

public class OutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d\n",s1,x);
            }
            System.out.println("================================");

    }
}



