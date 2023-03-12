package com.javabasic.intern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceStringMatcher {

	public static void main(String[] args) {
		String s = "Geeks for Geeks";
		String regex = "ee";
		String toReplace = "a";

		ReplaceStringMatcher.stringMatch(s, regex, toReplace);

	}

	public static void stringMatch(String s, String regex, String strReplace) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		System.out.println(m.replaceAll(strReplace));

	}

}
