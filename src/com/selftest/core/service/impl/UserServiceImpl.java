package com.selftest.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.selftest.core.dao.UserDao;
import com.selftest.core.po.User;
import com.selftest.core.service.UserService;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	//通过账号和密码查询用户
	@Override
	public User findUser(String usercode, String password) {
		// TODO Auto-generated method stub
		User user = this.userDao.findUser(usercode, password);
		return user ;
	}
	
	

}
