package com.java.ejb.bean;

import java.sql.SQLException;

import javax.ejb.Remote;
import javax.ejb.Stateful;

import com.java.ejb.dao.GroupMembersDao;
import com.java.ejb.dao.GroupMembersDaoImpl;
import com.java.ejb.model.Group_Members;

/**
 * Session Bean implementation class GroupMembersBean
 */
@Stateful
@Remote(GroupMembersBeanRemote.class)
public class GroupMembersBean implements GroupMembersBeanRemote {
	
	static GroupMembersDao membersDao;
	
	static {
		membersDao = new GroupMembersDaoImpl();
	}

    /**
     * Default constructor. 
     */
    public GroupMembersBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String addMembers(Group_Members members) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return membersDao.addMembersDao(members);
	}

}
