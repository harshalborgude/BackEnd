package org.hrb.file;

import java.io.File;
import java.io.IOException;

public class Directory {

	public static void main(String[] args) throws IOException {
		
		File directory = new File("D:\\STS-Workspace\\CoreJava\\FileHandling\\org\\hrb\\file\\myDirectory");
		directory.mkdir();										// this will create single directory
		System.out.println("directory created!");
		
		File directories1=new File("myDirectory\\hrb\\programs");
		File directories=new File("C:\\Users\\Harshal\\eclipse-workspace\\JspServlets");
		directories.mkdirs();										// this will create multiple directories at time.
		directories1.mkdirs();
		System.out.println("all directories created!");
		
		File file=new File("myDirectory\\hrb\\programs\\myFile.txt");		
		file.createNewFile();											// this will create file in that path.
		
	}

}
