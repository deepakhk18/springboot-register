package com.example.springpracticetwo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
	
	@Autowired
	private RegisterDaoService service;
	@GetMapping("/registers")
	public List <Register> retriveAllRegisters(){
		return service.findAll();
	}
	
	@GetMapping("/registers/{id}")
	public Register retriveUser(@PathVariable int id) {
		return service.findOne(id);
	}
	
}
