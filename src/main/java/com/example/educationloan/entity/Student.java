package com.example.educationloan.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "student_db")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private Integer id;

	@Column(name = "student_reg")
	private String reg;

	@Column(name = "student_name")
	private String name;

	@Column(name = "student_dob")
	private String dob;

	@Column(name = "student_col")
	private String college;

	@Column(name = "student_dep")
	private String department;
	
	@Column(name = "student_username")
	private String username;

	@Column(name = "student_password")
	private String password;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	private College clg;

	public String toString() {
		return "Id: '" + this.id + "', Name: '" + this.name + "', DOB: '" + this.dob + "'" + "', College: '"
				+ this.college + "'";
	}

	public Integer getId() {
		return id;
	}

	public String getReg() {
		return reg;
	}

	public String getName() {
		return name;
	}

	public String getDob() {
		return dob;
	}

	public String getCollege() {
		return college;
	}

	public String getDepartment() {
		return department;
	}

	public College getClg() {
		return clg;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setClg(College clg) {
		this.clg = clg;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
