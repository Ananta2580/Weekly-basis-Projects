package com.java.pms;

import org.junit.Test;

import com.java.pms.MyException.EmployeeNotFoundException;
import com.java.pms.dao.PayrollService;
import com.java.pms.model.Payroll;

public class EmployeeNotFoundTest {
	
	@Test(expected = EmployeeNotFoundException.class)
    public void testGeneratePayrollWithInvalidEmployeeData() throws Exception {
        PayrollService payrollService = new PayrollService();

        Payroll invalidPayroll = new Payroll();
        invalidPayroll.setEmpId(-1);  // Invalid Employee ID
        invalidPayroll.setBasicSal(40000);
        invalidPayroll.setOverTimePay(3000);
        invalidPayroll.setDeductions(2000);
        
        System.out.println(invalidPayroll);

        // This should throw EmployeeNotFoundException
        payrollService.generatePayroll(invalidPayroll);
    }

}
