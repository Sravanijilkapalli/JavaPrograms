package com.common;

import com.enums.MoblieNumberType;

public class PhoneNumber {
	
	MoblieNumberType moblieNumberType ;
	String number;
	
	
	public PhoneNumber(MoblieNumberType moblieNumberType, String number ){
		this.moblieNumberType = moblieNumberType;
		this.number = number;	
	}


	public MoblieNumberType getMoblieNumberType() {
		return moblieNumberType;
	}


	public void setMoblieNumberType(MoblieNumberType moblieNumberType) {
		this.moblieNumberType = moblieNumberType;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}

}
