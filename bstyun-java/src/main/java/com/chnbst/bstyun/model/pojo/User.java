package com.chnbst.bstyun.model.pojo;

import com.chnbst.bstyun.core.common.Pager;
import com.chnbst.bstyun.core.model.IPOJO;

public class User extends Pager implements IPOJO{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.user_email
	 * @mbggenerated  Mon Jul 28 17:23:47 CST 2014
	 */
	private String userEmail;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.user_name
	 * @mbggenerated  Mon Jul 28 17:23:47 CST 2014
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.user_password
	 * @mbggenerated  Mon Jul 28 17:23:47 CST 2014
	 */
	private String userPassword;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.user_mobile
	 * @mbggenerated  Mon Jul 28 17:23:47 CST 2014
	 */
	private String userMobile;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.user_email
	 * @return  the value of tb_user.user_email
	 * @mbggenerated  Mon Jul 28 17:23:47 CST 2014
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.user_email
	 * @param userEmail  the value for tb_user.user_email
	 * @mbggenerated  Mon Jul 28 17:23:47 CST 2014
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.user_name
	 * @return  the value of tb_user.user_name
	 * @mbggenerated  Mon Jul 28 17:23:47 CST 2014
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.user_name
	 * @param userName  the value for tb_user.user_name
	 * @mbggenerated  Mon Jul 28 17:23:47 CST 2014
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.user_password
	 * @return  the value of tb_user.user_password
	 * @mbggenerated  Mon Jul 28 17:23:47 CST 2014
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.user_password
	 * @param userPassword  the value for tb_user.user_password
	 * @mbggenerated  Mon Jul 28 17:23:47 CST 2014
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.user_mobile
	 * @return  the value of tb_user.user_mobile
	 * @mbggenerated  Mon Jul 28 17:23:47 CST 2014
	 */
	public String getUserMobile() {
		return userMobile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.user_mobile
	 * @param userMobile  the value for tb_user.user_mobile
	 * @mbggenerated  Mon Jul 28 17:23:47 CST 2014
	 */
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
}