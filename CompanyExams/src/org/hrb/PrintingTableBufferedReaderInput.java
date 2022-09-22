package org.hrb;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// using BufferedReader to read input from input stream.

public class PrintingTableBufferedReaderInput {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        //System.out.println(N);
        for(int i=1;i<=10;i++){
            System.out.printf("%2d x %2d = %3d\n",N,i,N*i);
        }
        
        bufferedReader.close();
    }
	
}

