package com.java.pms.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FinancialRecord {
	private int recordId;
	private int empId;
	private Date recordDate;
	private String desc;
	private double amount;
	private String recordType;
}
