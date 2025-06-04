package com.java.ejb.bean;

import java.sql.SQLException;

import javax.ejb.Remote;

import com.java.ejb.model.Group_s;

@Remote
public interface GroupBeanRemote {
	String addGroup(Group_s groups) throws ClassNotFoundException, SQLException;
}
