package com.cd.casestudy.exception;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

public class ResourceNotFound extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFound(String msg) {
		super(msg);
	}
}
