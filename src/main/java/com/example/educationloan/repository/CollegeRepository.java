package com.example.educationloan.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.educationloan.entity.Bank;
import com.example.educationloan.entity.College;

public interface CollegeRepository extends CrudRepository<College, Integer> {

}
