package com.example.educationloan.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.educationloan.entity.College;
import com.example.educationloan.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
