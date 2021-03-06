package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntroductionToArrays {
	
	
	public static void main(String[] args) {
		
		//datatype[] variablename = new datatype[size is mandatory];
		
		//int[] a = {1, 2, 3};
		
		String[] strings = new String[5];
		
		strings[0] = "sravani";
		strings[1] = "rajashekar";
		strings[2] = "ramyaseetharam";
		strings[3] = "sainarayana";
		strings[4] = "yuvinanitha";
		
		Arrays.sort(strings);
		
		for(int i=0; i<strings.length; i++) {
			//char[] t = strings[i].toCharArray();
			System.out.println(strings[i]);

		}
		
		
		int[] obj = new int[6];
		
		obj[0] = 10;
		obj[1] = 17;
		obj[2] = 9;
		obj[3] = 75;
		obj[4] = 8;
		obj[5] = 110;
		Arrays.sort(obj);
		for(int i=0 ; i<obj.length; i++) {
			
			System.out.println("lenght values of array "+obj[i]);	
		}
		IntroductionToArrays introductionToArrays = new IntroductionToArrays();
		
		int vsr = introductionToArrays.sumOfNum(obj);
		System.out.println("sum of the given numbers  "+vsr);
		
		
		int krr = introductionToArrays.evenSum(obj);
		System.out.println(" sum of the even index numbers "+krr);
		
		int jsr = introductionToArrays.oddProduct(obj);
		System.out.println("multiplication values of the odd index numbers "+jsr);

        int[] mnyr = introductionToArrays.add2Array(obj);
        
        for(int i=0; i<mnyr.length ; i++) {
        	
    		System.out.println(" add of 2 two given array numbers  "+mnyr[i]);    		
        }
        int jnr = introductionToArrays.maxOfNumber(obj);
		System.out.println(" Max number of the given array  "+jnr);

		int jar =introductionToArrays.minArray(obj);
		System.out.println(" min number of the given array  "+jar);

		String jsrr = introductionToArrays.maxStringArray(strings);
		System.out.println(" max length string in given array  "+jsrr);

		String jyrr = introductionToArrays.minStringArray(strings);
		System.out.println(" min length string in given array  "+jyrr);

		
		 searchArray(obj , 17);
		 
		 String[] msr = introductionToArrays.uppaerCase(strings);
		 
		 for(int i=0; i<msr.length; i++) {
			 
				System.out.println(" uppercase letter  "+msr[i]); 
		 }			
		 addingString("1+2+3");
		 
			//datatype[] variablename = new datatype[size is mandatory];

		 int[] order = new int[5];
		 
		 order[0] = 10;
		 order[1] = 0;
		 order[2] = 8;
		 order[3] = 4;
		 order[4] = 19;
		 
		 
		 arraySorting(order);
		 
		 compare("username" , "Password");
		 contain("i am a good boy" , "boy");
		 
		 int[] sr = indice(order, 12);
		 
		 for(int i=0 ; i<sr.length ; i++) {
			 
			 
			 System.out.println(sr[i]);
		 }
		 
		 ind(order , 12);
		 anagram("srav" , "vras");
		
			}
	
	
	public  int sumOfNum(int[] a) {
		
		int sum=0;
		
		for(int i= 0; i<a.length; i++) {
			
			sum=sum+a[i];	
		}
		
		return sum;
	}
	
	
	
	public int evenSum(int[] b) {
		int sum=0;
		
		for(int i=0 ; i<b.length ; i++) {
			
			if(i%2==0) {
				
				sum= sum+b[i];
				
			}
		}
		
              return sum;
	}
	
	public int oddProduct(int[] c) {
		
		int product = 1;
		
		for(int i=0 ; i<c.length; i++) {
			
			if(i%2==1) {
				
				product = product*c[i];
			}
		}
		return product;
	}
	
	
	public int[] add2Array(int[] d) {
		
		int[] add=new int[d.length];
		
		for(int i=0 ; i<d.length ; i++) {
			
			add[i]= d[i]+2;
			
		}
		
		return add;
		
	}
	
	public int maxOfNumber(int[] e) {
		
		int max=0;
		
		for(int i=0 ; i<e.length; i++) {
			
			if( e[i]>max) {
				max=e[i];
			}
		}
		return max;
	}
	
	public int minArray(int[] f) {
		
	int min=Integer.MAX_VALUE;
	
	for(int i=0; i<f.length; i++) {
		
		if(f[i]<min) {
			
			min=f[i];
			
		}
	}
		
		return min;
		
	}
	
	public String maxStringArray(String[] g) {
		
		int max= 0;
		String output = null;
		
		for(int i=0; i<g.length; i++) {
			
			if(g[i].length()>max) {
				
				
				max=g[i].length();
				output=g[i];
			}
		}
		
		return output;
		
	}
	
	public String minStringArray(String[] h) {
		
		int min= Integer.MAX_VALUE;
		String output = null;
		
		
		for(int i=0; i<h.length ; i++) {
			
			if(h[i].length()<min) {
				
				min=h[i].length();
				
				output=h[i];
			}
			
		}
		
	return output;	
	}
	
	public static void searchArray(int[] k, int j) {
		
	boolean d=true;
		
		for(int i=0; i<k.length; i++) {
			
			
			if(k[i] == j) {
				d=true;
				break;
				
			}else {
				d=false;

			}		
		}
		if(d) {
			System.out.println(j + " is availabe in the given integer array");
			
		}else {
			
			System.out.println(j + " is not availabe in the given integer array");

			
		}
	}
	
	public String[] uppaerCase(String[] g) {
		
		String[] output= new String[g.length];;
		
		for(int i=0; i<g.length ; i++) {
			
			
			 output[i]=g[i].toUpperCase();
			
			
		}
		
		return output;
		
		
	}
	
	public static void addingString(String b) {
		
		int Sum = 0;
		
		String [] split =b.split("\\+");
		for(int i=0 ; i<split.length; i++) {
			
			Sum = Sum+Integer.parseInt(split[i]);
			
		}
		
		System.out.println(Sum);
	}
	
	
	public static void arraySorting(int [] sort ) {
		
		int temp;
		
		for(int i=0 ; i<sort.length; i++) {
			
			for(int j=i ; j<sort.length ; j++) {
				
				if(sort[i]> sort[j]) {
					
					temp= sort[i];
					sort[i] = sort[j];
					
					sort[j] = temp;	
				}
			}
			
		}
		
		for(int i=0; i<sort.length ; i++) {
			
			System.out.println(sort[i]);
			
		}
		
	}
	
	public static void compare(String input1 , String input2) {
		
		String a = "username";
		String b = "password";
		
		if(input1.equals(a) && input2.equals(b)) {
			
			System.out.println("Username and Password are correct");
			
			
		}else if(!input1.equals(a) && input2.equals(b)) {
			
			System.out.println("Username is not correct");

			
		}else if(input1.equals(a) && !input2.equals(b)) {
			
			System.out.println("password is not correct");

			
		}else {
			
			System.out.println("both the username and password is not correct");

			
		}
	}
	
	public static void contain(String a , String b) {
		
		if(a.contains(b)) {
			
			System.out.println("true");
			
			
		}else {
			
			System.out.println("false");

		}
	}
	
	public static int[] indice(int[] a , int b) {
		
		int[] c= new int[2];
		for(int i=0 ; i<a.length ; i++) {
			
			for(int j=i+1 ; j<a.length; j++) {
				
				if(a[i]+a[j]==b) {
					
					c[0]=i ; 
					c[1] = j;		
				}
			}
		}
		return c;
	}
	
	
	public static void  ind(int[] a, int target) {
		
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0 ; i<a.length ; i++) {
			
			if(map.containsKey(target-a[i])) {
				
				System.out.println(map.get(target-a[i]));
				
				System.out.println(i);
				
			}else {
				
				map.put(a[i], i);
	
			}	
		}
	}
	
	public static void anagram(String s , String t) {
		
		
		
		char[] ch = s. toCharArray();
		Arrays.sort(ch);
	      String str = new String(ch);

		char[] hc = t.toCharArray();
		Arrays.sort(hc);
	      String str1 = new String(hc);

		if(str.equals(str1)) {
			
			System.out.println("true");
			
		}else {
			
			System.out.println("false");
			
			
		}
			
	}
	
	
		}
	

