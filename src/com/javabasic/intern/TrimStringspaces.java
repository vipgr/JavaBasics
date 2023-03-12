package com.javabasic.intern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TrimStringspaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "vipin raj", "vipin mak", "mak vip", "raj rek" };
		//List<String> am = TrimStringspaces.arrangeList(str);
		//System.out.println(am);
	//	TrimStringspaces.printDupWordCount(am);
		TrimStringspaces.arrangeList(str);
	}

	public static List<String> arrangeList(String[] str) {
		ArrayList<String> ar = new ArrayList<>();
		int size = str.length;
		//System.out.println(size);
		String[] sec = null;

		for (int i = 0; i < size; i++) {
			sec = str[i].split(" ");
			for (int j = 0; j < sec.length; j++) {
				ar.add(sec[j]);
			}
		}
		return ar;
	}
	
	public static void printDupWordCount(List<String> am) {
		
		Map<String, Integer> hp = new HashMap<>();
		for (int i=0;i<am.size();i++) {
			if(hp.containsKey(am.get(i))) {
				Integer count = hp.get(am.get(i));
				hp.put(am.get(i),count+1);
			
			}else {
				hp.put(am.get(i), 1);
			}
		}
		
		Set<Entry<String,Integer>> hset = hp.entrySet();
		for(Entry<String,Integer>es:hset) {
			if(es.getValue()>1) {
				System.out.println(es.getKey()+"----->"+es.getValue());
			}
		}
		
	}

	
	
	
	
}
