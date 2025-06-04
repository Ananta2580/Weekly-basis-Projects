package com.java.ejb.bean;

import java.sql.SQLException;

import javax.ejb.Remote;

import com.java.ejb.model.Expenses;

@Remote
public interface ExpensesBeanRemote {
	
	String addExpenses(Expenses expenses) throws ClassNotFoundException, SQLException;

}
