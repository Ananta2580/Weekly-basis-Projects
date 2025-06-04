package com.java.ejb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.ejb.model.Group_s;
import com.java.ejb.util.ConnectionHelper;

public class GroupDaoImpl implements GroupDao{

	@Override
	public String addGroupDao(Group_s groups) throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionHelper.getConnection();
		String query = "INSERT INTO group_s (groupName, createdAt, createdBy, tripFare) VALUES (?, ?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, groups.getGroupName());
		java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(System.currentTimeMillis());
		groups.setCreatedAt(new java.sql.Date(currentTimestamp.getTime()));
		ps.setDate(2, groups.getCreatedAt());
		ps.setString(3, groups.getCreatedBy());
		ps.setDouble(4, groups.getTripFare());
		
		ps.executeUpdate();
		
		return "Group Created Successfully";
	}

}
