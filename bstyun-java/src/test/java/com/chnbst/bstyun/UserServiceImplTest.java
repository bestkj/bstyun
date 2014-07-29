package com.chnbst.bstyun;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chnbst.bstyun.model.pojo.User;
import com.chnbst.bstyun.service.UserService;
import com.chnbst.bstyun.service.impl.UserServiceImpl;

public class UserServiceImplTest {

	static ApplicationContext applicationContext;
	static UserService userService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("/com/chnbst/bstyun/config/spring-common-config.xml");
		userService = applicationContext.getBean(UserService.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		applicationContext = null;
	}

	@Test
	public void testDeleteUser() {
		User user = 
				userService.selectUserByUserEmail("zhangsan@qq.com");
		if(user != null) {
			int rowAffected = userService.deleteUser(user.getUserEmail());
			assertTrue(rowAffected > 0);
		}
	}

	@Test
	public void testInsertUser() {
		User user = new User();
		user.setUserEmail("zhangsan@qq.com");
		user.setUserName("张三");
		user.setUserPassword("123");
		user.setUserMobile("18626869671");
		int rowAffected = userService.insertUser(user);
		
		assertTrue(rowAffected > 0);
	}

	@Test
	public void testSelectUserByUserEmail() {
		User user = 
		userService.selectUserByUserEmail("liqiang1@qq.com");
		
		assertTrue(user != null);
		
		System.out.println(user.getUserEmail());
	}

	@Test
	public void testSelectUsers() {
		List<User> users = userService.selectUsers();
		assertTrue(users.size() > 0);
		for (User user : users) {
			System.out.println(user.getUserEmail());
		}
	}

	@Test
	public void testSelectUserByEmailAndPwd() {
		User user = userService.selectUserByEmailAndPwd("liqiang@qq.com", "123");
		
		assertTrue(user != null);
		
		System.out.println(user.getUserEmail() + " : " + user.getUserPassword());
	}

	@Test
	public void testUpdateUser() {
		User user = 
				userService.selectUserByUserEmail("liqiang@qq.com");
		user.setUserMobile("13355811799");
		user.setUserName("郦团团");
		user.setUserPassword("321");
		
		int rowAffected = userService.updateUser(user);
		assertTrue(rowAffected > 0);
	}

}
