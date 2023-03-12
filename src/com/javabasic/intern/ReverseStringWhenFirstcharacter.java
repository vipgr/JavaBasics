package com.javabasic.intern;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ReverseStringWhenFirstcharacter {

	public static void main(String[] args) {

		String input = "vip12hikl45kio";
		onlyReverseFirstnon(input);
		onlyReverseStringNumber(input);

	}

	public static void onlyReverseFirstnon(String input) {
		int firstNonLetterIndex = input.length();

		// Find the first non-letter character
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isLetter(input.charAt(i))) {
				firstNonLetterIndex = i;
				break;
			}
		}

		// Reverse the substring before the first non-letter character
		String reversed = new StringBuilder(input.substring(0, firstNonLetterIndex)).reverse().toString();
		input = reversed + input.substring(firstNonLetterIndex);

		System.out.println("Reversed string: " + input);
	}
	
	public static void onlyReverseStringNumber(String input) {
		//"1vip12hikl45kio";
		StringBuilder sb = new StringBuilder();
        String output = "";
        boolean isConsecutive = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                isConsecutive = true;
                sb.append(c);
            } else {
                if (isConsecutive) {
                    output += new StringBuilder(sb.toString()).reverse().toString();
                    sb = new StringBuilder();
                    isConsecutive = false;
                }
                output += c;
            }
        }

        if (isConsecutive) {
            output += new StringBuilder(sb.toString()).reverse().toString();
        }
        System.out.println("Reversed string: " + output);
    }
	
	
	public static void stringfr(String str) {
		
		//aaa3bbbb4cc2
		str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
		char[] ch = str.toCharArray();
		Map<Character, Integer> hmap = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (hmap.containsKey(ch[i])) {
				Integer count = hmap.get(ch[i]);
				hmap.put(ch[i], count + 1);
			} else {
				hmap.put(ch[i], 1);
			}
		}
		
		
		
		
		
	}
	

}
