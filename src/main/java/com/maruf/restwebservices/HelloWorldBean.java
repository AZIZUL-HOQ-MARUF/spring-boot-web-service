package com.maruf.restwebservices;

public class HelloWorldBean {
	
	public String name;
	public String message;
	

	public HelloWorldBean(String name,String message) { 
		this.name = name;
		this.message = message;
		
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	
	

}
