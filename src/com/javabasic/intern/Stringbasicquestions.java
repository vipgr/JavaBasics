package com.javabasic.intern;

public class Stringbasicquestions {

	public static void main(String[] args) {

		String input = "vip12hikl45k";
		System.out.println("sure++++-----> " + input.substring(0));
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isLetter(c)) {
				sb.append(c);
			}
		}

		String reversed = sb.reverse().toString();
		System.out.println("reversed++++-----> " +reversed);
		int j = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isLetter(c)) {
				// System.out.println(input);
				input = input.substring(0, i) + reversed.charAt(j) + input.substring(i + 1);
				 System.out.println("reeeee-- "+input);
				j++;
			}
		}

		System.out.println("Reversed string: " + input);
	}

}
