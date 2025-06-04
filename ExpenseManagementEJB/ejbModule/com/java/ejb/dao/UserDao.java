package com.java.ejb.dao;

import java.sql.SQLException;

import com.java.ejb.model.Users;

public interface UserDao {
	
	String addUserDao(Users users) throws ClassNotFoundException, SQLException;

}
