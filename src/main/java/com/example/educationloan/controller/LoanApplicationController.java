package com.example.educationloan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.educationloan.entity.LoanApplication;
import com.example.educationloan.service.LoanApplicationService;

@CrossOrigin(origins = "http://localhost:3000")
@Controller // This means that this class is a Controller
@RequestMapping(path = "/loan-application")
public class LoanApplicationController {
	@Autowired
	private LoanApplicationService loanAppService;

	@PostMapping(path = "/add")
	public @ResponseBody String add(@RequestBody LoanApplication loanApp) {
		loanAppService.save(loanApp);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<LoanApplication> getAll() {
		return loanAppService.findAll();
	}

	@GetMapping(value = "/search/{id}")
	@ResponseBody
	public Optional<LoanApplication> getItemById(@PathVariable Integer id) {
		// This returns a JSON or XML with the users
		return loanAppService.find(id);
	}

	// Filter Applications by clg id
	@GetMapping(value = "/college/{id}")
	@ResponseBody
	public List<LoanApplication> getItemByCollegeId(@PathVariable Integer id) {
		return loanAppService.findAllByCollegeId(id);
	}

	// Filter Applications by student id
	@GetMapping(value = "/student/{id}")
	@ResponseBody
	public List<LoanApplication> getItemByStudentId(@PathVariable Integer id) {
		return loanAppService.findAllByStudentId(id);
	}

	// Filter Applications by bank id
	@GetMapping(value = "/bank/{id}")
	@ResponseBody
	public List<LoanApplication> getItemByBankId(@PathVariable Integer id) {
		return loanAppService.findAllByBankId(id);
	}
}
