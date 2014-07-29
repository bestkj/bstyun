package com.chnbst.bstyun.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.stereotype.Repository;

import com.chnbst.bstyun.core.base.BaseDaoImpl;
import com.chnbst.bstyun.dao.UserDao;
import com.chnbst.bstyun.model.pojo.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl implements UserDao {
	public UserDaoImpl() {
		namepace = "com.chnbst.bstyun.mapper.UserMapper.";
	}

	@Override
	public int deleteUser(String userEmail) {
		return this.delete("delete", userEmail);
	}

	@Override
	public int insertUser(User user) {
		return this.insert("insert", user);
	}

	@Override
	public User selectUserByUserEmail(String userEmail) {
		return (User)this.queryOne("selectByPrimaryKey", userEmail);
	}

	@Override
	public List<User> selectUsers() {
		return this.queryAll("select",null);
	}

	@Override
	public int updateUser(User user) {
		return this.update("update", user);
	}

	@Override
	public User selectUserByEmailAndPwd(String userEmail,
			String userPassword) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userEmail", userEmail);
		map.put("userPassword", userPassword);

		return (User)this.queryOne("selectByUserEmailAndPwd", map);
	}
	

}
