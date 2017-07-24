package CalculatorTest;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import com.epam.tat.module4.Calculator;
import org.junit.Test;

public class CalculatorTest_Div {

	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		double div = calculator.div(10, 5);
		assertEquals(2, div, 0);

	}

}
