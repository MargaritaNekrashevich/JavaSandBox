package CalculatorTest;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.DataProvider;
import org.testng.annotations.*;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;

public class CalculatorTest_Sum {

	@BeforeSuite
	public void Preconditions() {
		System.out.println("Calculator Tests - sum: Starting Preconditions ");
	}

	@Test(groups = "simpleMathOperations", dataProvider = "sumDataProvider")
	@Parameters({ "a", "b", "expected" })
	public void testSum(long a, long b, long expected) {
		Calculator calculator = new Calculator();
		long sum = calculator.sum(a, b);
		Assert.assertEquals(sum, expected);
	}

	@DataProvider(name = "sumDataProvider", parallel = true)
	public Object[][] sumDataProvider() {
		return new Object[][] { { 7, 1, 8 }, { -7, -1, -8 }, { 0, 0, 0 }, { -7, 8, 1 }, { 1000000, 999999, 1999999 } };
	}

	@AfterSuite
	public void Postconditions() {
		System.out.println("Calculator Tests - sum: Executing Postconditions");
	}

}
