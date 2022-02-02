package forLoop;

public class For {
	
	public static void main(String[] args) {
		
		
		condition(20 , 100);
		
		For obj = new For();
		
		
		int rs= dec(30 , 20);
		
		System.out.println(rs);
		
		
		
		even(2 , 20);
		
		
			
		
		
	}


	
	public static void condition(int a , int b) {
		int i;
		
		for(i=a ; i<=b ; i++) {
			
			
			
			System.out.println(i);
			
			
		}
	}
	
	
	public static int dec(int a , int b) {
		
		int i;
		int sum=0;
		
		for(i=a ; i>=b ; i--) {
		
			sum= sum+i;
			//System.out.println(i);
			 
		}
		 
		
        return sum;

	}
	
	
	public static void even(int a , int b) {
		
		int i;
		int sum=0;
		
		for(i=a; i<=b; i++) {
			
			
			//System.out.println(i);
			
			if(i%2==1) {
				
				
				System.out.println(i);
				sum= sum+i;
			}
			
			
		}
		
		System.out.println(sum);

		
	}
	
}
