package com.example.educationloan.controller;

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

import com.example.educationloan.entity.Admin;
import com.example.educationloan.service.AdminService;

@CrossOrigin(origins = "http://localhost:3000")
@Controller // This means that this class is a Controller
@RequestMapping(path = "/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;

	@PostMapping(path = "/add")
	public @ResponseBody String add(@RequestBody Admin admin) {
		adminService.save(admin);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Admin> getAll() {
		return adminService.findAll();
	}

	@GetMapping(value = "/search/{id}")
	@ResponseBody
	public Optional<Admin> getItemById(@PathVariable Integer id) {
		// This returns a JSON or XML with the users
		return adminService.find(id);
	}
}
