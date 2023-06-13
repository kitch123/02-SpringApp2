package com.rktech.spring.beans;

public class Welcome {

	private String Message;
	
	public void setMessage(String message) {
		Message = message;
	}
	
	public String getMessage() {
		
		return Message;
	}

	@Override
	public String toString() {
		return "Welcome [Message=" + Message + "]";
	}
	
	
}
