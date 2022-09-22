package org.hrb;

public class WordCount {

	public static void main(String[] args) {
		String words = "Hello world     guy z";
		
		String[] wordsArray = words.split("\\s+");
		
		System.out.println("count :"+wordsArray.length);

	}

}
