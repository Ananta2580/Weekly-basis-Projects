package com.java.ejb.model;

import java.io.Serializable;
import java.sql.Date;

public class Expenses implements Serializable{
	private int expenseId;
	private Group_s groups;
	private Users users;
	private String description;
	private double totalAmount;
	private Date expenseDate;
	private Date createdAt;
	
	public int getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Date getExpenseDate() {
		return expenseDate;
	}
	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
