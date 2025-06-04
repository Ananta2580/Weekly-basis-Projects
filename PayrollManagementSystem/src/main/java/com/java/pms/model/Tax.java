package com.java.pms.model;

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
public class Tax {
	private int taxId;
	private int empId;
	private int taxYear;
	private double taxIncome;
	private double taxAmount;
}
