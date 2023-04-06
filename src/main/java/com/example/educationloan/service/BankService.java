package com.example.educationloan.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.educationloan.entity.Bank;
import com.example.educationloan.entity.BankRepresentative;
import com.example.educationloan.entity.Student;
import com.example.educationloan.repository.BankRepository;
import com.example.educationloan.repository.BankRepresentativeRepository;

@Component
public class BankService {

	@Autowired
	private BankRepository bankRepository;

	@Autowired
	private BankRepresentativeRepository bankRepRepository;

	public void save(Bank bank) {
		bankRepository.save(bank);
		
		/* save bank representative */
		BankRepresentative bankHandle = new BankRepresentative();
		bankHandle.setUsername(bank.getUsername());
		bankHandle.setPassword(bank.getPassword());
		bankHandle.setBankId(bank.getId());
		
		bankRepRepository.save(bankHandle);
		System.out.println("Bank Registered Successfully : " + bank.toString());
	}

	public Iterable<Bank> findAll() {
		return bankRepository.findAll();
	}

	public Optional<Bank> find(Integer id) {
		return bankRepository.findById(id);
	}

}
