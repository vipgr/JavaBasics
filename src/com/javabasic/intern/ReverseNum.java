package com.javabasic.intern;

public class ReverseNum {

	public static void main(String[] args) {
		
		int num =1234;
		int number =2545;
		String numtoreverse ="23490312867";
		
		int rev =0;
		
		while(num!=0) {
			int n  = num % 10;
			rev = rev * 10+n;
			num = num/10;
			
		}
		
		System.out.println("Enter reversed numbered "+rev);
		
		//ReverseNum.numberReverse(number);
		ReverseNum.stringNumbermatcherReverse(numtoreverse);
	}
	
	// using String builder
	public static void numberReverse(int n) {
		
		String numstring = Integer.toString(n);
		//System.out.println(numstring);
		StringBuilder br = new StringBuilder(numstring);
		System.out.println("Enter reversed numbered "+ Integer.parseInt(br.reverse().toString()));
		
	}
	
	
	public static void stringNumbermatcherReverse(String numtoreverse) {
		String str = numtoreverse.replaceAll("[^1-8]", "");
		System.out.println(str);
	}
	
}
