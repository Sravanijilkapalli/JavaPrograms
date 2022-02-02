package Constructor;

import hello.HelloWorld;

public class Student {
	
	String Name;
	int Rno;
	
	Student(String Name , int Rno){
		
	 	this.Name=Name;
		
        this.Rno= Rno;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Sravani" , 26);
			
		
		System.out.println(s1.Name  +" and the number is "+  s1.Rno);
		
		
		
		Student s2 = new Student("Rajashekar" , 17);
		
		System.out.println(s2.Name  +" and the roll number is "+  s2.Rno);
		
		
		HelloWorld obj  = new HelloWorld();
		
		int ins=obj.mul(8 , 9);
		
		int j = ins*3;
		
		System.out.println(ins+ "and the value of mul of ins into 3 is "+j);
		System.out.println(s1.getRno() +"    and "+ s2.getRno());
		s1.setRno(2);
		s2.setRno(67);
		System.out.println(s1.getRno() + " and " + s2.getRno());

	}
	
	
	
	
	public int getRno() {
		
		return Rno;
		
		
	}
	
	public void setRno(int Rno) {
		
		
		this.Rno= Rno;
	}

}
