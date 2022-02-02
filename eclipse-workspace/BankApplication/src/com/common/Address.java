package com.common;

import com.enums.AddressType;
import com.enums.State;

public class Address {
	
	String houseNo;
	String streetNo;
	String city;
	State state;
	int pinCode;
	AddressType addressType;
	
     public Address(String houseNo, String streetNo, String city, State state, int pinCode, AddressType addressType  ){
    	 
		this.houseNo = houseNo;
	    this.streetNo = streetNo;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.addressType =addressType;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}


	public String getStreetNo() {
		return streetNo;
	}


	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}


	public int getPinCode() {
		return pinCode;
	}


	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}


	public AddressType getAddressType() {
		return addressType;
	}


	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

}
