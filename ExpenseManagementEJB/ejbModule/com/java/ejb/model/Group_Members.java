package com.java.ejb.model;

import java.io.Serializable;
import java.sql.Date;

public class Group_Members implements Serializable{
	
	private int memberId;
	private Group_s groups;
	private Users users;
	private Date joinedAt;
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public Group_s getGroups() {
		return groups;
	}
	public void setGroups(Group_s groups) {
		this.groups = groups;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public Date getJoinedAt() {
		return joinedAt;
	}
	public void setJoinedAt(Date joinedAt) {
		this.joinedAt = joinedAt;
	}
	
}
