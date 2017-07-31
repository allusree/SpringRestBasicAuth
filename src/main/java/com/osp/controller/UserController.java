package com.osp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.osp.model.User;

@RestController
public class UserController {
	@RequestMapping(value="/getUsers/{id}", method=RequestMethod.GET,produces = "application/json")
	@ResponseBody
	
	public User getUserById(@PathVariable("id") String id){
		
		User user= new User();
		user.setUserId(id);
		user.setUserName("userName1");
		user.setUserRole("Admin");
		
		return user;
		
	}
}
