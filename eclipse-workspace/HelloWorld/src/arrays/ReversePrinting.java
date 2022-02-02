package arrays;

public class ReversePrinting {
	public static void main(String[] args) {
		
		ReversePrinting obj = new ReversePrinting();
		
		String a = "sravani";
		int b = a.length();
		String reverse = "";
		for(int i=b-1; i>=0 ; i-- ) {
          
			reverse = reverse+a.charAt(i);
			  
			//System.out.println(a.charAt(i));
		}

        System.out.println(reverse);

	
	
	
	String[] string = new String[3];
	string[0] = "sravani";
	string[1] = "Rajashekar";
	string[2] = "sraj";
	
	int c = string.length;
	String[] rev = new String[0];
	
	for(int i=c-1; i>=0; i--) {
		
		//char[] t = string[i].toCharArray();
		
		
		//System.out.println(reverseStringstring[i]);
		
		String result = obj.reverseString(string[i]);
    System.out.println(result);
	int jsr = obj.lengthOfString(string[i]);

    System.out.println(jsr);
    
    
    int[] add = new int[5];
    
    add[0] = 0;
    add[1] = 18;
    add[2] = 20;
    add[3] = 56;
    add[4] = 98;
    
    for(int res : add) {
    	
    	System.out.println(res);
    	
    }


	}	

	
	int jsr = obj.lengthOfString(a);
	
    System.out.println(jsr);

	
	
}
	
	public String reverseString(String a) {
		
		
		int b = a.length();
		String reverse = "";
		for(int i=b-1; i>=0 ; i-- ) {
          
			reverse = reverse+a.charAt(i);
			  
			//System.out.println(a.charAt(i));
		}

        return reverse;
		
	}
	
	public int lengthOfString(String a) {
		
		 int len = 0;
		 
		 len=a.length();
		 
		 
		 return len;
}
	
	
	

}