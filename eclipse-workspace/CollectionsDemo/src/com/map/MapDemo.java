package com.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	
	public static void main(String[] args) {
		
		
		Map<Integer , Character> hm = new HashMap<Integer , Character>();
		
		hm.put(1 , 'j');
		hm.put(2 , 's');
		hm.put(3 , 'r');

		//System.out.println(hm);
		
		for(Entry<Integer, Character> a : hm.entrySet()) {
			
			System.out.println(a.getKey());
			System.out.println(a.getValue());
		}
		
		Map<Integer , Integer> h = new HashMap<Integer , Integer>();
		h.put(1, 3);
		h.put(2, 10);
		h.put(3, 3);
		h.put(10, 5);
		h.put(6, 5);
		
		repeat(h);
		
		Map<String , Integer> Score = new HashMap<String , Integer>();

		Score.put("Raja", 90);
		Score.put("sravs", 80);
		Score.put("sraj", 100);
		Score.put("yuvi", 98);
		Score.put("ramya", 70);
		Score.put("sai", 85);
		
		marks(Score);
		lowmark(Score);
		
		System.out.println(Score.size());
		System.out.println(Score.get("Raja"));
		System.out.println(Score.keySet());
		
		for(String s: Score.keySet()) {
			
			System.out.println(Score.get(s));
			
		}
		
		int[] a = {1,2,4,5,2,4,5,2,1};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int x: a) {
			if(map.containsKey(x)) {
				int temp = map.get(x);
				map.put(x, temp + 1);
			}else {
				map.put(x, 1);
			}
		}
		
		System.out.println(map);
		
		
		Map<String , Integer> buterfle = new HashMap<String , Integer>();
		
		buterfle.put("red", 408);
		buterfle.put("green", 1000);
		buterfle.put("pink", 569);
		buterfle.put("white", 863);
		buterfle.put("brown", 989);
		buterfle.put("black", 567);
		buterfle.put("orange",3259);
		buterfle.put("blue", 3258);

		butterfly(buterfle);
	}
	
	
	public static void repeat(Map<Integer , Integer> a) {
		
		int max = 0;
		
		for(Entry<Integer , Integer> c : a.entrySet()) {
			
			if(c.getValue() > max) {
				max = c.getValue();
			}
			
		}
		
		System.out.println("max:" + max);
      for(Entry<Integer , Integer> c : a.entrySet()) {
			
			if(c.getValue() == max) {
				System.out.println(c.getKey());
			}
		}
	}
	
	public static void marks(Map<String , Integer> b) {
		
		int highest = 0;
		
		for(Entry<String , Integer> a :b.entrySet()) {
			
		/*	if(a.getValue()> highest) {
				
				highest = a.getValue();
				

			}*/
			
			highest = Math.max(highest, a.getValue());
		}
		
		System.out.println(highest);

	   for(Entry<String , Integer> result : b.entrySet()) {
		   
		   if(result.getValue()== highest) {
			   
			   System.out.println(result.getKey() + " scored highest marks " + result.getValue() );
			   
		   }
	   }
	}
	
	public static void lowmark(Map<String , Integer> d) {
		
		int lowest = Integer.MAX_VALUE;
		
		for(Entry<String , Integer> y : d.entrySet()) {
			
			/*if(y.getValue()< lowest) {
				
				
				lowest= y.getValue();
					
			}*/
			
			lowest = Math.min(lowest, y.getValue());
		}
		System.out.println(lowest);
		for(Entry<String , Integer> result  : d.entrySet()) {
			
			if(result.getValue()==lowest) {
				   System.out.println(result.getKey() + " scored lowest marks " + result.getValue() );

			}
		}
	}
	
	public static void butterfly(Map<String , Integer> a) {
		
		int max=0;
		
		for(Entry<String , Integer> result :a.entrySet()) {
			
			if(result.getValue() >max) {
				
				max= result.getValue();
				
			}
							
			}
		
		for(Entry<String , Integer> output :a.entrySet()) {
			
			if(output.getValue()== max) {
				
				System.out.println(output.getKey() + " has highest  count of " + output .getValue());
	
		}
		}
		
	}
	
}
