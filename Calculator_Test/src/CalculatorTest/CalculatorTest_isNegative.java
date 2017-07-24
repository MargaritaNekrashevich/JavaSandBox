package CalculatorTest;

import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;

public class CalculatorTest_isNegative {

	@Test(groups = "checkValue")
	public void testIsNegative() {
		Calculator calculator = new Calculator();
		boolean isNegative = calculator.isNegative(-5);
		Assert.assertTrue(isNegative);
	}

}
