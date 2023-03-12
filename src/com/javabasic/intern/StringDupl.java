package com.javabasic.intern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class StringDupl {

	// Program for string array

	public static void main(String[] args) {

		// Declarations and inputs
		String singChar = "Vipin ganeshaa";
		String sentences = "My big boss has a dog has";
		String names[] = { "java", "Ruby", "java", "javascript", "Ruby", "Ruby", "java" };
		int[] inputArray = new int[] { 1, 2, 3, 3, 4, 5, 6 };
		

		// calling functions in different type of arguments

		//StringDupl.Dupchar(singChar);
		//StringDupl.dupStringAry(names);
		//StringDupl.intDup(inputArray);
		//StringDupl.dupStringAry(sentences);
		stringDupRem(singChar);
		//StringDupl.dupCharAndMax(singChar);

	}

	// For String and convert to character

	public static void Dupchar(String str) {

		System.out.println("------------Out put for char  dupicates------------");
		char[] charname = str.toCharArray();
		Map<Character, Integer> storemap = new HashMap<Character, Integer>();
		for (int i = 0; i < charname.length; i++) {
			
			Integer count = storemap.get(charname[i]);
			if (count == null) {
				storemap.put(charname[i], 1);
			} else
				storemap.put(charname[i], ++count);

		}

		// getting the values using entryset in map

		Set<Entry<Character, Integer>> entryset = storemap.entrySet();
		for (Entry<Character, Integer> entry : entryset) {
			if (entry.getValue() > 1)
				System.out.println("Duplicate element using hashset for char array  is :- " + entry.getKey()
						+ "   No of times :- " + entry.getValue());
		}

	}

	// For String array

	public static void dupStringAry(String[] names) {
		// using hash map
		System.out.println("----------------using hash map------------------------");
		Map<String, Integer> storeMap = new HashMap<>();

		for (String name : names) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}
		}

		// getting the values using entryset in map

		Set<Entry<String, Integer>> entryset = storeMap.entrySet();
		for (Entry<String, Integer> entry : entryset) {
			if (entry.getValue() > 1)
				System.out.println("Duplicate element using hashset is :- " + entry.getKey() + "   No of times :- "
						+ entry.getValue());
		}

	}

	// For Integers

	public static void intDup(int[] inputArray) {
		// For integers using array stream with collector

		System.out.println("--------Out put for integer number dupicates------------");
		Set<Integer> uniqueElements = new HashSet<>();
		Set<Integer> duplicateElements = Arrays.stream(inputArray)
				.filter(i -> !uniqueElements.add(i)).boxed()
				.collect(Collectors.toSet());
		System.out.println("Inputs integer array " + duplicateElements);
	}

	// For String sentences

	public static void dupStringAry(String sentences) {

		// Converting string to string array with space
		sentences = sentences.toLowerCase();
		String names[] = sentences.split(" ");

		// using hash map
		System.out.println("---------------String sentences - using hash map------------------------");
		Map<String, Integer> storeMap = new HashMap<>();

		for (String name : names) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}
		}

		// getting the values using entryset in map

		Set<Entry<String, Integer>> entryset = storeMap.entrySet();
		for (Entry<String, Integer> entry : entryset) {
			if (entry.getValue() > 0)
				System.out.println("Duplicate element using hashset is :- " + entry.getKey() + "   No of times :- "
						+ entry.getValue());
		}

	}

	// For finding the duplicate string count and greatest value

	public static void dupCharAndMax(String str) {

		str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
		char[] ch = str.toCharArray();
		Map<Character, Integer> hmap = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (hmap.containsKey(ch[i])) {
				Integer count = hmap.get(ch[i]);
				hmap.put(ch[i], count + 1);
			} else {
				hmap.put(ch[i], 1);
			}
		}
		// For printing all the values in Map
		// System.out.println("Map values : "+hmap);

		// For finding the max value from the map
		int maxValueinMap = (Collections.max(hmap.values()));

		// For iterating using entryset from entry interface

		Set<Entry<Character, Integer>> entryset = hmap.entrySet();
		for (Entry<Character, Integer> entry : entryset) {

			// For finding the duplicate characters

			/*
			 * if(entry.getValue()>1)
			 * System.out.println("Duplicated characters : "+entry.getKey()+" = "+entry.
			 * getValue());
			 * 
			 */
			// For finding the max value
			if (entry.getValue() == maxValueinMap)
				System.out.println("Max string values : " + entry.getKey() + " = " + entry.getValue());

		}

	}
	
	
	public static void stringDupRem(String s){
		
		List<Character>vip = new ArrayList<>();
		String str = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
		char[] charname = str.toCharArray();

		Map<Character,Integer>stormap = new HashMap<Character, Integer>();

		for (int i =0;i<charname.length;i++){
			Integer count = stormap.get(charname[i]);
			if (count == null){
				stormap.put(charname[i],1);
			} else {
				stormap.put(charname[i],++count);
				
			}

		}

		Set<Entry<Character, Integer>> entryset = stormap.entrySet();
		for(Entry<Character,Integer> ent : entryset)
			if(ent.getValue()== 1){
				//System.out.print(ent.getKey());
				vip.add(ent.getKey());	
				
		}
		
		System.out.println(vip);


		}

}
