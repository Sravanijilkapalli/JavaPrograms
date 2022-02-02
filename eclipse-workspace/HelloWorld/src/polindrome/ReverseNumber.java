package polindrome;

public class ReverseNumber {
	
	
	public static void main(String[] args) {
		
		int a= 103;
		ReverseNumber obj = new ReverseNumber();
		
		int rvs = obj.reversing(a);
		
         if(a==rvs) {
			
			
			System.out.println(a + " is a polindrome number");
		}else {
			
			
			System.out.println(a + " is not  a polindrome number");

			
		}
		
		System.out.println(rvs);
		
		int rs = amstrong(370);
		System.out.println(rs);
		
		numtriangle(5);
		
		addtriangle(5);
		sumtriangle(5);
		
		sumaddtriangle(5);


		
	}
	
	
	
	public static int  reversing(int a) {
		
		int temp = a ;
		
		int reverse = 0 ;
		int y;
		
		while (temp != 0) {
			
			
			y = temp% 10;
			
			reverse = reverse*10+y;
			
			temp= temp/10;
			
		}		
		return reverse;
	}
	
	
	public static  int amstrong(int a) {
		
		int temp = a;
		int x;
		int r= 0;
		
		while(temp !=0) {
			
			x = temp%10;
			
			 r= r +x*x*x;
			 
			 temp=temp/10;	
		}
		
		return r;
	}

	public static  void  numtriangle(int b) {
		
		for(int i=1; i<=b; i++) {
		
			for(int j=1 ; j<=i ; j++) {
				
			 
				System.out.print(1);
			
			}
			System.out.println();

		}
	
	
	}
	
	
	
	public static void addtriangle(int d) {
		
		for(int i=1; i<=d ; i++) {
			
			for(int j= 1 ; j<=i ; j++ ) {
				
				System.out.print(i);
				
			}
			
			System.out.println();
	
		}
	}
	
	public static void sumtriangle(int x) {
		
		int sum=0;
		
		for(int i=1 ; i <=x; i++) {
			
			sum=0;
			
			for(int j=1; j<=i; j++) {
				
				
				sum=sum+j;
				
			}
			System.out.print(sum);
			System.out.println();

		}
	
	}
	
	public static void sumaddtriangle(int c) {
		
		
		int sum=0;
		
		for(int i=1; i<=c ; i++) {
			
			sum=0;
			for(int j=1 ; j<=i ; j++) {
				
				sum=sum+i;
				
			}
			
			System.out.print(sum);
			
			System.out.println();
		}
		
		
	}
	
}
