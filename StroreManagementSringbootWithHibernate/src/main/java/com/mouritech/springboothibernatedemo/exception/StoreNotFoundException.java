package com.mouritech.springboothibernatedemo.exception;
public class StoreNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StoreNotFoundException(String msg) {
		super(msg);
	}

}