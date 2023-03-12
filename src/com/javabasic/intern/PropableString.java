package com.javabasic.intern;

public class PropableString {

	public static void main(String[] args) {
		
		String s = "ABC";
		printstringper(s, "");

	}

	static void printstringper(String str, String per) {
		
		if (str.length() == 0) {
			System.out.print(per + ""+",");
			return;
			}
		
		for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		String ros = str.substring(0, i) + str.substring(i + 1);
		printstringper(ros, per + ch);
		}
	}
}
