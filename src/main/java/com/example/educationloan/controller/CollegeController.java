package com.example.educationloan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.educationloan.entity.Bank;
import com.example.educationloan.entity.BankRepresentative;
import com.example.educationloan.entity.College;
import com.example.educationloan.entity.CollegeRepresentative;
import com.example.educationloan.entity.Student;
import com.example.educationloan.service.CollegeHandleService;
import com.example.educationloan.service.CollegeService;

@CrossOrigin(origins = "http://localhost:3000")
@Controller // This means that this class is a Controller
@RequestMapping(path = "/college")
public class CollegeController {
	@Autowired
	private CollegeService collegeService;
	
	@Autowired
	private CollegeHandleService collegeHandleService;

	@PostMapping(path = "/add")
	public @ResponseBody String addNewUser(@RequestBody College college) {
		collegeService.save(college);
		return "Saved";
	}
	
	@PostMapping(path = "/student/add/{clgId}")
	public @ResponseBody String addNewStudent(@PathVariable Integer clgId, @RequestBody Student std) {
		collegeService.saveStudent(clgId, std);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<College> getAll() {
		return collegeService.findAll();
	}
	
	@GetMapping(value = "/search/{id}")
	@ResponseBody
	public Optional<College> getClgById(@PathVariable Integer id) {
		return collegeService.find(id);
	}
	
	/* Handle means one who handles all students of a college */
	@GetMapping(path = "/handle/all")
	public @ResponseBody Iterable<CollegeRepresentative> getAllBankRepresentative() {
		return collegeHandleService.findAll();
	}

	// get all students for a given college id
	@GetMapping(value = "/students/{id}")
	@ResponseBody
	public List<Student> getItemById(@PathVariable Integer id) {
		return collegeService.findAllStudents(id);
	}
}
