package com.jwat.springmvc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwat.springmvc.model.User;

@Repository
public class UserDAOImpl implements UserDAO{
	@Autowired
	private SqlSession sqlSession;
	
	public List<User> getUserList(){
		return sqlSession.selectList("Mapper.selectUsers");
	}
}
