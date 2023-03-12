package com.javabasic.intern;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check prime ");
		System.out.println();
		int number = sc.nextInt();
		//primecheck(number);
		//prime(100);

	}

	// study this method
	static void checkPrime(int n) {
		int i, m = 0, flag = 0;

		m = n / 2;

		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else
	}

	public static void prime(int n) {
		int i = 0;
		int num = 0;
		// Empty String
		String primeNumbers = "";

		for (i = 1; i <= n; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}

	
	
}
