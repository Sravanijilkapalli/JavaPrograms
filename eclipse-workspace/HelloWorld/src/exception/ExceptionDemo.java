package exception;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		
		
		ExceptionDemo obj = new ExceptionDemo();
		
		try {
			obj.demo();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("e");
		}
		
	
		for(int i = 0; i< 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public int demo() {
		
		int a = 3;
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println(c);
		}catch(Exception e) {
			throw e;
			
		}
		
		int d = a*b;
		
		System.out.println(d);
		
		return 0;
	}

}
