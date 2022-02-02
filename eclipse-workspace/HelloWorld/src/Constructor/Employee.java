package Constructor;

public class Employee {
	
	
	String firstName;
	String lastName;
	String idNumber;
	double salary;
	String designation;
	Gender gender;
	
	
	public Employee(String firstName ,String lastName , String idNumber ,double salary ,String designation ,  Gender gender) {
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.idNumber=idNumber;
		this.salary=salary;
		this.designation=designation;
		this.gender=gender;
		
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	

}
