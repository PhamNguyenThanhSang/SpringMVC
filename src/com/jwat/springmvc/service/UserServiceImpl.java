package com.jwat.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwat.springmvc.dao.UserDAO;
import com.jwat.springmvc.model.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;
	
	public List<User> getUserList(){
		return userDAO.getUserList();
	}
}
