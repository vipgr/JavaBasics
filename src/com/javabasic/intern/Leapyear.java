package com.javabasic.intern;

import java.util.Scanner;

public class Leapyear {
	
	/*
	 * divisible by 4  for all the century years -- ending with 00
	 * century year is a leap year only when its perfectly  divisble by 400
	 * 
	 * 1900 is not  a leap year
	 * 2012 leap year
	 * */

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the year :-");
		int year = reader.nextInt();
		
		boolean leap = false;
		
		if (year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					leap = true;
				}else {
					leap = false;
				}
			}else {
				leap = true;
			}
		}else {
			leap = false;
		}

		
		if (leap) {
			System.out.println(year +": - Year is leap year ");
		}else {
			System.out.println(year +": - Year is not leap year ");
		}
	}
	

}
