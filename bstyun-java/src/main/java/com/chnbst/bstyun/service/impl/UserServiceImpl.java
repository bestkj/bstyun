package com.chnbst.bstyun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chnbst.bstyun.core.base.BaseServiceImpl;
import com.chnbst.bstyun.dao.UserDao;
import com.chnbst.bstyun.model.pojo.User;
import com.chnbst.bstyun.service.UserService;

@Transactional
@Service
public class UserServiceImpl extends BaseServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	@Override
	public int deleteUser(String userEmail) {
		return userDao.deleteUser(userEmail);
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	@Override
	public User selectUserByUserEmail(String userEmail) {
		return userDao.selectUserByUserEmail(userEmail);
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	@Override
	public List<User> selectUsers() {
		return userDao.selectUsers();
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	@Override
	public User selectUserByEmailAndPwd(String userEmail, String userPassword) {
		return userDao.selectUserByEmailAndPwd(userEmail, userPassword);
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	@Override
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}

}
