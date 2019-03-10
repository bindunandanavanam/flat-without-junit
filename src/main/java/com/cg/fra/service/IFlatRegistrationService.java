package com.cg.fra.service;

import java.util.ArrayList;

import com.cg.fra.dto.FlatRegistrationDTO;

public interface IFlatRegistrationService {
	FlatRegistrationDTO registerflat(FlatRegistrationDTO dto);
	ArrayList<Integer> getAllOwnerIds();
}
