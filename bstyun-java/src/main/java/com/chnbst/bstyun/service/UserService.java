package com.chnbst.bstyun.service;

import java.util.List;

import com.chnbst.bstyun.model.pojo.User;

public interface UserService {
	int deleteUser(String userEmail);

    int insertUser(User user);

    User selectUserByUserEmail(String userEmail);

    List<User> selectUsers();
    
    User selectUserByEmailAndPwd(String userEmail,String userPassword);
    
    int updateUser(User user);
}
