package com.javabasic.intern;

public class Testclass extends NewParentclass implements ParentInt1,ParentInt2 {



	@Override
	public void send() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keys() {
		// TODO Auto-generated method stub
		
	}
	

	public static void main(String[] args) {
		Testclass tc = new Testclass();
		tc.newf();
		tc.newgenInter();
		
		ParentInt1.methodfrominterface();
		
		System.out.println();
		

	}
	
	
	

}
