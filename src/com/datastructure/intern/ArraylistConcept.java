package com.datastructure.intern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistConcept {

	public static void main(String[] args) {
		
		System.out.println(" <------- 1 Section  ------ >");
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("vipin","naveen","swathi","avyaan","swathi","vipin"));
		
		System.out.println(names.lastIndexOf("avyaan"));
		System.out.println(names.remove(1));
		System.out.println(names);
		
		System.out.println(" ");
		System.out.println("-----------to add ----------" );
		System.out.println(" <------- 2 Section  ------ >");
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		numbersList.add(40);
		numbersList.add(10);
		numbersList.add(50);
		System.out.println(numbersList);
		
		System.out.println(" ");
		System.out.println(" ------------Add a value in exisiting arraylist from index 2");
		names.add(2, "mohan");
		System.out.println("names array list details :-  "+names);
		
		System.out.println(" ");
		System.out.println(" <------- 3 Section  ------ >");
		System.out.println(" ------------Add a new arrayList using clone=========");
		ArrayList<String> nameslist = (ArrayList<String>)names.clone();
		System.out.println("nameslist array list details :-  "+nameslist);
		
		
		System.out.println(" ");
		System.out.println(" <------- 4 Section  ------ >");
		System.out.println(" ------------Merge two arraylist=========");
		ArrayList<String> tomerge = new ArrayList<String>(Arrays.asList("sneha","sundu","rema"));
		System.out.println(tomerge.addAll(1,nameslist));
		System.out.println("Merged array list details :-  "+tomerge);
		
		System.out.println(" ");
		System.out.println(" <------- 5 Section  ------ >");
		System.out.println(" ------------Remove values from the list using lamda only odd numbers =========");
		
		ArrayList<Integer> wholeList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		wholeList.removeIf(num -> num%2 ==1); // For removing odd numbers
		//wholeList.removeIf(num -> num%2 ==0); // For removing even numbers
		System.out.println(wholeList);
		
		
		System.out.println(" ");
		System.out.println(" <------- 6 Section  ------ >");
		System.out.println(" ------------retainAll method for using collection.singleton method - only display specified value =========");
		
		System.out.println(tomerge.retainAll(Collections.singleton("swathi")));
		System.out.println("Merged array post retainAll method  :-  "+tomerge);
		
		System.out.println(" ");
		System.out.println(" <------- 7 Section  ------ >");
		System.out.println(" ------------Adding sublist =========");
		
		ArrayList<String>sublist = new ArrayList<String>(nameslist.subList(2, 5));
		System.out.println("sublist array post retainAll method  :-  "+sublist);
		
		System.out.println(" ");
		System.out.println(" <------- 8 Section  ------ >");
		System.out.println(" ------------Conversion of arraylist to array =========");
		Object subarray[]=sublist.toArray();
		System.out.println("Converting whole object array to string:--- " +Arrays.toString(subarray));
		// geting values
		for(Object o :subarray)
			System.out.println("Prinitng all string values from the array by casting :- "+(String)o);
		
		
		System.out.println(" ");
		System.out.println(" <------- 9 Section  ------ >");
		System.out.println(" ------------4 ways we can iterate list  - now showing only using iterator =========");
		Iterator<Integer> it = wholeList.iterator();
		while(it.hasNext()) {
			System.out.println("Printing the values from the Wholelist :- "+it.next());
		}

		
		
	}

}
