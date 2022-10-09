package org.hrb.file;

import java.io.File;
import java.io.IOException;

public class FileBasics {

	public static void main(String[] args) throws IOException {

		File file=new File("D:\\STS-Workspace\\CoreJava\\FileHandling\\org\\hrb\\file\\myfile.txt");
		file.createNewFile();
		System.out.println("file created!");

	}

}
