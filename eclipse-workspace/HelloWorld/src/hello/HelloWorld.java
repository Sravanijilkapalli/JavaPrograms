package hello;


public class HelloWorld {
	
	int rr = 4;
	
	public static void  main(String[] args){
		
		String ab="helloworld";
		
		int a =9;
		
		int b=6;
		
		double d = 10.95764;
		double e = 1.96;
		int c= a+b;
		double f =d+e;
				
		System.out.println(ab);
		System.out.println("result for add a is " + a + "+" +b+  " is and equals to "+c);
		System.out.println(f);
		
		add(1,5);
		int m= add(1,5);
		
		int x = m+2;
		
		System.out.println(m);
		
		System.out.println(x);
	
		
		sub(2 , 9);
		
		// static method syntax: methodname(parameters);
		//ClassName object = new ClassName();
		// non-static method syntax:  return type variable= object.methodname(parameters);
		
		HelloWorld obj  = new HelloWorld();
		
		int ins=obj.mul(8 , 9);
		
		int j = ins*3;
		
		System.out.println(ins+ "and the value of mul of ins into 3 is "+j);
		
		//System.out.println(rr);
		
		String jsr = twoStringsum("123456789" , "234567890");
		String jsr1 = twoBinarySum("1011101" , "1010111");

		System.out.println(jsr);
		System.out.println(jsr1);

	}
	
	
	
	public static int add(int a , int b) {
		
		int z= a+b;
		
		//HelloWorld x = new HelloWorld();
		//System.out.println(x.rr);
		
		return z;
	
		
	}
	
	
	public static void sub(int g , int h) {
		
		
		System.out.println( g );
		
		
		
		
	}
	
	
	public int mul(int r, int u) {
		
		
		int b = r * u;
		
		return b;
		
	}
	
	public static String twoStringsum(String num1 , String num2) {
		
		StringBuilder result = new StringBuilder();
		
		int carry=0;
		
		int i= num1.length()-1;
		int j= num2.length()-1;
		
		while(i>=0|| j>=0) {
			
			int sum=carry;
			
			
			if(i>=0) {
				
				sum += num1.charAt(i--) - '0';
				
			}
			if(j>=0) {
				
				sum += num2.charAt(j--) - '0';

			}
			
			result.append(sum%10);
			
			carry = sum/10;
		}if(carry!=0) {
			
			result.append(carry);
		}
		
		return result.reverse().toString();

	}
	
	public static String twoBinarySum(String num1 , String num2) {
		
		StringBuilder result = new StringBuilder();
		
		int i = num1.length()-1;
		int j= num2.length()-1;
		
		int carry =0;
		
		while(i>=0 || j>=0) {
			
			int sum = carry;
			
			if(i>=0) {
				
				sum += num1.charAt(i--) - '0';
				
			}
			if(j>=0) {
				
				sum += num2.charAt(j--) - '0';
				
			}
			
			result.append(sum%2);
			
			carry = sum/2;
			
		}
		if(carry!=0) {
			
			result.append(carry);

		}
		
		return result.reverse().toString();

		
	}
}
