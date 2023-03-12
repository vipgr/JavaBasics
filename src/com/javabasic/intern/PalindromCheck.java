package com.javabasic.intern;

import org.apache.commons.lang3.StringUtils;

public class PalindromCheck {

	public static void main(String[] args) {
		
		String palcheck ="malayalam";
		int palcheck1 =22;
		//boolean status = (StringUtils.isNumeric(palcheck));
		usingStringfunctions(palcheck);
		notUsingStringfunctions(palcheck);
		numberPal(palcheck1);
		
	}

	
	public static void usingStringfunctions(String s) {
		StringBuffer sb = new StringBuffer(s);
		String reversestring = sb.reverse().toString();
		if(s.equalsIgnoreCase(reversestring)) {
			System.out.println(" String is  palindrome");
		}else {
			System.out.println(" String is not palindrome");
		}
	}
	
	public static void notUsingStringfunctions(String s) {
		String oldString = s;
		String newstr="";
		
		int size = s.length();
		char [] palChar = s.toCharArray();
		for(int i=size-1;i>=0;i--) {
		newstr = newstr.concat(Character.toString(palChar[i]));
		}
		
		//System.out.print(newstr);
		if(oldString.equalsIgnoreCase(newstr)) {
			System.out.println(" String is  palindrome");
		}else {
			System.out.println(" String is not palindrome");
		}
	}
	
	public static void numberPal(int number) {
		int oldnum =number;
		int sum = 0;
		if (number>0) {
			
			while(number !=0) {
				int n = number % 10;
				sum = sum *10 + n;
				number = number/10;
			}
			
			// System.out.println(sum);
			
		}else {
			 System.out.println("Please enter valid number");
			  
		}
		
		if(oldnum == sum) {
			System.out.println(" number is  palindrome");
		}else {
			System.out.println(" number is not palindrome");
		
		}
		
		
	}
}
