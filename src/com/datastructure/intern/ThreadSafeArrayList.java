package com.datastructure.intern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeArrayList {

	public static void main(String[] args) {
		
		// two ways we can make List synchronized or thread safe
		// 1. Collections.synchronizedList and 2. copyOnWriteArrayList - class
		
		
		System.out.println("<----------1. Collections.synchronizedList-------------->");
		
		List<String> namelist = Collections.synchronizedList(new ArrayList<String>());
		
		namelist.add("swathi");
		namelist.add("vip");
		namelist.add("avyaan");
		namelist.add("reshma");
		
		// we need to explicitly call syncronize to fetch the values from above namelist if we using above method
		synchronized(namelist) {
			Iterator<String> it = namelist.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		System.out.println(" ");
		System.out.println("<----------2. copyOnwriteArraylist class -------------->");
		
		
		CopyOnWriteArrayList<String> newlist = new CopyOnWriteArrayList<String>();
		newlist.add("ganesh");
		newlist.add("vishal");
		newlist.add("vivek");
		newlist.add("niya");
		
		Iterator<String> it1 = newlist.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		
		
	}

}
