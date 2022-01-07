package com.bugtracking.bug.globalexceptionhandler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bugtracking.bug.responses.Responseinfo;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	ResponseEntity<Responseinfo> handlerofexceptions(Exception ex, HttpServletRequest req) {
		Responseinfo ri = new Responseinfo();
		ri.setMessage(ex.getMessage());
		ri.setUri(req.getRequestURI());
		ri.setStatusCode(HttpStatus.NOT_FOUND.value());
		ri.setStatusName(HttpStatus.NOT_FOUND);
		return new ResponseEntity(ri, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	String validationError(MethodArgumentNotValidException ma) {
		FieldError fe = ma.getFieldError();
		return fe.getField() + ":" + fe.getDefaultMessage();
	}

}
