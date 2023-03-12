package com.javabasic.intern;

public class Swapping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//With out using temp
		
		int a = 80;
		int b = 30;
		
		System.out.println("Before swapping ");
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		
		System.out.println("After swapping ");
		
		a = a-b;
		b = a+b;
		a = b-a;

		
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		
		
	}

}
