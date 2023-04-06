package com.example.educationloan.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
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

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "college_db")
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "college_id")
	private Integer id;

	@Column(name = "college_name")
	private String name;

	@Column(name = "college_city")
	private String city;
	
	/* Handle(account) to handle (add student etc) all students of a college */
	@Column(name = "college_rep")
	private String username;

	@Column(name = "college_rep_password")
	private String password;

	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL , mappedBy = "clg")
	private List<Student> students = new ArrayList<>();

	public String toString() {
		return "Id: '" + this.id + "', Name: '" + this.name + "', City: '" + this.city + "'";
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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
