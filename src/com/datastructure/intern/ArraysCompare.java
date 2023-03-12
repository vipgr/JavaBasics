package com.datastructure.intern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysCompare {

	public static void main(String[] args) {
		
		// 1 . sort and equals
		ArrayList<String> first = new ArrayList<String>(Arrays.asList("A","B","D","C"));
		ArrayList<String> second = new ArrayList<String>(Arrays.asList("A","B","D","C"));
		ArrayList<String> third = new ArrayList<String>(Arrays.asList("A","E","D","C"));
		Collections.sort(first);
		Collections.sort(second);
		Collections.sort(third);
		System.out.println(first.equals(second));
		System.out.println(first.equals(third));
		
		
		
		// 2 . compare two list and find the additional one among each
		
		ArrayList<String> match1 = new ArrayList<String>(Arrays.asList("A","B","D","C"));
		ArrayList<String> match2 = new ArrayList<String>(Arrays.asList("A","F","D","C","E"));
		//System.out.println(match1.removeAll(match2));
		//System.out.println(match1);
	
		//System.out.println(match2.removeAll(match1));
		//System.out.println(match2);
		
		// 3. common elements from both 
		match1.retainAll(match2);
		System.out.println(match1);
	
		
		
	}

}
