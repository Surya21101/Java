package com.exception;

//custom exception for user not found 
public class StudentNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -5740323993053395302L;

	public StudentNotFoundException(String msg) {
		super(msg);
		
	}

}
