package com.java.ejb.dao;

import java.sql.SQLException;

import com.java.ejb.model.Group_s;

public interface GroupDao {
	
	String addGroupDao(Group_s groups) throws ClassNotFoundException, SQLException;

}
