package com.chnbst.bstyun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chnbst.bstyun.core.base.BaseServiceImpl;
import com.chnbst.bstyun.core.common.helper.DaoHelper;
import com.chnbst.bstyun.dao.UserDao;
import com.chnbst.bstyun.model.pojo.User;
import com.chnbst.bstyun.model.vo.UserVO;
import com.chnbst.bstyun.service.UserService1;

@Service
@Transactional
public class UserServiceImpl1 extends BaseServiceImpl implements UserService1 {

	private String namespace = "com.chnbst.bstyun.mapper.UserMapper";
	private String sqlId = "";
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	@Override
	public boolean insertUser(User user) {
		sqlId = "insert";
		// TODO Auto-generated method stub
		return DaoHelper.insert(namespace, sqlId, user);
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	@Override
	public boolean deleteUser(String userEmail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	@Override
	public UserVO selectUserByUserEmail(String userEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	@Override
	public UserVO selectUserByUserEmailAndUserPassword(String userEmail,
			String userPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	@Override
	public List<UserVO> selectUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
