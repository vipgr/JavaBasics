package com.javabasic.intern;

public class Alphabeticcheck {

	public static void main(String[] args) {
		
		char c = 'b';
		
		if((c>='a' && c<='z')||(c>='A' && c<='Z'))
			System.out.println(c + ":- Is an alphabet");
		else
			System.out.println(c + ":- Is not an alphabet");
		
		
	}

}
