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
@Table(name = "eduloan_db")
public class EducationLoan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "loan_id")
	private Integer id;

	@Column(name = "loan_name")
	private String name;

	@Column(name = "loan_interest", precision = 3, scale = 2)
	private float interest;

	@ManyToOne
	private Bank bank;

	public String toString() {
		return "Id: '" + this.id + "', Name: '" + this.name + "', Interest p.a : '" + this.interest + "'";
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getInterest() {
		return interest;
	}

	public Bank getBank() {
		return bank;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

}
