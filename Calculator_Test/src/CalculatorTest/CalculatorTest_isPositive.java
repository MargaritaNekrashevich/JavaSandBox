package CalculatorTest;

import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;

public class CalculatorTest_isPositive {
 
 @Test
  public void testIsPositive() {
	  Calculator calculator = new Calculator();
	  boolean isPositive = calculator.isPositive(7);
	  Assert.assertTrue(isPositive);
  }
  
}


