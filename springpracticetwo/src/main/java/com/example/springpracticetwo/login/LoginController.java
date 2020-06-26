package com.example.springpracticetwo.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@Autowired
	private LoginDaoService service;
	
	@GetMapping("/logins")
	public List<Login>retriveAllLogins(){
		return service.findAll();
	}
	
	@GetMapping("/logins/{id}")
	public Login retriveLogin(@PathVariable int id) {
		return service.findOne(id);
	}
	
	
	

}
