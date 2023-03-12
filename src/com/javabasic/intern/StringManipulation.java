package com.javabasic.intern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StringManipulation {

	public static void main(String[] args) {
		int charCount = 6;
		String str = "javalanguage";
		String sem = "raji23tp1";
		// javala , avalan, valang ...nguage
		stringCut(str, charCount);
		
		// String Excercise
		
		String st = "Java,Selenium,Maven,TestNg";
		stringExc(st);
		
		
		
	}
	
	public static void stringCut(String str, int charCount) {
		
		for (int i=0; i<=str.length();i++) {
			if ((charCount+i)<str.length())
			System.out.println(str.substring(i,charCount+i));
			
		}
		
}
	
	public static void stringExc(String str) {
		System.out.println("String Excercise");
		String newar[] = str.split(",");
		
		//System.out.println(Arrays.toString(newar));
		
		for(int i=0;i<newar.length;i++)
			System.out.println(newar[i]);
	}


}


