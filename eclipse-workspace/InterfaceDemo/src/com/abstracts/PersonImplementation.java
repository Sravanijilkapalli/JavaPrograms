package com.abstracts;

public class PersonImplementation extends Person {
	
	public static void main(String[] args) {
		
		Person obj = new PersonImplementation();
		
		String jsr= obj.name("Sravani");
		System.out.println(jsr + " name of the given variable");
		
		int krr = obj.age(27);
		System.out.println(krr + " age of the given variable");

		obj.fullName("raju");
	    obj.add(1, 2 , 3);

		
	}

	@Override
	public String name(String a) {
	  return a;
	}

	@Override
	public int age(int b) {
		return b;
	}
	

}
