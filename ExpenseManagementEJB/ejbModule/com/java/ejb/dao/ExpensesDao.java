package com.java.ejb.dao;

import java.sql.SQLException;

import com.java.ejb.model.Expenses;

public interface ExpensesDao {
	String addExpensesDao(Expenses expenses) throws ClassNotFoundException, SQLException;
}
