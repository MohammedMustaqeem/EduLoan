package com.example.educationloan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "loan_application_db")
public class LoanApplication {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "application_id")
	private Integer id;
	
	@Column(name = "application_amt")
	private Integer loanAmt;

	@Column(name = "application_tenure")
	private Integer tenure;
	
	@Column(name = "application_date")
	private String date;

	@Column(name = "application_doc1")
	@Lob
	private String doc1;
	
	@Column(name = "application_doc1_name")
	private String doc1Filename;

	@Column(name = "application_doc2")
	@Lob
	private String doc2;
	
	@Column(name = "application_doc2_name")
	private String doc2Filename;

	@Column(name = "application_doc3")
	@Lob
	private String doc3;
	
	@Column(name = "application_doc3_name")
	private String doc3Filename;

	/*
	 * 1. NEW 2. APPROVED 3. PENDING 4. REJECTED
	 */
	@Column(name = "application_status")
	private String status;

	@Column(name = "application_comments")
	private String comment;

	@ManyToOne
	private Student student;

	@ManyToOne
	private EducationLoan loan;

	@Override
	public String toString() {
		return "LoanApplication [id=" + id + ", loanAmt=" + loanAmt + ", tenure=" + tenure + ", date=" + date
				+ ", doc1Filename=" + doc1Filename + ", doc2Filename=" + doc2Filename + ", doc3Filename=" + doc3Filename
				+ ", status=" + status + ", comment=" + comment + "]";
	}

	public Integer getId() {
		return id;
	}

	public Integer getTenure() {
		return tenure;
	}

	public String getDoc1() {
		return doc1;
	}

	public String getDoc2() {
		return doc2;
	}

	public String getDoc3() {
		return doc3;
	}

	public String getStatus() {
		return status;
	}

	public String getComment() {
		return comment;
	}

	public Student getStudent() {
		return student;
	}

	public EducationLoan getLoan() {
		return loan;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public void setDoc1(String doc1) {
		this.doc1 = doc1;
	}

	public void setDoc2(String doc2) {
		this.doc2 = doc2;
	}

	public void setDoc3(String doc3) {
		this.doc3 = doc3;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setLoan(EducationLoan loan) {
		this.loan = loan;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getLoanAmt() {
		return loanAmt;
	}

	public String getDoc1Filename() {
		return doc1Filename;
	}

	public String getDoc2Filename() {
		return doc2Filename;
	}

	public String getDoc3Filename() {
		return doc3Filename;
	}

	public void setLoanAmt(Integer loanAmt) {
		this.loanAmt = loanAmt;
	}

	public void setDoc1Filename(String doc1Filename) {
		this.doc1Filename = doc1Filename;
	}

	public void setDoc2Filename(String doc2Filename) {
		this.doc2Filename = doc2Filename;
	}

	public void setDoc3Filename(String doc3Filename) {
		this.doc3Filename = doc3Filename;
	}

}
