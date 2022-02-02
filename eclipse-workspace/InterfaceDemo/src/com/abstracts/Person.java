package com.abstracts;

public abstract class Person {
	
		
		//we cannot create object for abstract class
	
	
	public abstract String name(String a);
	public abstract int age(int b);
	
	public  void fullName(String c) {
		System.out.println(c);
		
	}
//overloading
	public void add(int a , int b) {
		
		int c = a+b;
		
		System.out.println(c);
		
	}
	
	public  void add(int a, int b , int d) {
		
		int c= a+b+d;
		
		System.out.println(c);
		
	}
}
