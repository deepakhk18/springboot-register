package com.example.springpracticetwo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RegisterDaoService {
	
	private static List<Register>registers =new ArrayList<>();
	
	private static int registerCount =3;
	
	static {
		     registers.add(new Register(1,"deepak","dee@gmail.com","1234"));
		     registers.add(new Register(2,"deepak","dee@gmail.com","1234"));
		     registers.add(new Register(3,"deepak","dee@gmail.com","1234"));
		    
		
	}
	
	public List<Register> findAll(){
		return registers;
	}
	public Register save(Register register) {
		if(register.getId()==null) {
	            register.setId(++registerCount);
			}
		registers.add(register);
	return register;
	}
	public Register findOne(int id) {
		for(Register register:registers) {
			if(register.getId()==id) {
				return register;
			}
		}
		return null;
}


}
