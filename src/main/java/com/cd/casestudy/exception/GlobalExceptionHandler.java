package com.cd.casestudy.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

// @ControllerAdvice is used to handler exception globally.
@ControllerAdvice
public class GlobalExceptionHandler {

	// handle specific exception
	
	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity handleResourceNotFound(ResourceNotFound exception, WebRequest request)
	{
			ErrorDetails errorDetails = new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false));
			return new ResponseEntity(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	
	// handle global exception
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity handleException(Exception exception, WebRequest request)
	{
			ErrorDetails error = new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false));
			return new ResponseEntity(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
