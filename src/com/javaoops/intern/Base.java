package com.javaoops.intern;

public class Base {
	
	
	{
		System.out.println("Non static class of Base class :- First one");
	}
	
	{
		System.out.println("Non static class of Base class :- Second one");
	}
	
	public void method1() {
		System.out.println("Method 1 :- ");
	}
	
	public  void add() {
		System.out.println("I am add from base class");
	}
	
	Base(){
		
		System.out.println("Base constructor :- 5");
		method1();
	}

}
