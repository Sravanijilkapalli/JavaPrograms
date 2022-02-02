package com.employee;

import com.common.Address;
import com.common.PhoneNumber;

public class Employee {
	String firstName;
	String lastName;
	String employeeId;
	String designation;
	PhoneNumber phoneNumber;
	String emailId;
	double salary;
	Address address;
	
	public Employee(String firstName, String lastName, String employeeId, String designation,
			PhoneNumber phoneNumber, String emailId, double salary, Address address  ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.designation = designation;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.salary = salary;
		this.address = address;	
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

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
