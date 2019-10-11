package com.emp.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerControllerAdvice {
	@ExceptionHandler()
	public ResponseEntity<ExceptionResponse> handleResourceNotFound(EmployeeIdNotFoundException exception) {

		ExceptionResponse error = new ExceptionResponse();
		error.setErrorMessage(exception.getMessage());
		error.setStatus(HttpStatus.NOT_FOUND.toString());
		error.setTimestamp(LocalDate.now());

		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

}
	
}
