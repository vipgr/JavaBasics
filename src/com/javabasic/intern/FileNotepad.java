package com.javabasic.intern;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileNotepad {

	public static void main(String[] args) throws IOException {
		
		//Create a File
		File nwFile = new File("E:\\TestFiles\\newText.txt");
		nwFile.createNewFile();
		// Write to a File
		FileWriter fw = new FileWriter("E:\\TestFiles\\newText.txt");
		BufferedWriter not = new BufferedWriter(fw);
		
		not.write("This is my First line + ");
		not.newLine();
		not.write("This is my Second line + ");
		not.newLine();
		not.write("This is my Third line + ");
		not.flush();
		
		//Read string from  a File
		
		FileReader fr = new FileReader("E:\\TestFiles\\newText.txt");
		BufferedReader frr = new BufferedReader(fr);
		/*
		System.out.println(frr.readLine());
		System.out.println(frr.readLine());
		System.out.println(frr.readLine());
		*/
		
		String i= null;
		
		while((i = frr.readLine())!= null) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
