package org.hrb.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/*
 * 	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 *  BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
 * 
	BufferedReader brf=new BufferedReader(new FileReader("/myfile.txt"));
	BufferedWriter bw= new BufferedWriter(new FileWriter(""));
	
 * 
 */

public class FileWriteRead {
	
	// BufferedReader to read from file. = BufferedReader -> FileReader("/file.txt")
	// BufferedWriter to write into file. = BufferedWriter -> FileWriter("/file.txt")
	
	// BufferedReader to read from inpput stream = BufferedReader -> InputStreamReader(System.in)
	// BufferedWriter to write into output Stream. = BufferedWriter -> OutputStreamWriter(System.out)
	
	
	public static void main(String[] args) {
		
		File directory=new File("myDirectory");
		directory.mkdir();
		File file=new File("myDirectory\\file.txt");
		try {
			file.createNewFile();
			System.out.println("File created!");
		} catch (IOException e) {
			System.out.println("Error occured while creating a file!");
			
		}
		// FileWriter(file,true) mns content is appended to file.
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(file,true))){
			bw.write("###This is the demo file , created by File Writting Program!\n\n\n");
			bw.write("harshal\n");
			bw.write("i dont know\n");
			bw.write("this is my program\n");
			bw.write("i will finish core java now\n");
			bw.write("i left with 2 topics\n");
			bw.write("then i will start\n");
			bw.write("servlets and jsp's\n");
			System.out.println("file writing completed!");
			bw.close();
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
		try{
			BufferedReader br=new BufferedReader(new FileReader("myDirectory\\\\file.txt"));
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close(); 
		}catch(FileNotFoundException e){	
			System.out.println("reading file failed!");
			e.printStackTrace();
			
		}catch(IOException e) {
			System.out.println("reading file failed!");
			e.printStackTrace();
		}
		

	}

}
