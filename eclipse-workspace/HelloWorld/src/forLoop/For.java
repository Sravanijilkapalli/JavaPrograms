package forLoop;

public class For {
	
	public static void main(String[] args) {
		
		
		condition(20 , 100);
		
		For obj = new For();
		
		
		int rs= dec(30 , 20);
		
		System.out.println(rs);
		
		
		
		even(2 , 20);
		
		twoStringSum("123456" , "23456");
			String jsr = twoString("123456789024" , "31");
		
			System.out.println(jsr);

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
	
	public static void twoStringSum(String s , String r) {
		
		
		int sum = Integer.parseInt(s) + Integer.parseInt(r);
		
		
		System.out.println(sum);
	}
	
	public static  String twoString(String num1 , String num2) {
		
		StringBuilder result = new StringBuilder();
		int i= num1.length()-1;
		int j = num2.length()-1;
		 int carry=0;

		 while(i>=0 || j >=0 ) {
			 
			 int sum = carry;
			 if(i>=0) {
				 
				 sum += num1.charAt(i--) - '0';
				 
			 }
			if(j>=0) {
				
				 sum += num2.charAt(j--) - '0';
				
			}
			 result.append(sum%10);
			 carry = sum/10;
		 }
		
		if(carry!=0) {
			
			result.append(carry);
		}
		
		return result.reverse().toString();
	}
	
}
