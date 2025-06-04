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
public class Payroll {
	private int payrollId;
	private int empId;
	private Date payPeriodStartDate;
	private Date payPeriodEndDate;
	private double basicSal;
	private double overTimePay;
	private double deductions;
	private double netSal;
}
