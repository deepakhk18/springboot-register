package com.example.springpracticetwo.Logout;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class LogoutDaoService {
	
	private static List<Logout> logouts =new ArrayList<>();
	
	private static int logoutsCount=3;
	
	static {
		
		logouts.add(new Logout(1,"deepak@gmail.com"));
		logouts.add(new Logout(2,"divya@gmail.com"));
		logouts.add(new Logout(3,"pulsar@gmail.com"));
		
		
	}
	public List<Logout>findAll(){
		return logouts;
	}
	public Logout save(Logout logout) {
		if(logout.getId()==null) {
			logout.setId(++logoutsCount);
		}
		logouts.add(logout);
		return logout;
	}
	
	public Logout findOne(int id) {
		for(Logout logout:logouts) {
			if(logout.getId()==id) {
				return logout;
			}
		}
		return null;
	}
	
	

}
