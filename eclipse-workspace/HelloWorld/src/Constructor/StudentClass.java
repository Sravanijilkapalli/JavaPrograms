package Constructor;

public class StudentClass {
	
	String firtsName;
	String lastName;
	int rno;
	String gender;
	int age;
	
	
	public StudentClass(String firtsName , String lastName , int rno , String gender , int age  ){
		
		this.firtsName=firtsName;
		this.lastName= lastName;
		this.rno=rno;
		this.gender=gender;
		this.age=age;
		
	}
		

	
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getFirtsName() {
		return firtsName;
	}

	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	}


