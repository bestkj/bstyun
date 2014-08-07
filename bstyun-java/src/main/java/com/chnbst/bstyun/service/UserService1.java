package com.chnbst.bstyun.service;

import java.util.List;

import com.chnbst.bstyun.model.pojo.User;
import com.chnbst.bstyun.model.vo.UserVO;

public interface UserService1 {
	boolean insertUser(User user);
	
	boolean deleteUser(String userEmail);
	
	boolean updateUser(User user);
	
	UserVO selectUserByUserEmail(String userEmail);
	
	UserVO selectUserByUserEmailAndUserPassword(String userEmail,String userPassword);
	
	List<UserVO> selectUsers();
}
