package com.capgemini.retailermaintanenceapi.dao;

import com.capgemini.retailermaintanenceapi.dto.UserInfo;

public interface UserDao {

	public boolean registerUser(UserInfo bean);
//	public boolean updatePassword(int id,String password);
	public UserInfo auth(String email,String password);
	public boolean changePassword(int id,String password);
}
