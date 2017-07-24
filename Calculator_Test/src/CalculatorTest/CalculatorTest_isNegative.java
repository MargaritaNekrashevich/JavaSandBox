package CalculatorTest;

import org.testng.annotations.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;

public class CalculatorTest_isNegative {

	@Test(groups = "checkValue", dataProvider = "valueDataProvider")
	@Parameters ("x")
	public void testIsNegative(long y) {
		Calculator calculator = new Calculator();
		boolean isNegative = calculator.isNegative(y);
		Assert.assertTrue(isNegative);
	}

	@DataProvider(name = "valueDataProvider", parallel = true)
	public Object[][] sumDataProvider() {
		return new Object[][] { { 7 }, { -7 }, { 0}, { -9999999 }, { 9999999 } };
	}

}
