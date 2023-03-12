package com.javabasic.intern;

public class AmstrongNum {

	public static void main(String[] args) {
		
		//1*1*1 + 5*5*5 + 3*3*3 = 153
		int number = 153;
		int amcheck = number;
		int size = ((Integer)number).toString().length();
		
		if ((amstrongNumCheck(number,size)) == amcheck) {
			System.out.println("The Number given is amstrong");
		}else {
			System.out.println("The Number given is not amstrong");
		}

	}
	
	public static int amstrongNumCheck(int number, int size) {
		int sum = 0;
		if (number>0) {
			
			while(number !=0) {
			//for (int i =1;i<=size;i++) {
				int n = number % 10;
				sum = sum+(int)(Math.pow(n, size));
				number = number/10;
			}
			
		}else {
			 System.out.println("Please enter valid number");
			// return number;
		}
		
		return sum;
	}
		
	
	
	
	
	
}
