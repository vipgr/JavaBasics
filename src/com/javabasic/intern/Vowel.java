package com.javabasic.intern;

public class Vowel {

	public static void main(String[] args) {
		
		// vowel : aeiou
		
		char ch = 'O';
		
		// using if 
		
		if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
			System.out.println( ch + " is a Vowel");
		}else {
			System.out.println( ch + " is a consonant");
		}
		
		
		//using switch case
		
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case '0':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':	
		System.out.println( ch + " is a Vowel");
		break;
		default :
			System.out.println( ch + " is a consonant");
			break;
		}
	}

}
