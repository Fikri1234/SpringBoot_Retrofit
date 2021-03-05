package com.project.retro.DTO;

public class UserDTO {
	
	private String gender;
	private String fullname;
	private String address;
	private String picture;
	
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserDTO(String gender, String fullname, String address, String picture) {
		super();
		this.gender = gender;
		this.fullname = fullname;
		this.address = address;
		this.picture = picture;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	@Override
	public String toString() {
		return "RandomUserDTO [gender=" + gender + ", fullname=" + fullname + ", address=" + address + ", picture="
				+ picture + "]";
	}

}
