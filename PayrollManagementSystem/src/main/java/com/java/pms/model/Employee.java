package com.java.pms.model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

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
public class Employee {
	
	private int empId;
	private String fName;
	private String lName;
	private Date DOB;
	private String gender;
	private String email;
	private long mobNo;
	private String address;
	private String position;
	private Date joinDate;
	private Date terminationDate;
	
	public int calculateAge() {
		if(DOB == null) {
			return 0;
		}
		LocalDate dob = DOB.toLocalDate();
		LocalDate current = LocalDate.now();
		return Period.between(dob, current).getYears();
	}

}
