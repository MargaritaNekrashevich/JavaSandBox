package CalculatorTest;

import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;

public class NewTest {
  @Test
  public void testSum() {
	  Calculator calculator = new Calculator();
	  long sum = calculator.sum(3, 5);
	  Assert.assertEquals(sum, 8);
  }
 @Test
  public void testIsPostive() {
	  Calculator calculator = new Calculator();
	  boolean isPositive = calculator.isPositive(7);
	  Assert.assertTrue(isPositive);
  }
 @Test
 public void testIsNegative() {
	  Calculator calculator = new Calculator();
	  boolean isNegative = calculator.isNegative(-5);
	  Assert.assertTrue(isNegative);
 }
  
}


