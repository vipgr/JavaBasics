package com.javaoops.intern;

public class ChildSecond extends Base{

	public static void main(String[] args) {
		
		Base b = new ChildSecond();
		b.add();
	
	}
	
	public  void add() {
		System.out.println("I am add from child class");
	}

}
