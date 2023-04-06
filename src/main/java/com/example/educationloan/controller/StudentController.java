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

import com.example.educationloan.entity.College;
import com.example.educationloan.entity.Student;
import com.example.educationloan.service.CollegeService;
import com.example.educationloan.service.StudentService;

@CrossOrigin(origins = "http://localhost:3000")
@Controller // This means that this class is a Controller
@RequestMapping(path = "/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping(path = "/add")
	public @ResponseBody String addNewUser(@RequestBody Student student) {
		studentService.save(student);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Student> getAll() {
		return studentService.findAll();
	}

	// get all students for a given college id
	@GetMapping(value = "/search/{id}")
	@ResponseBody
	public Optional<Student> getItemById(@PathVariable Integer id) {
		return studentService.find(id);
	}
}
