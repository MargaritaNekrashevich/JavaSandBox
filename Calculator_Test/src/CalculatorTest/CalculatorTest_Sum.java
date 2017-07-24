package CalculatorTest;

import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;

public class CalculatorTest_Sum {
  @Test
  public void testSum() {
	  Calculator calculator = new Calculator();
	  long sum = calculator.sum(3, 5);
	  Assert.assertEquals(sum, 8);
  }
}


