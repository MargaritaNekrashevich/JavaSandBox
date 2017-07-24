package CalculatorTest;

import org.testng.annotations.*;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;

public class CalculatorTest_isPositive {

	@Test(groups = "checkValue", dataProvider = "valueDataProvider")
	@Parameters ("x")
	public void testIsPositive(long x) {
		Calculator calculator = new Calculator();
		boolean isPositive = calculator.isPositive(x);
		Assert.assertTrue(isPositive);
	}

	@DataProvider(name = "valueDataProvider", parallel = true)
	public Object[][] sumDataProvider() {
		return new Object[][] { { 7 }, { -7 }, { 0}, { -9999999 }, { 9999999 } };
	}
		
}
