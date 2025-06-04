package com.java.ejb.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Remote;
import javax.ejb.Stateful;

import com.java.ejb.dao.UserDao;
import com.java.ejb.dao.UserDaoImpl;
import com.java.ejb.model.Users;
import com.java.ejb.util.ConnectionHelper;

/**
 * Session Bean implementation class UserBean
 */
@Stateful
@Remote(UserBeanRemote.class)
public class UserBean implements UserBeanRemote {
	
	static UserDao userDao;
	
	static {
		userDao = new UserDaoImpl();
	}

    /**
     * Default constructor. 
     */
    public UserBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String addUser(Users users) throws ClassNotFoundException, SQLException {
		return userDao.addUserDao(users);
	}

}
