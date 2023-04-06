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
import com.example.educationloan.service.BankHandleService;
import com.example.educationloan.service.BankService;

@CrossOrigin(origins = "http://localhost:3000")
@Controller // This means that this class is a Controller
@RequestMapping(path = "/bank")
public class BankController {
	@Autowired
	private BankService bankService;
	
	@Autowired
	private BankHandleService bankHandleService;

	@PostMapping(path = "/add")
	public @ResponseBody String addNewUser(@RequestBody Bank bank) {
		bankService.save(bank);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Bank> getAll() {
		return bankService.findAll();
	}
	
	/* Handle means one who handles banking operation (adding loan details, verifying loan applications etc) for a bank */
	@GetMapping(path = "/handle/all")
	public @ResponseBody Iterable<BankRepresentative> getAllBankRepresentative() {
		return bankHandleService.findAll();
	}

	@GetMapping(value = "/search/{id}")
	@ResponseBody
	public Optional<Bank> getItemById(@PathVariable Integer id) {
		// This returns a JSON or XML with the users
		return bankService.find(id);
	}
}
