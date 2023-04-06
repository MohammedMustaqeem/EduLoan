package com.example.educationloan.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.educationloan.entity.LoanApplication;
import com.example.educationloan.repository.LoanApplicationRepository;

@Component
public class LoanApplicationService {
	@Autowired
	private LoanApplicationRepository loanAppRepository;

	public void save(LoanApplication loan) {
		loanAppRepository.save(loan);
		System.out.println("Loan application submitted successfully : " + loan.toString());
	}

	public Iterable<LoanApplication> findAll() {
		return loanAppRepository.findAll();
	}

	public Optional<LoanApplication> find(Integer id) {
		return loanAppRepository.findById(id);
	}

	/* Find list of loan applications with respect to given college */
	public List<LoanApplication> findAllByCollegeId(Integer collegeId) {
		Iterator<LoanApplication> iter = loanAppRepository.findAll().iterator();
		List<LoanApplication> output = new ArrayList<>();
		while (iter.hasNext()) {
			LoanApplication application = iter.next();
			if (application.getStudent().getClg().getId() == collegeId) {
				output.add(application);
			}
		}
		return output;
	}
	
	/* Find list of loan applications with respect to given student */
	public List<LoanApplication> findAllByStudentId(Integer studentId) {
		Iterator<LoanApplication> iter = loanAppRepository.findAll().iterator();
		List<LoanApplication> output = new ArrayList<>();
		while (iter.hasNext()) {
			LoanApplication application = iter.next();
			if (application.getStudent().getId() == studentId) {
				output.add(application);
			}
		}
		return output;
	}

	/* Find list of loan applications with respect to given Bank */
	public List<LoanApplication> findAllByBankId(Integer bankId) {
		Iterator<LoanApplication> iter = loanAppRepository.findAll().iterator();
		List<LoanApplication> output = new ArrayList<>();
		while (iter.hasNext()) {
			LoanApplication application = iter.next();
			if (application.getLoan().getBank().getId() == bankId) {
				output.add(application);
			}
		}
		return output;
	}
}
