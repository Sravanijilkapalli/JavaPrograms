package com.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<String>();
		
		hs.add("ramya");
		hs.add("sai");
		hs.add("ramya");
		
		//System.out.println(hs);
		
		for(String b : hs) {
			
			System.out.println(b.toUpperCase());
			
		}
		
		
		Set<Integer> ts = new TreeSet<Integer>();
		
		ts.add(3);
		ts.add(1);
		ts.add(2);
		
		System.out.println(ts);
		
		int [] z = new int[5];
		z[0] = 8;
		z[1] = 2;
		z[2] = 5;
		z[3] = 3;
		z[4] = 9;
		
		conversion(z);
		setconversion(ts);

	}
	
	public static void conversion(int[] a) {
		
		Set<Integer> b = new TreeSet<Integer>();
		
		for(Integer c :a) {
			
			b.add(c);
		}
		
		System.out.println(b);		
	}

	public static void setconversion(Set<Integer> s) {
		
		int[] c = new int[s.size()];
		
		int k =0;
		
		for(Integer d : s) {
			
			c[k] = d;
			k=k+1;
			
		}
	
		System.out.println(c);
		for(int i=0 ; i<c.length; i++) {
			
			System.out.println(c[i]);
			
		}
		
	}
}
