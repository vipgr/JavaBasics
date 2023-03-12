package com.datastructure.intern;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPrg {

	public static void main(String[] args) {
		//1 . not maintain order
		//2 . not thread safe
		//3 . stores in key value pair
		//4 . Not allow duplicate key
		//5 . Allow one null in key and multiple nulls in values
		
		HashMap<String, String> capitalMap = new HashMap<>();
		capitalMap.put("IN", "India");
		capitalMap.put("US", "USA");
		capitalMap.put("UK", "UnitedKingdon");
		capitalMap.put("CN", "Canada");
		capitalMap.put("IN", "Mumbai");
		capitalMap.put(null, "India");
		capitalMap.put("GE", "Germany");
		capitalMap.put("SP", "SPAIN");
		capitalMap.put("GE", "Mouray");
		capitalMap.put("FD", null);
		capitalMap.put("GEA", null);
		
		
	//	System.out.println(capitalMap);
		
		
	//	System.out.println(capitalMap.get("GE"));
		
		// Iterator using keyset
		
		Iterator<String> it = capitalMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(capitalMap.get(key));
		}
		
		// Iterator using entry set
		
		Iterator<Map.Entry<String,String>> newset = capitalMap.entrySet().iterator();
		while(newset.hasNext()) {
			Map.Entry<String, String>entry = newset.next();
			System.out.println("Map entries  key "+entry.getKey()+"--> values : "+entry.getValue());
			
		}
		
		//  using enhanced for loop entry set
		System.out.println("-------------------------------------------------");
		
		Set<Map.Entry<String,String>> sets = capitalMap.entrySet();
		for(Entry<String,String>entry :sets)
			System.out.println("Map entries  key "+entry.getKey()+"--> values : "+entry.getValue());
		
				
	}

}
