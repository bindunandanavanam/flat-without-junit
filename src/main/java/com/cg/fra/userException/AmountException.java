package com.cg.fra.userException;

public class AmountException extends Exception {
	public AmountException() {
		System.out.println("Deposit amt should be greater than rent amt");
	}

}
