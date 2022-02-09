package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		
		Test1 obj = new Test1();
		
	
	boolean result =	obj.anagram("abcd" , "dcba");
		
		System.out.println(result);
		
		
		String result1 = obj.decimal("10", "01");
		
		System.out.println(result1);
		
		int[] input = new int[5];
		
		input[0] = 5;
		input[1] = 9;
		input[2] = 3;
		input[3] = 4;
		input[4] = 2;

		
		int[] result2 = obj.sortingArray(input);
		
		for(int i=0 ; i<result2.length; i++ ) {
			
			
			System.out.println(result2[i]);

		}


		List< Integer> ip = new ArrayList<>(); 
		
		ip.add(1);
		ip.add(1);
		ip.add(2);
		ip.add(3);
		ip.add(4);

		boolean result3 =	obj.duplicates(ip);
		System.out.println(result3);

		
	}
	
	public  boolean  anagram(String a , String b) {
		
		String str=null;
		String str1=null;
		
			
			char[] c = a.toCharArray();
			Arrays.sort(c);
		    str1 = String.valueOf(c);

			char[] d = b.toCharArray();
			
			Arrays.sort(d);
			
			 str = String.valueOf(d);
			
		
		if(str1.equals(str)) {
			
			return true;
			
		}else {
			
			
			return false;
		}
			
	}
	
	
	
	public String decimal(String num1 , String num2) {
		
		StringBuilder Result = new StringBuilder();
		
		int i = num1.length()-1;
		
		int j = num2.length()-1;
		
		int carry=0 ; 
		
		while(i>=0 || j>=0){
			
			int sum= carry;
			
			if(i>=0) {
				
				sum += num1.charAt(i--) -'0';
				
			}
			
			
			if(j>=0) {
				
				sum += num2.charAt(j--) -'0';

				
			}
			
			 Result.append(sum%2);
			
			 carry = sum/2;
			
			
		}if(carry!=0) {
			
			Result.append(carry);
		}
		
		return Result.reverse().toString();
	}
	
	
	public int[] sortingArray(int[] a) {
		
		
		int temp;
		
		for(int i=0 ; i<a.length ; i++) {
			
			for(int j= i+1 ; j<a.length ; j++ ) {
				
				if(a[i]> a[j]) {
					temp = a[i];
					a[i] = a[j];
					
					a[j] = temp;
	
				}
				
			}
		
		}
		
		return a;
	}
	
	
	public boolean duplicates(List<Integer> a) {
		
		Set<Integer> b = new HashSet<>();
		
		for(int c :a) {
			
			
			b.add(c);
		}
		
		if(a.size()==b.size()) {
			
			
			return true;
		}else {
			
			
			return false;

		}
		
	}
	
}
