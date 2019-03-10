package com.cg.fra.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.fra.dto.FlatRegistrationDTO;

public class FlatRegistrationDAOImpl implements IFlatRegistrationDAO{

	FlatRegistrationDTO dto=new FlatRegistrationDTO();
	public FlatRegistrationDTO registerflat(FlatRegistrationDTO dto) {
		Long owner =dto.getOwner_id();
		int x=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bindu", "root", "root");
			PreparedStatement ps = con.prepareStatement("insert into flat_registration(owner_id,flat_type,flat_area,rent_amount,deposit_amount) values(?,?,?,?,?)");
			ps.setLong(1, dto.getOwner_id());
			ps.setLong(2, dto.getFlat_type());
			ps.setLong(3, dto.getFlat_area());
			ps.setLong(4, dto.getRent_amt());
			ps.setLong(5, dto.getDeposit_amt());
			 x = ps.executeUpdate();

			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(x==1) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bindu", "root", "root");
			PreparedStatement ps = con.prepareStatement("select flat_reg_no from flat_registration where owner_id =?");
			ps.setLong(1, owner);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
			dto.setFlat_reg_no(rs.getInt(1));
			}
		
		}catch(ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return dto;
		}
			
		else
			return null;
		
	}

	public ArrayList<Integer> getAllOwnerIds() {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		int x=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bindu", "root", "root");
			PreparedStatement ps = con.prepareStatement("select owner_id from flat_owners");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				arrayList.add(rs.getInt(1));
			}
		
		
	}catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return arrayList;

}
}
