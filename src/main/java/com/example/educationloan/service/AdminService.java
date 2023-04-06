package com.example.educationloan.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.educationloan.entity.Admin;
import com.example.educationloan.repository.AdminRepository;

@Component
public class AdminService {
	@Autowired
	private AdminRepository adminRepository;

	public void save(Admin admin) {
		adminRepository.save(admin);
		System.out.println("Admin record registered successfully : " + admin.toString());
	}

	public Iterable<Admin> findAll() {
		return adminRepository.findAll();
	}

	public Optional<Admin> find(Integer id) {
		return adminRepository.findById(id);
	}
}
