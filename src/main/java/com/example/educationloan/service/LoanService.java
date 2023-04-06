package com.example.educationloan.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.educationloan.entity.EducationLoan;
import com.example.educationloan.entity.LoanApplication;
import com.example.educationloan.repository.EducationLoanRepository;

@Component
public class LoanService {
	@Autowired
	private EducationLoanRepository loanRepository;

	public void save(EducationLoan loan) {
		loanRepository.save(loan);
		System.out.println("Education loan details added successfully : " + loan.toString());
	}

	public Iterable<EducationLoan> findAll() {
		return loanRepository.findAll();
	}

	public Optional<EducationLoan> find(Integer id) {
		return loanRepository.findById(id);
	}
	
	/* Find list of loan details with respect to given Bank */
	public List<EducationLoan> findAllByBankId(Integer bankId) {
		Iterator<EducationLoan> iter = loanRepository.findAll().iterator();
		List<EducationLoan> output = new ArrayList<>();
		while (iter.hasNext()) {
			EducationLoan loan = iter.next();
			if (loan.getBank().getId() == bankId) {
				output.add(loan);
			}
		}
		return output;
	}
}
