package com.java.ejb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.ejb.model.Group_Members;
import com.java.ejb.util.ConnectionHelper;

public class GroupMembersDaoImpl implements GroupMembersDao{

	@Override
	public String addMembersDao(Group_Members members) throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionHelper.getConnection();
		String query = "INSERT INTO group_members (groupid, userid, joinedat)"
				+ "VALUES (?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, members.getGroups().getGroupId());
		ps.setInt(2, members.getUsers().getUserId());
		java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(System.currentTimeMillis());
		members.setJoinedAt(new java.sql.Date(currentTimestamp.getTime()));
		ps.setDate(3, members.getJoinedAt());
		
		ps.executeUpdate();
		return "Member added Successfully";
	}

}
