package com.example.springpracticetwo.Logout;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogoutController {
	
	@Autowired
	private LogoutDaoService service;
	
	@GetMapping("/logouts")
	public List<Logout>retriveAllLogouts(){
		return service.findAll();
	}
	@GetMapping("/logouts/{id}")
	public Logout retriveLogout(@PathVariable int id) {
		return service.findOne(id);
	}
	

}
