package com.java.ejb.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

public class Group_s implements Serializable{
	private int groupId;
	private String groupName;
	private Date createdAt;
	private String createdBy;
	private double tripFare;
	
	public double getTripFare() {
		return tripFare;
	}
	public void setTripFare(double tripFare) {
		this.tripFare = tripFare;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
}
