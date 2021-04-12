package com.grenergy.catalog.controller;

/**
 * 
 * 
 * @author mbhatnag
 *
 */
public class CatalogueException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CatalogueException(String message) {
		super(message);

	}

	public CatalogueException(String message, Throwable cause) {
		super(message, cause);
	}

	public CatalogueException(Throwable cause) {
		super(cause);
	}

}
