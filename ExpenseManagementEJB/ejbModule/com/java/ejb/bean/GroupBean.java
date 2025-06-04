package com.java.ejb.bean;

import java.sql.SQLException;

import javax.ejb.Remote;
import javax.ejb.Stateful;

import com.java.ejb.dao.GroupDao;
import com.java.ejb.dao.GroupDaoImpl;
import com.java.ejb.model.Group_s;

/**
 * Session Bean implementation class GroupBean
 */
@Stateful
@Remote(GroupBeanRemote.class)
public class GroupBean implements GroupBeanRemote {
	
	static GroupDao groupDao;
	
	static {
		groupDao = new GroupDaoImpl();
	}

    /**
     * Default constructor. 
     */
    public GroupBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String addGroup(Group_s groups) throws ClassNotFoundException, SQLException {
		return groupDao.addGroupDao(groups);
	}

}
