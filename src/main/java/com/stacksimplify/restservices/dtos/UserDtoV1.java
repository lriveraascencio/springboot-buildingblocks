package com.stacksimplify.restservices.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;
import com.stacksimplify.restservices.entities.Order;
import com.stacksimplify.restservices.entities.Views;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class UserDtoV1 {

	private Long userid;
	private String username;
	private String firstname;
	private String lastname;
	private String email;
	private String role;
	private String ssn;
	private List<Order> orders;

	// No args Constructor
	public UserDtoV1() {

	}

	// Constructor Fields
	public UserDtoV1(Long userid, String username, String firstname, String lastname, String email, String role,
			String ssn, List<Order> orders) {
		super();
		this.userid = userid;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.ssn = ssn;
		this.orders = orders;
	}

	// Getters & Setters
	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
