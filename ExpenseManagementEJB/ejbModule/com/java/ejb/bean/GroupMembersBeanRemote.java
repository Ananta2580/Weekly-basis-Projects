package com.java.ejb.bean;

import java.sql.SQLException;

import javax.ejb.Remote;

import com.java.ejb.model.Group_Members;

@Remote
public interface GroupMembersBeanRemote {
	
	String addMembers(Group_Members members) throws ClassNotFoundException, SQLException;

}
