package com.java.bank.dao;

import java.sql.SQLException;

import com.java.bank.Accounts;

public interface BankDao {
	String createAccount(Accounts accounts) throws ClassNotFoundException, SQLException;
	Accounts searchAccount(int accountNo) throws ClassNotFoundException, SQLException;
	String depositAccount(int accountno, double depositAmount) throws ClassNotFoundException, SQLException;
	String withdrawAmount(int accountno, double withdrawAmount) throws ClassNotFoundException, SQLException;
}
