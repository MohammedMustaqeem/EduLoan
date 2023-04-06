package com.example.educationloan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "bank_db")
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bank_id")
	private Integer id;

	@Column(name = "bank_name")
	private String name;

	@Column(name = "bank_branch")
	private String branch;

	@Column(name = "bank_city")
	private String city;

	/*
	 * Handle for bank. One who handles banking operation (adding loan details,
	 * verifying loan applications etc) for a bank
	 */
	@Column(name = "bank_rep")
	private String username;

	@Column(name = "bank_rep_pass")
	private String password;

	public String toString() {
		return "Id: '" + this.id + "', Name: '" + this.name + "', Branch: '" + this.branch + "'";
	}

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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
