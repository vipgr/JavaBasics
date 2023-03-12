package com.javabasic.intern;

import org.apache.commons.lang3.StringUtils;

public class ConverCase {

	public static void main(String[] args) {
		
		String st = "VipIn GANesh";
		ConverCase.convertCase(st);
		ConverCase.utilString(st);
		ConverCase.checkString(st);
		ConverCase.wholeCase(st);
	}
	
	public static void convertCase(String str) {
		
		char [] crs =str.toCharArray();
		for (int i=0;i< crs.length;i++) {
			crs[i]= Character.isUpperCase(crs[i])
					? Character.toLowerCase(crs[i])
					:Character.toUpperCase(crs[i]);
		}
		
		System.out.println(new String(crs));
	}

	
	public static void wholeCase(String str) {
		
		//StringBuffer buffer = new StringBuffer(str);
		
		System.out.println(str.toUpperCase());
		
	}
	
	public static void utilString(String str) {
		
        System.out.println( StringUtils.isAllUpperCase(str) );
	}
	
	public static void checkString(String str) {
		 if( str.equals(str.toUpperCase()) )
	            System.out.println("String is uppercase");
	        else
	            System.out.println("String is not uppercase");
	        
	}
}
