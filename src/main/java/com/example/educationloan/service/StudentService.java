package com.example.educationloan.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.educationloan.entity.Student;
import com.example.educationloan.repository.StudentRepository;

@Component
public class StudentService {
	@Autowired
	private StudentRepository stdRepository;

	public void save(Student std) {
		stdRepository.save(std);
		System.out.println("Student record saved successfully : " + std.toString());
	}

	public Iterable<Student> findAll() {
		return stdRepository.findAll();
	}

	public Optional<Student> find(Integer id) {
		return stdRepository.findById(id);
	}
}
