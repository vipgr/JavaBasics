package com.javabasic.intern;

import java.util.ArrayList;

public class Arraylistmethod {

	public static void main(String[] args) {
		
		ArrayList <Integer>list = new ArrayList<Integer>();
		list.add(10);
		list.add(null);
		list.add(null);
		
		System.out.println(list);
		
		Integer num = 10;
		String name="Text name ";
		
		
		String str = new String();

		System.out.println(num.toString()+"stringvalue");
		
		String nwval = String.valueOf(num);
		System.out.println(nwval+'F');

		Arraylistmethod ar1 = new Arraylistmethod();
		Arraylistmethod ar2 = new Arraylistmethod();
		Arraylistmethod ar3 = new Arraylistmethod();
		
		
		ar1 = null;
		
		System.out.println(ar1);
		System.out.println(ar2);
		
		
		
		
		
		
		
	}

}
