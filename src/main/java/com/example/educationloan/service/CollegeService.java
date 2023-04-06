package com.example.educationloan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.educationloan.entity.Bank;
import com.example.educationloan.entity.College;
import com.example.educationloan.entity.CollegeRepresentative;
import com.example.educationloan.entity.Student;
import com.example.educationloan.repository.CollegeRepository;
import com.example.educationloan.repository.CollegeRepresentativeRepository;

@Component
public class CollegeService {
	@Autowired
	private CollegeRepository clgRepository;

	@Autowired
	private CollegeRepresentativeRepository clgRepRepository;

	public void save(College college) {
		clgRepository.save(college);
		
		CollegeRepresentative collegeHandle = new CollegeRepresentative();
		collegeHandle.setUsername(college.getUsername());
		collegeHandle.setPassword(college.getPassword());
		collegeHandle.setCollegeId(college.getId());
		
		clgRepRepository.save(collegeHandle);
		System.out.println("College Registered Successfully : " + college.toString());
	}
	
	public void saveStudent(Integer clgId, Student student) {
		Optional<College> clgOp = clgRepository.findById(clgId);
		College clg = null;
		if (clgOp.isPresent()) {
			clg = clgOp.get();
			clg.getStudents().add(student);
			clgRepository.save(clg);
			System.out.println("Student record saved successfully : " + student.toString() + ", CollegID = " + clgId);
		}
	}

	public Iterable<College> findAll() {
		Iterable<College> list = clgRepository.findAll();
		return list;
	}
	
	public Optional<College> find(Integer id) {
		return clgRepository.findById(id);
	}

	public List<Student> findAllStudents(int id) {
		Optional<College> clgOp = clgRepository.findById(id);
		College clg = null;
		if (clgOp.isPresent()) {
			clg = clgOp.get();
			return clg.getStudents();
		}
		return null;
	}
}
