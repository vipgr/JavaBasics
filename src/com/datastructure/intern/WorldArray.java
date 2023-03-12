package com.datastructure.intern;

public class WorldArray {

	public static void main(String[] args) {
		
		/*
		 * Disadvantages
		 	1. Array size is fixed - To overcome this collection - dynamic array - array list,hash table
		 	2. stores only similiar types of datatype - To avoid this problems we can use type of arrays as Object
		 */
		
		
		
		// Array declaration 
		int intarray[] = new int [5];
		
		// Value insertion
		
		for (int i =0;i<5;i++)
			intarray[i]=i;
		
		
		// Value printing
			
		for (int i =0;i<5;i++)
			System.out.print( intarray[i]+","+" ");
		
		System.out.println("length of the array is "+ intarray.length);
	}

}
