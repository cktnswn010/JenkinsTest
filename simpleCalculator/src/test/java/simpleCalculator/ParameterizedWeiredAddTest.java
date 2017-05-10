package simpleCalculator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedWeiredAddTest {
	
	private int expected;
	private int val1;
	private int val2;

	@Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][]{
			{100,5,7},
			{105,5,100},
			{107,100,7}
		});
	}//2차원 배열 -> 리스트로 변환, {expected, val1, val2}
	
	public ParameterizedWeiredAddTest(int e, int v1, int v2){
		val1=v1;
		val2=v2;
		expected=e;
	}
	
	@Test
	public void weiredAddWithParameters(){
		SimpleCalculator calc = new SimpleCalculator();
		calc.weiredAdd(val1, val2);
		assertEquals(expected,calc.getResult());
	}

}
