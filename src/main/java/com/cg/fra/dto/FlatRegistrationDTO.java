package com.cg.fra.dto;

public class FlatRegistrationDTO {
private long mobile, owner_id, flat_reg_no,deposit_amt, rent_amt;
private String owner_name;
private int flat_area,flat_type;
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public long getOwner_id() {
	return owner_id;
}
public void setOwner_id(long owner_id) {
	this.owner_id = owner_id;
}
public long getFlat_reg_no() {
	return flat_reg_no;
}
public void setFlat_reg_no(long flat_reg_no) {
	this.flat_reg_no = flat_reg_no;
}
public long getDeposit_amt() {
	return deposit_amt;
}
public void setDeposit_amt(long deposit_amt) {
	this.deposit_amt = deposit_amt;
}
public long getRent_amt() {
	return rent_amt;
}
public void setRent_amt(long rent_amt) {
	this.rent_amt = rent_amt;
}
public String getOwner_name() {
	return owner_name;
}
public void setOwner_name(String owner_name) {
	this.owner_name = owner_name;
}
public int getFlat_area() {
	return flat_area;
}
public void setFlat_area(int flat_area) {
	this.flat_area = flat_area;
}
public int getFlat_type() {
	return flat_type;
}
public void setFlat_type(int flat_type) {
	this.flat_type = flat_type;
}

}
