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
@Table(name = "college_handle_db")
public class CollegeRepresentative {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clg_handle_id")
	private Integer id;

	@Column(name = "clg_handle_name")
	private String username;

	@Column(name = "clg_handle_password")
	private String password;

	@Column(name = "clg_handle_clgId")
	private Integer collegeId;

	public Integer getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public Integer getCollegeId() {
		return collegeId;
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

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
}
