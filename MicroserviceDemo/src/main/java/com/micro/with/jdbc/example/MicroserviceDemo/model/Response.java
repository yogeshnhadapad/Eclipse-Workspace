package com.micro.with.jdbc.example.MicroserviceDemo.model;

public class Response {
	Integer code;
	String message;
	
	public Response() {
	
		
	}

	public Response(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Response [code=" + code + ", message=" + message + "]";
	}
	
	
	

}
