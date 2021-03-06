package com.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.common.Address;
import com.common.PhoneNumber;
import com.customer.Customer;
import com.employee.Employee;
import com.enums.AccountType;
import com.enums.AddressType;
import com.enums.Gender;
import com.enums.MoblieNumberType;
import com.enums.State;

public class BankApplicationMain {
	
	public static void main(String[] args) {
		
		PhoneNumber empPhoneNumber1 = new PhoneNumber(MoblieNumberType.MOBILE_NUMBER, "8168309172");
		Address empAddress1 = new Address("h-no:1-48", "Road no 1 reddy colony", "Hyderabad", State.TELANGANA, 500089, AddressType.RESIDENTIAL_ADDRESS);
		
		PhoneNumber empPhoneNumber2 = new PhoneNumber(MoblieNumberType.MOBILE_NUMBER, "9000243339");
		Address empAddress2 = new Address("flat no 102", "Road no 5 p and t colony", "Hyderabad", State.TELANGANA, 500089, AddressType.RESIDENTIAL_ADDRESS);

		PhoneNumber empPhoneNumber3 = new PhoneNumber(MoblieNumberType.MOBILE_NUMBER, "9949485189");
		Address empAddress3 = new Address("1-48.102", "Road no 1 and 5 hayathnagar", "Hyderabad", State.TELANGANA, 500089, AddressType.RESIDENTIAL_ADDRESS);
		
		Employee employee1 = new Employee("Rajashekar", "Kodiamala", "346923", "Manager",
				empPhoneNumber1, "rajashekar176@gmail.com", 2000000, empAddress1);
		Employee employee2 = new Employee("NarayanaAnitha", "Jilkapallly", "197740", "AGM",
				empPhoneNumber2, "NArayanaAnitha@gmail.com", 5000000, empAddress2);
		Employee employee3 = new Employee("NeilYuvinReddy", "Marri", "12b61a0226", "DGM",
				empPhoneNumber3, "NeilYuvinReddy@gmail.com", 100000, empAddress3);

		Employee[] employees = new Employee[3];
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;

		
	
		PhoneNumber custPhoneNumber1 = new PhoneNumber(MoblieNumberType.MOBILE_NUMBER, "8165888492");
		Address custAddress1 = new Address("flat no 102", "Road no 5 ", "uppal", State.TELANGANA, 500089, AddressType.RESIDENTIAL_ADDRESS);
		
		PhoneNumber custPhoneNumber2 = new PhoneNumber(MoblieNumberType.MOBILE_NUMBER, "9849372135");
		Address custAddress2 = new Address("flat no 162", "Road no 8 ", "hayathnagar", State.TELANGANA, 500089, AddressType.RESIDENTIAL_ADDRESS);

		PhoneNumber custPhoneNumber3 = new PhoneNumber(MoblieNumberType.MOBILE_NUMBER, "8885439636");
		Address custAddress3 = new Address("flat no 148", "Road no 1 ", "rudravelly", State.TELANGANA, 500089, AddressType.RESIDENTIAL_ADDRESS);
		
		Customer customer1 = new Customer("Sravani", "Jilkapalli", 27, 
				Gender.FEMALE, false, custAddress1, custPhoneNumber1, "sravanireddyjilkapalli@gmail.com", 100000);
		Customer customer2 = new Customer("RamyaSettharam", "Marri", 29, 
				Gender.FEMALE, false, custAddress2, custPhoneNumber2, "ramya.feb04@gmail.com", 200000);
		Customer customer3 = new Customer("SairamReddy", "Jilkapally", 25, 
				Gender.MALE, false, custAddress3, custPhoneNumber3, "sairamreddy1996@gmail.com", 150000);

		Customer[] customers = new Customer[3];
		customers[0] = customer1;
		customers[1] = customer2;
		customers[2] = customer3;

		
		
		PhoneNumber bankPhoneNumber = new PhoneNumber(MoblieNumberType.MOBILE_NUMBER, "9849372135");
		Address bankAddress = new Address(" ICICI bank flat no 102", " pocaharam", "ghatkesar", State.TELANGANA, 
				500089, AddressType.OFFICE_ADDRESS);
				
		Bank bank = new Bank(employees, customers, bankAddress, "JSRBANK@GMAIL.COM", bankPhoneNumber );
		
		for(int i=0; i<customers.length; i++) {
			
		
		String output = bank.createAccount(customers[i] , AccountType.SAVINGS_ACCOUNT);
		
		System.out.println(output);
		}

		
		for(int i=0; i<customers.length ; i++) {
			
			System.out.println(customers[i].getFirstName());
		}
	
		List<Customer> al = new ArrayList<Customer>();
		
		al.add(customer1);
		al.add(customer2);
		al.add(customer3);

		
		for(int i=0; i<al.size() ; i++) {
			
			Customer c = al.get(i);
			c.setIncome(c.getIncome() + 10);
			System.out.println(c.getIncome());
		}		
		
		
		List<Employee> sr = new LinkedList<Employee>();
		sr.add(employee1);
		sr.add(employee2);
		sr.add(employee3);
		
		for(int i=0; i<sr.size() ; i++) {
			
			Employee d = sr.get(i);
			
			d.setSalary(d.getSalary()+10);
			
			System.out.println(d.getSalary());
			
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(Employee x :sr) {
			
			if(map.containsKey(x.getDesignation())) {
				int temp = map.get(x.getDesignation());
				map.put(x.getDesignation(), temp + 1);
			}else {
				map.put(x.getDesignation(), 1);
			}
		}
		
		System.out.println(map);

}
	}