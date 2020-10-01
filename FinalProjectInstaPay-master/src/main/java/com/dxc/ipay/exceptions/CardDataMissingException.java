package com.dxc.ipay.exceptions;

public class CardDataMissingException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	
	public CardDataMissingException(String string) {
		
		super(string);
		
		
	}
}
