package com.java.ejb.dao;

import java.sql.SQLException;

import com.java.ejb.model.Group_Members;

public interface GroupMembersDao {
	
	String addMembersDao(Group_Members members) throws ClassNotFoundException, SQLException;

}
