package com.datastructure.intern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDupliFromList {

	public static void main(String[] args) {

		ArrayList<Integer> namelist = new ArrayList<Integer>(Arrays.asList(1,1,2,2,3,3,5,6,7));
		//Two ways we can remove dupicates 
		// 1. using LinkedHashSet and 2. using streams since java 1.8
		
		System.out.println(" ");
		System.out.println("<----------1. LinkedHashSet  -------------->");
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>(namelist);
		ArrayList<Integer> ar = new ArrayList<Integer>(hs);
		System.out.println(ar);
		
		// 2. using  streams since java 1.8
		
				System.out.println(" ");
				System.out.println("<----------1. LinkedHashSet  -------------->");
				
		List <Integer> uniqulist = namelist.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqulist);
		
		

	}

}
