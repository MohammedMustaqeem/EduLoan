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

import com.example.educationloan.entity.EducationLoan;
import com.example.educationloan.entity.LoanApplication;
import com.example.educationloan.service.LoanService;

@CrossOrigin(origins = "http://localhost:3000")
@Controller // This means that this class is a Controller
@RequestMapping(path = "/loan")
public class LoanController {
	@Autowired
	private LoanService loanService;

	@PostMapping(path = "/add")
	public @ResponseBody String add(@RequestBody EducationLoan loan) {
		loanService.save(loan);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<EducationLoan> getAll() {
		return loanService.findAll();
	}

	@GetMapping(value = "/search/{id}")
	@ResponseBody
	public Optional<EducationLoan> getItemById(@PathVariable Integer id) {
		// This returns a JSON or XML with the users
		return loanService.find(id);
	}
	
	// Filter loans by college id
	@GetMapping(value = "/bank/{id}")
	@ResponseBody
	public List<EducationLoan> getItemByBankId(@PathVariable Integer id) {
		return loanService.findAllByBankId(id);
	}
}
