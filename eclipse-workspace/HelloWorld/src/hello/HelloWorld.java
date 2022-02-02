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
	
	
}
