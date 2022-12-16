package com.paykaro.exception;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.ControllerAdvice;

import lombok.Data;

@Data
public class MyErrorDetails {

	private LocalDateTime timestamp;
	private String message;
	private String description;

}