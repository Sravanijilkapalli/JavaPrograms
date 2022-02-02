package Constructor;

public class StudentMain {
	
	public static void main(String[] args) {
		
		StudentClass j1= new StudentClass("sravani" , "jilkapalli" , 26 , "female" , 27);
		StudentClass j2= new StudentClass("ramya" , "jilkapalli" , 1 , "female" , 29);
		StudentClass j3= new StudentClass("sai" , "jilkapalli" , 3 , "female" , 25);
		
		
		System.out.println(j1.getAge() + " " +j1.getFirtsName());
		System.out.println(j2.getAge() + " " +j2.getFirtsName());

		System.out.println(j3.getAge() + " " + j3.getFirtsName());

		
		StudentUtilities s = new StudentUtilities();
		
		s.updateFirstName(j1 , "sravs");
		
		System.out.println(j1.getAge() + " " +j1.getFirtsName());

		s.changeGender(j3, "male");
		System.out.println(j3.getGender());
		
		
		StudentUtilities.updateRno(j2 , 10);
		
		System.out.println(j2.getRno());
		
	}

}
