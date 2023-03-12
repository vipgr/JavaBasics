package com.javabasic.intern;

public interface ParentInt1 {

	public void send();
	public void keys();
	public void newf();

	default void newgenInter() {
		System.out.println("new default");
	}
	
	static void  methodfrominterface() {
		System.out.println("iam static from interface");
	}

}
