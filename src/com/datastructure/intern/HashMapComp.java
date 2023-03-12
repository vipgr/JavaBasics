package com.datastructure.intern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapComp {

	public static void main(String[] args) {
		
		//comparison - Maps
		
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		map1.put(4, "D");
		
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(1, "A");
		map2.put(2, "B");
		map2.put(3, "C");
		map2.put(4, "D");
		HashMap<Integer, String> map3 = new HashMap<>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(4, "C");
		//map3.put(5, "E");
		
		// 1. on the basis of key- value :- using equals method
		System.out.println(map1.equals(map2)); //true
		System.out.println(map1.equals(map3)); // false
		
		// 2. using hasmaps for the same keys  :- using keyset() method
		System.out.println(map1.keySet().equals(map2.keySet())); //true
		System.out.println(map1.keySet().equals(map3.keySet())); //true
		
		// 3. find the missing keys 
		 // use HashSet and then do add the second map and then remove based on first map
		map3.put(5, "E");
		
		HashSet<Integer> hs = new HashSet<>(map3.keySet());
		hs.addAll(map1.keySet());
		hs.removeAll(map1.keySet());
		System.out.println(hs);
		
		// compare maps by values
		 // a) if duplicates are not allowed then use arrayList
		
		System.out.println(new ArrayList<>(map3.values()).equals(new ArrayList<>(map1.values()))); // false
		// b) if duplicates are  allowed then use HashSet
		System.out.println(new HashSet<>(map3.values()).equals(new HashSet<>(map1.values()))); // false
		System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map2.values()))); // true

	}

}
