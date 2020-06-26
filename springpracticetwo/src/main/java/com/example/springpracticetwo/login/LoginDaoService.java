package com.example.springpracticetwo.login;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class LoginDaoService {
	private static List<Login> logins =new ArrayList<>();
	
	private static int loginsCount=3;
			
			static {
				logins.add(new Login(1,"divya@gmail.com","password"));
				logins.add(new Login(2,"arun@gmail.com","password"));
				logins.add(new Login(2,"deepak@gmail.com","password"));
	    }
			public List<Login>findAll(){
				return logins;
			}
			public Login save(Login login) {
				if(login.getId()==null) {
					login.setId(++loginsCount);
				}
				logins.add(login);
				return login;
			}
			
			public Login findOne(int id) {
				for(Login login:logins) {
					if(login.getId()==id) {
						return login;
					}
				}
				return null;
			}
	

}
