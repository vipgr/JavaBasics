package com.javabasic.intern;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the number ;- ");
		int s = reader.nextInt();
		String  value = null;
		String f = "even";
		String n = "Odd";
		System.out.println("The number is "+ (value =(s % 2 == 0)? f:n));

		
	}

}
