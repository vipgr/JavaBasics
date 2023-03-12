package com.javabasic.intern;

public class ReflexAPI {

		public static void main(String[] args) {
			
			ReflexAPI ref = new ReflexAPI();
			Class clazz = ref.getClass();
			System.out.println(clazz.getSimpleName());
			
			Arraylistmethod ar1 = new Arraylistmethod();
			Class clax = ar1.getClass();
			System.out.println(clax.getClassLoader());
			System.out.println(clax.getClasses());
					
		}
	
			
}
