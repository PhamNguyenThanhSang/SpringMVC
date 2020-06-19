package com.jwat.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jwat.springmvc.model.User;
import com.jwat.springmvc.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index() {
		List<User> userList = userService.getUserList();
		ModelAndView model = new ModelAndView();
		if(!userList.isEmpty()) {
			model.addObject("userList", userList);
		}
		return "index";
	}
	
}
