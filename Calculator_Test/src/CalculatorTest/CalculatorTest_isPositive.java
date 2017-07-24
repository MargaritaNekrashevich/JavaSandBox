package CalculatorTest;

import org.testng.annotations.*;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;

public class CalculatorTest_isPositive {

	@Test(groups = "checkValue")
	public void testIsPositive() {
		Calculator calculator = new Calculator();
		boolean isPositive = calculator.isPositive(7);
		Assert.assertTrue(isPositive);
	}

}
