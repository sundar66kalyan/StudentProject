package com.example.StudentDetails.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentExceptions  {

	@ExceptionHandler(StudentAgeException.class)
	public ResponseEntity<Object> AgeNotFound() {
		return new ResponseEntity<>(" Student age must be above 18", HttpStatus.NOT_FOUND);

	}
	
	
}
