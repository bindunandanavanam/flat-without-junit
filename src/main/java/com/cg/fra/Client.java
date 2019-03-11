package com.cg.fra;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.fra.dto.FlatRegistrationDTO;
import com.cg.fra.service.FlatRegistrationServiceImpl;
import com.cg.fra.service.IFlatRegistrationService;
import com.cg.fra.userException.AmountException;
import com.cg.fra.userException.FlatTypeException;
import com.cg.fra.userException.InvalidOwnerIdExcception;

public class Client {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FlatRegistrationDTO dto=new FlatRegistrationDTO();
		IFlatRegistrationService iFlatRegistrationService=new FlatRegistrationServiceImpl();
		ArrayList<Integer> arrayList ;
		arrayList	= iFlatRegistrationService.getAllOwnerIds();
		//Entering  flat registration and owner details
		System.out.println("Existing owner IDS Are: "+arrayList);
		System.out.println("Please enter your owner id");
		dto.setOwner_id(sc.nextLong());
		//checking if the owner ID is present in the arrayList or not
		if(arrayList.contains((int)dto.getOwner_id())) {
	
		System.out.println(" Select flat type 1-1BHK 2=2BHK ");
		dto.setFlat_type(sc.nextInt());
		//Checking if flat type is 1 or 2
		if(dto.getFlat_type()==1 || dto.getFlat_type()==2) {
		System.out.println("enter flat area");
		dto.setFlat_area(sc.nextInt());
		System.out.println("enter desired rent amount");
		dto.setRent_amt(sc.nextLong());
		System.out.println("enter deposited amount");
		dto.setDeposit_amt(sc.nextLong());
		//checking if the deposited amount is greater than rent amount
		if(dto.getDeposit_amt()>dto.getRent_amt()) {
			//Getting flat registration number and displaying it
		dto=iFlatRegistrationService.registerflat(dto);
		System.out.println("Flat Successfully Registered. Registration Id is: <"+dto.getFlat_reg_no()+">");
		}
		else {
			try {
				throw new AmountException();
			} catch (AmountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		else {
			try {
				throw new FlatTypeException();
			} catch (FlatTypeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		}
		else {
			try {
				throw new InvalidOwnerIdExcception();
			} catch (InvalidOwnerIdExcception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		sc.close();

	}

}
