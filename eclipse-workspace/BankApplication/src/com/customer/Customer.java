package com.customer;

import com.common.Address;
import com.common.PhoneNumber;
import com.enums.Gender;

public class Customer {

	String firstName;
	String lastName;
	int age;
	Gender gender;
	boolean isDisablility;
	Address address;
	PhoneNumber phoneNumber;
	String emailId;
	double income;
	
	public Customer(String firstName, String lastName, int age, Gender gender, boolean isDisablility, Address address, PhoneNumber phoneNumber, String emailId, double income){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.isDisablility = isDisablility;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.income = income;	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isDisablility() {
		return isDisablility;
	}

	public void setDisablility(boolean isDisablility) {
		this.isDisablility = isDisablility;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
	
}
