package com.javabasic.intern;

public class FindtotalSum {

	// Programe to find the numbers while adding to get 8
	public static void main(String[] args) {
		
		int arr [] = {10,15,20,3,5,8,1,0};
		int sum =0;
		int exp =8;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				sum = arr[i]+arr[j];
				if(sum == exp) {
					System.out.println("Values are "+arr[i]+" and "+arr[j]);
					break;
				}
			}
					
		}
		
	}

}
