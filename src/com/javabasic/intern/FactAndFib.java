package com.javabasic.intern;

import java.util.ArrayList;
import java.util.List;

public class FactAndFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FactAndFib.fact(5);
		//FactAndFib.fibn(8);
		//FactAndFib.fibPrime(8);
	}

	
	public static void fact(int number) {
		
		//4! = 1*2*3*4 =24
		int fact =1;
		for (int i =1;i<=number;i++)
			fact =fact * i;
		
		System.out.println("factorial of a number :- "+fact);
	}
	
	
	public static void fibn(int num) {
		
		//0 1 1 2 3 5 8
	
		int first =0;
		int second =1;
		for (int i = 1 ;i<= num ; i++) {
			
			System.out.print(first);
			int sum = first+second;
			first = second;
			second = sum;
		}
	}
		
		//checking prime number from fibnocii
		
	
	
	
	
//		public static void fibPrime(int num) {
//			
//			//0 1 1 2 3 5 8
//		
//			int first =0;
//			int second =1;
//			Prime p = new Prime();
//			List<Integer>li = new ArrayList<Integer>();
//			System.out.println();
//			for (int i = 1 ;i<= num ; i++) {
//				
//				if(p.isPrime(first)) {
//					//System.out.println("Prime numbers are "+first);
//					li.add(first);
//				}
//				//System.out.print(first);
//				int sum1 = first+second;
//				first = second;
//				second = sum1;
//
//		
//			}
//			
//			System.out.println("Prime Numbers "+li);
//		
//		
//		
//		
//	}
}
