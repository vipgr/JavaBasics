package com.javaoops.intern;

public class FunctionsinJava {
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsinJava obj = new FunctionsinJava();
		obj.test();
		obj.test(10);
		System.out.println(obj.test(20, 30));
		System.out.println(obj.testnew(30, 50));
		System.out.println(obj.stringNew("100"));
		obj.p=60;
		obj.q=80;
		System.out.println("value of p :- "+obj.p+" value of q :- "+obj.q);
		System.out.println("After swap");
		obj.callbyref(obj);
		System.out.println("value of p :- "+obj.p+" value of q :- "+obj.q);
		 	 	
		String dt = "johni";
		String ds = "john";
		System.out.println(ds);
		ds = ds.concat(dt);
		
		System.out.println(dt == ds);
		System.out.println(ds);
		
	}
	
	public void test() {
		System.out.println("Test - no input and return");
	}
	
	public void  test(int s) {
		System.out.println("Test method overload - input but no return :-  "+s);
	}
		
	
	public int test(int x, int y) {
		//Function call callby value or pass value
		System.out.println("test with input and return ");
		int y1 = x+y;
		return y1;
	}
	
	public int test(String x, int y) {
		return 0;	
		
	}
	
	
	public Object testnew(int r , int y) {
		
		//integer to string vonversion
		 System.out.println("test with input int  and return object ");
		 int sum = r+y;
		 String str1 = "300";
		 String newStr= str1+String.valueOf(sum);
		 return newStr;
		
	}
	
	public int  stringNew(String s) {
		// Number format exception when converts string to int if we have alphanumeric characters
		return (2+Integer.parseInt(s));
	}
	
	public void callbyref(FunctionsinJava f) {
		// call by reference value 
		int temp = f.p;
		f.p=f.q;
		f.q=temp;
		
	
	}
	
	
}
