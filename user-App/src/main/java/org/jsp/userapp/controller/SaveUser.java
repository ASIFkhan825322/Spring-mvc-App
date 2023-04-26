package org.jsp.userapp.controller;

import org.jsp.userapp.UserConfig;
import org.jsp.userapp.dto.User;
import org.jsp.userapp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveUser {
	public static void main(String[] args) {
		User user =new User();
		user.setName("ravi");
		user.setPassword("a123");
		user.setPhone(423243423);
		
		ApplicationContext context=new AnnotationConfigApplicationContext(UserConfig.class);
	    UserService service =context.getBean(UserService.class);
	    service.saveUser(user);
	}

}
