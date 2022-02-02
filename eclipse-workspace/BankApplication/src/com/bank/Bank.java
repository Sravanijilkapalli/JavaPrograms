package com.bank;

import com.common.Address;
import com.common.PhoneNumber;
import com.customer.Customer;
import com.employee.Employee;
import com.enums.AccountType;

public class Bank {
	Employee[] employee;
	Customer[] customer;
	Address address;
	String emailId;
	PhoneNumber phoneNumber;
	
	public Bank(Employee[] employee, Customer[] customer, Address address, String emailId, PhoneNumber phoneNumber ) {
		this.employee = employee;
		this.customer = customer;
		this.address = address;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}

	public Employee[] getEmployee() {
		return employee;
	}

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}

	public Customer[] getCustomer() {
		return customer;
	}

	public void setCustomer(Customer[] customer) {
		this.customer = customer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public String createAccount(Customer customer , AccountType accountType) {
		
		switch(accountType) {
		
		case SAVINGS_ACCOUNT:
			
			return customer.getFirstName() + " Savings account succesfully created";
			
		case CURRENT_ACCOUNT:
			
			return customer.getFirstName() + " Current account succesfully created";

		case DEMAT_ACCOUNT:
			
			return customer.getFirstName() + " Demat account succesfully created";

		default:
			
			return "Invalid account type";
		
		
		}
		
		
		
		
	}
	

}
