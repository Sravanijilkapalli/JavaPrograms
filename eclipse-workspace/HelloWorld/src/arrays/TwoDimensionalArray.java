package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int[][] b = new int[3][3];
		
		b[0][0] = 1;
		b[0][1] = 2;
		b[0][2] = 3;
		b[1][0] = 4;
		b[1][1] = 5;
		b[1][2] = 6;
		b[2][0] = 7;
		b[2][1] = 8;
		b[2][2] = 9;
		
		int[][]a = new int[3][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 1;
		a[1][2] = 6;
		a[2][0] = 7;
		a[2][1] = 8;
		a[2][2] = 1;
		
		for(int i=0; i<b.length; i++) {
			
			for(int j=0; j<b[0].length; j++) {
				
				int c= a[i][j] + b[i][j];
				
				System.out.println(c);
				
			}
		}
		
		
		boolean krr = diagnol(a);
		
		if(krr) {
			
			System.out.println("given matrix is diagnol");
			
			
		}else {
			
			System.out.println("given matrix is not diagnol");
			
		}
		
		
		String srav = replace("1.1.1.1");
		
	System.out.println(srav);
	
	String[] data = new String[4]; 
	
	data[0] = "my name is a sravani";
	data[1] = "my name is  the and what a sravani";
	data[2] = "my na sravani";
	data[3] = "my name is a the sravani";
	
	
		int raj = sentence(data);

	System.out.println(raj);
	
	
	interpent("G()(al)");
	interpent("G()()()()(al)");
	interpent("(al)G(al)()()G");
	
	
	int[] z= new int[8];
	
	z[0] = 1;
	z[1] = 1;
	z[2] = 2;
	z[3] = 1;
	z[4] = 4;
	z[5] = 4;
	z[6] = 5;
	z[7] = 4;
			
	countNumberofTimes(z , 4);
	
	
	}
	
	public static boolean diagnol(int[][]a) {
		
		int c = a[0][0];
		int d= a[1][1];
		int e = a[2][2];
		if(c==d && d==e && e==c) {
			
			return true;
		}else
			
			return false;
		
	}
	
	public static String replace(String a) {
		
		String rep = null;
		
		rep = a.replace(".", "[.]");
		
	  	return rep;

	}

	public static int sentence(String[] a) {
		
		int max = 0;
		int result=0;
		
		for(int i=0 ; i<a.length ; i++) {
			
			String [] split =a[i] .split(" ");
			
		result = split.length;
			System.out.println(result);

			if(result>max) {
				
				max = result;
				
			}
	}
		
		return max;
		
	}
	
	public static void interpent(String b) {
		
		String res = "";
		
		res= res+b.replace("()", "o").replace("(al)", "al");
		
		System.out.println(res);
		
	
	}
	
	public static void countNumberofTimes(int[] a , int b) {
		
		int count =0;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]==b) {
				
				count=count+1;
			
			}
						
		}
		
		System.out.println(count);

	}
	
	

}


