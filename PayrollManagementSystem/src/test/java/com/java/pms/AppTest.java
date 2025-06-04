package com.java.pms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//import com.java.pms.dao.PayrollService;
import com.java.pms.dao.TaxService;
import com.java.pms.model.Payroll;

public class AppTest {

  @Test
  public void testMain() {
    App.main(null);
  }
  
  @Test
  public void testCalculateGrossSalaryForEmployee() {
      Payroll payroll = new Payroll();
      payroll.setBasicSal(30000);
      payroll.setOverTimePay(5000);

      double expected = 35000;
      double actual = payroll.getBasicSal() + payroll.getOverTimePay();

      assertEquals(expected, actual,0.001);
  }
  
  @Test
  public void testCalculateNetSalaryAfterDeductions() {
      Payroll payroll = new Payroll();
      payroll.setBasicSal(40000);
      payroll.setOverTimePay(10000);
      payroll.setDeductions(8000);

      double gross = payroll.getBasicSal() + payroll.getOverTimePay();
      double expectedNet = 42000;
      double actualNet = gross - payroll.getDeductions();

      assertEquals(expectedNet, actualNet,0.001);
  }

  @Test
  public void testTaxCalculationForHighIncomeEmployee() {
      TaxService taxService = new TaxService();
      double income = 1500000;

      // Tax calculation based on slabs
      double expectedTax = (250000 * 0.05) + (500000 * 0.2) + (500000 * 0.3); // 12.5k + 1L + 1.5L = 2.625L

      double actualTax = taxService.calculateTaxFromSlab(income);

      assertEquals(expectedTax, actualTax, 0.001);
  }
  
}
