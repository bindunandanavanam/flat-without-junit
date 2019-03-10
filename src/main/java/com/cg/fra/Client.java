package com.cg.fra;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.fra.dto.FlatRegistrationDTO;
import com.cg.fra.service.FlatRegistrationServiceImpl;
import com.cg.fra.service.IFlatRegistrationService;

public class Client {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FlatRegistrationDTO dto=new FlatRegistrationDTO();
		IFlatRegistrationService iFlatRegistrationService=new FlatRegistrationServiceImpl();
		ArrayList<Integer> arrayList= iFlatRegistrationService.getAllOwnerIds();
		System.out.println("Existing owner IDS Are: "+arrayList);
		System.out.println("Please enter your owner id");
		dto.setOwner_id(sc.nextLong());
		System.out.println(" Select flat type 1-1BHK 2=2BHK ");
		dto.setFlat_type(sc.nextInt());
		System.out.println("enter flat area");
		dto.setFlat_area(sc.nextInt());
		System.out.println("enter desired rent amount");
		dto.setRent_amt(sc.nextLong());
		System.out.println("enter deposited amount");
		dto.setDeposit_amt(sc.nextLong());
		dto=iFlatRegistrationService.registerflat(dto);
		System.out.println("Flat Successfully Registered. Registration Id is: <"+dto.getFlat_reg_no()+">");
		
		
		sc.close();

	}

}
