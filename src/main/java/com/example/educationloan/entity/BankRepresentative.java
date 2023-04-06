package com.example.educationloan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "bank_handle_db")
public class BankRepresentative {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bank_handle_id")
	private Integer id;

	@Column(name = "bank_handle_name")
	private String username;

	@Column(name = "bank_handle_password")
	private String password;

	@Column(name = "bank_handle_bankId")
	private Integer bankId;

	public Integer getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public Integer getBankId() {
		return bankId;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}
}
