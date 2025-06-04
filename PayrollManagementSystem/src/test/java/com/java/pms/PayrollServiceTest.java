package com.java.pms;

import static org.junit.Assert.*;
import org.junit.Test;

import com.java.pms.MyException.EmployeeNotFoundException;
import com.java.pms.dao.PayrollService;
import com.java.pms.model.Payroll;

import java.util.*;
import java.sql.Date;

public class PayrollServiceTest {

    @Test
    public void testProcessPayrollForMultipleEmployees() throws Exception {
        PayrollService payrollService = new PayrollService();

        List<Integer> empIds = Arrays.asList(101, 102, 103);

        for (int empId : empIds) {
            Payroll payroll = new Payroll();
            payroll.setEmpId(empId);
            payroll.setBasicSal(40000);
            payroll.setOverTimePay(3000);
            payroll.setDeductions(2000);
            payroll.setPayPeriodStartDate(new Date(System.currentTimeMillis()));
            payroll.setPayPeriodEndDate(new Date(System.currentTimeMillis()));

            String response = payrollService.generatePayroll(payroll);
            
            System.out.println("Response: " + response);

            assertNotNull("Payroll generation response should not be null", response);
            assertTrue("Response should contain success confirmation", response.toLowerCase().contains("successfully"));
        }
    }
    
}
