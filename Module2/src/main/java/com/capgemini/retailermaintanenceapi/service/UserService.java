package com.capgemini.retailermaintanenceapi.service;

import com.capgemini.retailermaintanenceapi.dto.UserInfo;

public interface UserService {

	public boolean registerUser(UserInfo bean);
//	public boolean updatePassword(int id,String password);
	public UserInfo auth(String email,String password);
	public boolean changePassword(int id,String password);
}
