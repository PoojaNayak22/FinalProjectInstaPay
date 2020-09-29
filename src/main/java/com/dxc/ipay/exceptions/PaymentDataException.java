package com.dxc.ipay.exceptions;

public class PaymentDataException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	
	public PaymentDataException (String string) {
		
		super(string);
		
	}
}
