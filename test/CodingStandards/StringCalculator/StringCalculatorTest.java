package CodingStandards.StringCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testAddNumbers() {
		StringCalculator tester = new StringCalculator();
		assertEquals("10 + 5 must be 15", 15, tester.addNumbers(10, 5));
	}

	@Test
	public void testSubtractNumbers() {
		StringCalculator tester = new StringCalculator();
		assertEquals("200 - 100 must be 100", 100, tester.subtractNumbers(200, 100));
	}

	@Test
	public void testMulitplyNumbers() {
		StringCalculator tester = new StringCalculator();
		assertEquals("10 x 5 must be 50", 50, tester.mulitplyNumbers(10, 5));
	}

	@Test
	public void testDivideNumbers() {
		StringCalculator tester = new StringCalculator();
		assertEquals("10 / 5 must be 2", 2, tester.divideNumbers(10, 5));
	}

}
