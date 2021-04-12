package com.grenergy.order.service;

/**
 * 
 * 
 * @author mbhatnag
 *
 */
public class OrderHandlingException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public OrderHandlingException(String message) {
		super(message);

	}

	public OrderHandlingException(String message, Throwable cause) {
		super(message, cause);
	}

	public OrderHandlingException(Throwable cause) {
		super(cause);
	}

}
