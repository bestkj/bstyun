package com.chnbst.bstyun.dao;

import java.util.List;

import com.chnbst.bstyun.core.base.BaseDao;
import com.chnbst.bstyun.model.pojo.User;

public interface UserDao{
    int deleteUser(String userEmail);

    int insertUser(User user);

    User selectUserByUserEmail(String userEmail);

    List<User> selectUsers();
    
    User selectUserByEmailAndPwd(String userEmail,String userPassword);
    
    int updateUser(User user);
}