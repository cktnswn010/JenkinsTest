package simpleCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeiredAddTest {

	@Test
	public void weiredAddWithFiveAndSeven() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.weiredAdd(5, 7);
		assertEquals(100,calc.getResult());
	}
	
	@Test
	public void weiredAddWithFiveAndNotSeven() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.weiredAdd(5, 100);
		assertEquals(105,calc.getResult());
	}

	@Test
	public void weiredAddWithNotFiveAndSeven() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.weiredAdd(100, 7);
		assertEquals(107,calc.getResult());
	}
}
