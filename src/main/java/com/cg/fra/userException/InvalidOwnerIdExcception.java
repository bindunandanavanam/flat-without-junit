package com.cg.fra.userException;

public class InvalidOwnerIdExcception extends Exception {
	public InvalidOwnerIdExcception() {
		System.out.println("owner id doesn't exists");
	}

}
