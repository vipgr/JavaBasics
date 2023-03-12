package com.javabasic.intern;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionsInJava {

	public static void main(String[] args) {
		
		// integer to string 
		int num = 2354;
	
		//String s = String.valueOf(num);
		String s1 =((Integer)num).toString();
		String s = Integer.toString(num);
		s = s.concat("Vipin");
		System.out.println(s);
		System.out.println(s1+"a");
		// String to integer
		
		int newval = Integer.parseInt(s.replaceAll("[^0-9]", ""));
		newval = newval+10;
		System.out.println(newval);
		
		// character to string 
		char c ='A';
		System.out.println("Conversion of character  to string:==== "+ Character.toString(c)+"-CBA");
		
		// convert char array to CharacterArray 
		char[] name = {'X','V','W'};
		Character[] characterArray = String.valueOf(name).chars().mapToObj(ci -> (char)ci).toArray(Character[]::new);
		
		System.out.println("convert char array to CharacterArray:==== "+characterArray[1]);
		
		
		//character array  to String Array 
		char[] ch = {'D','B','A','-','S','T','A','T'};
		System.out.println("Conversion of character array to string=======: "+ new String(ch));
		
		
		// String to character array 
		String str = "Rajeshan R";
		
		char[] chraj = str.toCharArray();
		System.out.println("String to character array  =======: "+ chraj[2]);

		// String to String array 
		// u can use split method, pattern etc link :- https://www.javatpoint.com/how-to-convert-string-to-string-array-in-java
		
		System.out.println("Conversion of String to String array  =======: "+Arrays.toString(new String[] {str}));
		
		
		//conversion of array list to string array 
		ArrayList<Integer> wholeList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		
		System.out.println("conversion of array list to string array  =======: "+Arrays.toString(wholeList.toArray())+'A');
		
		// conversion of string array to string
		
		
		
	}

}
