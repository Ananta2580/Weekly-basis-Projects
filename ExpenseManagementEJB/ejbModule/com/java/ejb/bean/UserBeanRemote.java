package com.java.ejb.bean;

import java.sql.SQLException;

import javax.ejb.Remote;

import com.java.ejb.model.Users;

@Remote
public interface UserBeanRemote {
	
	String addUser(Users users) throws ClassNotFoundException, SQLException;

}
