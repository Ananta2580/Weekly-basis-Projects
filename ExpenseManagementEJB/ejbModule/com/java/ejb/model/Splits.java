package com.java.ejb.model;

import java.io.Serializable;

public class Splits implements Serializable{
	private int splitId;
	private Expenses expenses;
	private Users users;
	private double amountOwed;
	
	public int getSplitId() {
		return splitId;
	}
	public void setSplitId(int splitId) {
		this.splitId = splitId;
	}
	public Expenses getExpenses() {
		return expenses;
	}
	public void setExpenses(Expenses expenses) {
		this.expenses = expenses;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public double getAmountOwed() {
		return amountOwed;
	}
	public void setAmountOwed(double amountOwed) {
		this.amountOwed = amountOwed;
	}

}
