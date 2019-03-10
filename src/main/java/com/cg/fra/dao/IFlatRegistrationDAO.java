package com.cg.fra.dao;

import java.util.ArrayList;

import com.cg.fra.dto.FlatRegistrationDTO;

public interface IFlatRegistrationDAO {
	FlatRegistrationDTO registerflat(FlatRegistrationDTO dto);
	ArrayList<Integer> getAllOwnerIds();

}
