package com.cg.fra.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.fra.dto.FlatRegistrationDTO;

class FlatRegistrationDAOImplTest {
	static FlatRegistrationDAOImpl flat;
	static FlatRegistrationDTO dto, dto1;

	@BeforeAll
	public static void init() {
		flat = new FlatRegistrationDAOImpl();
		dto1 = new FlatRegistrationDTO();
		dto = new FlatRegistrationDTO();
	}

	@Test
	void testRegisterflat() {
		dto.setFlat_area(300);
		dto.setFlat_type(2);
		dto.setRent_amt(3000);
		dto.setDeposit_amt(10000);
		dto.setOwner_id(2);
		dto1 = flat.registerflat(dto);
		assertEquals(1019, dto1.getFlat_reg_no());
	}

	@Test
	void testGetAllOwnerIds() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		assertEquals(al, flat.getAllOwnerIds());
	}

}
