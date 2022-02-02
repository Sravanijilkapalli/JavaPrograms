package switchcase;

public class SwitchDemo {
	
	public static void main(String[] args){
		
		
		
		months(5);
		month("may");
		
		
		
	}
	
	
	public static void months(int a) {
		
		switch(a) {
		case 1:
			
			System.out.println("january");
			
			break;
		case 2:
			
			System.out.println("febrauary");

			break;
			
		case 3:
			System.out.println("march");

	       break;
		case 4:
			System.out.println("april");
           break;
           
		case 5:
			System.out.println("may");
             break;
		case 6:
			System.out.println("june");
	           break;
		case 7:
			System.out.println("july");
	           break;
		case 8:
			System.out.println("august");
        break;
		case 9:
			System.out.println("september");
	           break;
		case 10:
			System.out.println("october");
	           break;
	           
		case 11:
			System.out.println("november");
	           break;
	           
		case 12:
			System.out.println("december");
	           break;
	           
	     default:
	         System.out.println("no month exists");
	               break;

		
		}
		
		
	}
	
	public static void month(String a) {
		
		switch(a) {
		case "january":
			
			System.out.println("1");
			
			break;
		case "febrauary":
			
			System.out.println("2");

			break;
			
		case "march":
			System.out.println("3");

	       break;
		case "april":
			System.out.println("4");
           break;
           
		case "may":
			System.out.println("5");
             break;
		case "june":
			System.out.println("6");
	           break;
		case "july":
			System.out.println("7");
	           break;
		case "august":
			System.out.println("8");
        break;
		case "september":
			System.out.println("9");
	           break;
		case "october":
			System.out.println("10");
	           break;
	           
		case "november":
			System.out.println("11");
	           break;
	           
		case "december":
			System.out.println("12");
	           break;
	           
	     default:
	         System.out.println("no month exists");
	               break;
		}	
	}

}
