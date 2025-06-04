package com.java.ejb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.ejb.model.Expenses;
import com.java.ejb.util.ConnectionHelper;

public class ExpensesDaoImpl implements ExpensesDao{

	@Override
	public String addExpensesDao(Expenses expenses) throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionHelper.getConnection();
		String query = "INSERT INTO Expenses (GroupId, UserId, Description, TotalAmount, ExpenseDate, CreatedAt)"
				+ "VALUES (?, ?, ?, ?, ?, ?);";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, expenses.getGroups().getGroupId());
		ps.setInt(2, expenses.getUsers().getUserId());
		ps.setString(3, expenses.getDescription());
		ps.setDouble(4, expenses.getTotalAmount());
		ps.setDate(5, expenses.getExpenseDate());
		ps.setDate(6, expenses.getCreatedAt());
		
		ps.executeUpdate();
		
		return "Expenses inserted successfully";
	}

}
