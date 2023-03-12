package com.javabasic.intern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemoval {

	public static void main(String[] args) {
	
		String str = "Vipin Swatis";
		char[] a = {'D','B','A','-','S','T','A','T'};
		//dup(str);
		
		StringtolistDup(str);
	//	usingHasSet(str);
		//characterToString(a);
		
		ArrayList<Integer>ar = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,4,5,6));
		//removeDupInteger(ar);
		
		
	}

	public static void dup(String str) {
		// Here the string sorder will not work
		str = str.toLowerCase();
		String [] conv = str.split("");
		LinkedHashSet<String> unique = new LinkedHashSet<String>(Arrays.asList(conv));
		System.out.println("priniting unique Main"+unique);
	
//		String newstring = unique.toString();
//		System.out.println(newstring);
	
		String newstr = String.join("", unique);
		System.out.println(newstr);
	}
	
	public static void StringtolistDup(String str) {
		//using list - acurate answer
		str = str.toLowerCase();
		String [] conv = str.split("");
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(conv));
		ArrayList<String> uniqe = new ArrayList<String>();
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
		String s = it.next();
			if(!uniqe.contains(s))
				uniqe.add(s);			
			}
		// converting arraylist to string
		System.out.println(String.join("", uniqe));

	}
	
	public static void usingHasSet(String str) {
		//using list - acurate answer
		str = str.toLowerCase();
		int size = str.length();
		LinkedHashSet<Character> lh = new LinkedHashSet<>();
		for(int i=0;i<size;i++)
			lh.add(str.charAt(i));
		for(Character ch :lh)
			System.out.print(ch);
		// conversion of set to String array 
		
		
	}
	// converting character to string
	public static void characterToString(char[] a) {
		System.out.println();
		System.out.println(new String(a));
	

	}
	
	
	public static void removeDupInteger(List ar) {
		
		List<Integer> newUnq = (List<Integer>) ar.stream().distinct().collect(Collectors.toList());
		System.out.println(newUnq);
	}
	
	
	
	
	
}
