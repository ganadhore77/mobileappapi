package com.austere.appApi.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "visitor")
public class Visitor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String user_photo;

	private String email;

	private String address;

	private String purpose;

	private String contact_no;

	private Integer check_flag;

	private Date created_date;

	private Integer user_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser_photo() {
		return user_photo;
	}

	public void setUser_photo(String user_photo) {
		this.user_photo = user_photo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public Integer getCheck_flag() {
		return check_flag;
	}

	public void setCheck_flag(Integer check_flag) {
		this.check_flag = check_flag;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Visitor(Integer id, String name, String user_photo, String email, String address, String purpose,
			String contact_no, Integer check_flag, Date created_date, Integer user_id) {
		super();
		this.id = id;
		this.name = name;
		this.user_photo = user_photo;
		this.email = email;
		this.address = address;
		this.purpose = purpose;
		this.contact_no = contact_no;
		this.check_flag = check_flag;
		this.created_date = created_date;
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Visitor [id=" + id + ", name=" + name + ", user_photo=" + user_photo + ", email=" + email + ", address="
				+ address + ", purpose=" + purpose + ", contact_no=" + contact_no + ", check_flag=" + check_flag
				+ ", created_date=" + created_date + ", user_id=" + user_id + "]";
	}

	public Visitor() {

	}

}
