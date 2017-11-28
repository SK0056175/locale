package com.locale.demo.dto;

public class ResponseDTO{
	  private String message;
	  
	  ResponseDTO(){}
	  
	  public ResponseDTO(String message){
	    this.message=message;
	  }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	  
	  
	}
