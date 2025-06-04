package com.java.ejb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.ejb.model.Users;
import com.java.ejb.util.ConnectionHelper;

public class UserDaoImpl implements UserDao{

	@Override
	public String addUserDao(Users users) throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionHelper.getConnection();
		String query = "INSERT INTO Users (username, email, createdAt, password) VALUES (?, ?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, users.getUsername());
	    ps.setString(2, users.getEmail());
	    java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(System.currentTimeMillis());
	    users.setCreatedAt(new java.sql.Date(currentTimestamp.getTime()));
	    ps.setDate(3, users.getCreatedAt());
	    ps.setString(4, users.getPassword());

	    ps.executeUpdate();
	    
	    return "User Inserted Successfully";
	}

}
