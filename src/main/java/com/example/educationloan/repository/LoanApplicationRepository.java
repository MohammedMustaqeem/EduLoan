package com.example.educationloan.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.educationloan.entity.LoanApplication;

public interface LoanApplicationRepository extends CrudRepository<LoanApplication, Integer> {

}
