package com.rajesh.klp.demo.exceptions;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(String errorMessage) {
		
	    super(errorMessage);
	  }

}
