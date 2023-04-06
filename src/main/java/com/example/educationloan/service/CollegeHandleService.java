package com.example.educationloan.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.educationloan.entity.CollegeRepresentative;
import com.example.educationloan.repository.CollegeRepresentativeRepository;

@Component
public class CollegeHandleService {
	@Autowired
	private CollegeRepresentativeRepository clgRepRepository;

	public Iterable<CollegeRepresentative> findAll() {
		return clgRepRepository.findAll();
	}

	public Optional<CollegeRepresentative> find(Integer id) {
		return clgRepRepository.findById(id);
	}
}
