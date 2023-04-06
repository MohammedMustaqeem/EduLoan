package com.example.educationloan.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.educationloan.entity.Bank;
import com.example.educationloan.entity.BankRepresentative;
import com.example.educationloan.repository.BankRepresentativeRepository;

@Component
public class BankHandleService {
	@Autowired
	private BankRepresentativeRepository bankRepRepository;

	public Iterable<BankRepresentative> findAll() {
		return bankRepRepository.findAll();
	}

	public Optional<BankRepresentative> find(Integer id) {
		return bankRepRepository.findById(id);
	}

}
