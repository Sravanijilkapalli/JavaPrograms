package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
		
		al.add("srav");
		al.add("raja");
		al.add("sraj");
		al.add("sraj");
		
		
		//for(int i=0; i<al.size() ; i++) {
			
		//	System.out.println(al.get(i).toUpperCase());
		//}
		
		for(String a : al) {
			
			System.out.println(a);

		}

		System.out.println(al);
		
		
		
		List<Integer> ll = new LinkedList<Integer>();
		
		ll.add(4);
		ll.add(2);
		ll.add(5);
		System.out.println(ll);
		
		List<Integer> l2 = new LinkedList<Integer>();
		l2.add(4);
		l2.add(2);
		l2.add(8);


		Stack<Integer> s = new Stack<Integer>();
		
		s.push(7);
		s.push(12);
		s.push(0);
		
		System.out.println(s.pop());

		Queue<String> q = new LinkedList<String>();
		
		q.add("sravani");
		q.add("raja");
		q.add("jilkapalli");
		
		System.out.println(q.poll());
		
		intersection(ll , l2);
        union(ll , l2);
        
		List<Integer> sum = new LinkedList<Integer>();
		sum.add(4);
		sum.add(2);
		sum.add(8);
		sum.add(7);
		sum.add(856);
		sum.add(899);

		max(sum);

		int[] a = new int[5];
		a[0] = 1;
		a[1] = 8;
		a[2] = 9;
		a[3] = 6;
		a[4] = 5;

		conversion(a);
		
		listconversion(sum);
		listtoset(sum);
		List<Integer> jsr = new LinkedList<Integer>();
		jsr.add(1);
		jsr.add(2);
		jsr.add(4);
		jsr.add(7);
		jsr.add(9);
		jsr.add(3);
		jsr.add(2);
		jsr.add(5);
		
		duplicate(jsr);
		dupli(jsr);
		
		List<Integer> j = new ArrayList<Integer>();

		j.add(1);
		j.add(2);
		j.add(3);
		
		concatination(j);

		
	}
	
	public  static void  intersection(List<Integer> a , List<Integer> b) {
		
		List<Integer> c= new ArrayList<>();
		
		for(int i =0 ; i<a.size() ; i++){
			
			for(int j=0 ; j<b.size() ; j++) {
				
				
				if(a.get(i)==b.get(j)) {
					
				c.add(a.get(i));

				}

			}
			
		}
		System.out.println(c);

		
	}
	
	
	public static void union(List<Integer> a , List<Integer> b) {
		
		Set<Integer> hs = new HashSet<Integer>();
		
		for(int i=0; i<a.size(); i++) {
			
			
			hs.add(a.get(i));
			
		}

		for(int j=0 ; j<b.size() ; j++) {
			
			hs.add(b.get(j));
			
		}
		
		System.out.println(hs);
	}
	
	public static void max(List<Integer> a) {
		
		int max=0;
		
		for(int i=0; i<a.size(); i++) {
			
			/*if(a.get(i)>max) {
				
				max= a.get(i);

			} */
			
			max=Math.max(a.get(i) , max);
		}
		
		System.out.println(max + " is maximum number for given list");
	}
	
	public static void conversion(int [] a) {
		
		List<Integer> c= new ArrayList<>();
 
		for(int i=0; i<a.length ; i++) {			
			c.add(a[i]);

		}
		Collections.sort(c);//sorting a list
		System.out.println(c);
		
	}
	
	public static void listconversion(List<Integer> a) {
		
		int [] b = new int[a.size()];
		
		
		for(int i=0; i<a.size() ; i++) {
			
			b[i] = a.get(i);
			
			System.out.println(b[i]);
			
		}	
	}	
	
	public static void listtoset(List<Integer> a) {
		
		Set<Integer> hs = new HashSet<Integer>();

		for(int i=0 ; i<a.size() ; i++) {
			
			hs.add(a.get(i)); 
		}
		System.out.println(hs);
	}
	
	public static void duplicate(List<Integer> a) {
		
		boolean t=true;
		
		for(int i=0; i<a.size() ; i++) {
			
			for(int j=i+1 ; j<a.size() ; j++) {
				
			

				if(a.get(i) == a.get(j)) {
					
				t=true;
				break;

				}else {
					
					t=false;
				}

			}
			
			if(t) {
				
				break;
			}
		}
		
		if(t) {
			System.out.println("it contains duplicate elements");
		}else {
			
			System.out.println("it does not contains duplicate elements");

		}
	}
	
		public static void dupli(List<Integer> a) {
		
			Set<Integer> hs = new HashSet<Integer>();

			for(int i=0 ; i<a.size() ; i++) {
				
				hs.add(a.get(i));
				
			}
			if(hs.size() == a.size()) {
				
				System.out.println("not duplicate");
				
			}else {
				
				System.out.println(" duplicate");

				
			}
	}
		
		public static void concatination(List<Integer> a) {
			
			List<Integer> b = new ArrayList<Integer>();
			List<Integer> c = new ArrayList<Integer>();
			List<Integer> d = new ArrayList<Integer>();


		
			for(int i =0 ; i<a.size() ; i++) {
				b.add(a.get(i) );
				c.add(a.get(i));
				
				
			}
			
			System.out.println(c + "concat result");
			
		}
}
