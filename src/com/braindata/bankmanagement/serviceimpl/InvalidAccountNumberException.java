package com.braindata.bankmanagement.serviceimpl;

public class InvalidAccountNumberException extends RuntimeException {
	public InvalidAccountNumberException(String msg)
	{
		super(msg);
	}

}
