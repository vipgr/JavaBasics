package com.javabasic.intern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String str = "My set name$09## is vipiny ";
		String regexx = "[^a-zA-Z]";
		String newWrd = str.replaceAll(regexx,"");
		System.out.println(newWrd);
		System.out.println(newWrd.length());
		System.out.println(newWrd.charAt(3));
		System.out.println(newWrd.lastIndexOf("n",newWrd.length()));
		System.out.println(newWrd.indexOf("n"));
		
		*/
		String str = "Geeks for Geeks";
		Character man = 'a';
		
		StringBasics.reverseStringRange();
		//StringBasics.stringReplace(str,man);
		//StringBasics.strngMatcher(str);
	}
		public static void reverseStringRange() {
			// code for reverse string by removing characters and in range 2-8 , 
			// once done addded string with add variable and then convert to integer to multiply the same with 10
			
		    String str ="1458ASD5851902";
		    String add ="Vipin";
		    int mul =10;
		    String numRegex = "[^2-8]";
		    System.out.println(str.replaceAll(numRegex,""));
		    System.out.println();
		    StringBuilder br = new StringBuilder(str.replaceAll(numRegex,""));
		    String newstring = br.reverse().toString();
		    System.out.println();
		    System.out.println("Added string : "+newstring.concat(add));
		    System.out.println();
		    int newnum = Integer.parseInt(newstring)*mul;
		    System.out.println("new number :- "+ newnum);
		    String s="m/j/"; 
		    String strep="\\\\";
		    String result=s.replaceAll("/", strep);
		     System.out.println(result);
		
	}
		
		
		
		public static void strngMatcher(String s) {
			String regex ="ee";
			
			Pattern pt = Pattern.compile(regex);
			Matcher mt = pt.matcher(s);
			
			String stringToBeReplaced = "a";
			//System.out.println(mt.quoteReplacement(stringToBeReplaced));
			//System.out.println(mt.replaceAll(mt.quoteReplacement(stringToBeReplaced)));
			System.out.println(mt.replaceAll(stringToBeReplaced));
			
			
			
		}
		
		

}
