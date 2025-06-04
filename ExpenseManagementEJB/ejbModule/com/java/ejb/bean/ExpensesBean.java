package com.java.ejb.bean;

import java.sql.SQLException;

import javax.ejb.Remote;
import javax.ejb.Stateful;

import com.java.ejb.dao.ExpensesDao;
import com.java.ejb.dao.ExpensesDaoImpl;
import com.java.ejb.model.Expenses;

/**
 * Session Bean implementation class ExpensesBean
 */
@Stateful
@Remote(ExpensesBeanRemote.class)
public class ExpensesBean implements ExpensesBeanRemote {
	
	static ExpensesDao expensesDao;
	
	static {
		expensesDao = new ExpensesDaoImpl();
	}

    /**
     * Default constructor. 
     */
    public ExpensesBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String addExpenses(Expenses expenses) throws ClassNotFoundException, SQLException {
		return expensesDao.addExpensesDao(expenses);
	}

}
