package IfCondition;

public class Triangle {
	
	
	public static void main(String[] args) {
		
		int a= 60;
	    int b= 80;
	    int c=60;
	    
	    int e= 80;
	    int g=20;
	    int f=20;
	    
	    int j= 50;
	    int s=40;
	    int r=90;
	    
		Triangle srav = new Triangle();
		
		boolean raj = srav.ifc(a , b , c);
		
		if(raj) {
			
			System.out.println("it is a triangle");
			
		}else {
			System.out.println("it is not a triangle");
			
		}
		
			boolean ims = srav.ifd(a , b , c);
			
			if(ims) {
			
				
				System.out.println("it is a equilateral triangle");

				
			}else {
				
				
				System.out.println("it is not a equilateral triangle");

				
			}
			

			
			boolean ind = srav.idi(e , g , f);
			
			if(ind) {

				System.out.println("it is  a isosceles  triangle");

			}else
				
			{
				
				System.out.println("it is not a isosceles  triangle");

			}
				
			
			
			boolean inv = srav.idr(j , s ,r);
			
			if(inv) {
				
				System.out.println("it is  a rectangle  triangle");

			}else
			{
				
				System.out.println("it is not a rectangle  triangle");

			}

		}
		
		
	
	
	
	public boolean ifc(int a, int b ,int c) {
		
		
		if(a+b+c== 180) {
			
			return true;
			
		}else;
		
		return false;
		
	}
	
	
	
	public  boolean ifd(int a , int b , int c) {
		
		if(a+b+c==180&&  a==b && b==c && c==a) {
			
			return true;
			
			
		}else
		
		
		return false;
	
	}
	
	public boolean idi(int a , int b , int c) {
		
		if((a+b+c==180) && (a==b|| b==c|| c==a)) {
			
			return true;
				
		}else
			
			return false;
		
	}

	
	public boolean idr(int a , int b , int c) {
		
		if((a+b+c==180) && (a==90||b==90||c==90)) {
			
			return true;
				
		}else
		{
			
			return false;
		}
		
	}
}
