package com.cg.fra.service;

import java.util.ArrayList;

import com.cg.fra.dao.FlatRegistrationDAOImpl;
import com.cg.fra.dao.IFlatRegistrationDAO;
import com.cg.fra.dto.FlatRegistrationDTO;

public class FlatRegistrationServiceImpl implements IFlatRegistrationService {
	FlatRegistrationDTO dto=new FlatRegistrationDTO();
	IFlatRegistrationDAO dao=new FlatRegistrationDAOImpl();
	public FlatRegistrationDTO registerflat(FlatRegistrationDTO dto) {
		dto=dao.registerflat(dto);
		
		return dto;
	}

	public ArrayList<Integer> getAllOwnerIds() {
		ArrayList<Integer> arrayList=dao.getAllOwnerIds();
		return arrayList;
	}

}
