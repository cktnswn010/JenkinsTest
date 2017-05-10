package simpleCalculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleCalculatorTest {
	
	SimpleCalculator calc;
	
	@Before
	public void setUp(){
		System.out.print("Before ");
		calc = new SimpleCalculator();
	}

	
	@After
	public void tearDown(){
		System.out.println(" After");
	}
	
	@BeforeClass
	public static void setUpClass(){
		System.out.println("Before class ");
		SimpleCalculator calc = new SimpleCalculator();
	}
	@AfterClass
	public static void tearDownClass(){
		System.out.println(" After class ");
	}
	@Test
	public void addWithPositive() {
		System.out.print("<add with Positives>");
		calc.add(10, 20);
		assertEquals(30,calc.getResult());
		//a==b면넘어가고 a!=b면 exception을 JUnit Framework에게 알려줌.
		//expected Result(내가 원하는 결과), actual Result(실제 실행결과)
	}
	
	@Test
	public void addWithZero() {
		System.out.print("<add with Zero>");
		calc.add(0, 0);
		assertEquals(0,calc.getResult());
	}
	
	@Test
	public void addWithPositiveArgsWithPositives(){
		calc.addWithPositiveArgs(10, 20);
		assertEquals(30, calc.getResult());
	}
	
	@Test(expected=InvalidArgumentException.class)
	public void addWithPositiveArgsWithOnNegative(){
		calc.addWithPositiveArgs(-10, 20);
	}
	
	@Test
	public void subWithPositive() {
		calc.sub(10, 20);
		assertEquals(-10,calc.getResult());
	}
	@Test
	public void subWithZero() {
		calc.sub(0, 0);
		assertEquals(0,calc.getResult());
	}
	
	@Test
	public void incWithPositive() {
		calc.inc(10);
		assertEquals(10,calc.getResult());
	}

	@Test
	public void decWithPositive() {
		calc.dec(10);
		assertEquals(-10,calc.getResult());
	}
	
	@Test
	public void incWithZero() {
		calc.inc(0);
		assertEquals(0,calc.getResult());
	}

	@Test
	public void decWithZero() {
		calc.dec(0);
		assertEquals(0,calc.getResult());
	}
	
	@Test
	public void divWithPositive() {
		calc.div(20, 2);
		assertEquals(10,calc.getResult());
	}
	
}
