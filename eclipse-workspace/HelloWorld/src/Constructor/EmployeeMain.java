package Constructor;

public class EmployeeMain {
	
	public static void main(String[] args ) {
		
		Employee s1 = new Employee(" Yuvin" , "Neil" , "c197740" , 100000 , "Agm" , Gender.male);
		Employee s2 = new Employee(" Anitha" , "Jilkapalli" , "J346923" , 120000 , "Agm1" , Gender.female);
		Employee s3 = new Employee(" Narayanareddy" , "Jilkapalli" , "cJ21226" , 1000000 , "Dgm" ,Gender.male);
		
		
		System.out.println(s1.getDesignation()+" gender is "+s1.gender);
		System.out.println(s2.getDesignation()+" gender is "+s2.gender);
		System.out.println(s3.getDesignation()+" gender is "+s3.gender);

		
		
		
		EmployeeUtilisies j1 = new EmployeeUtilisies();
		
		j1.updateSalary(s1 , 1100000 );
		
		System.out.println(s1.getSalary());
		
		EmployeeUtilisies.updateDesignation(s2 , "Agm2");
		
		System.out.println(s2.getDesignation());

		
	}

	
	
}
