import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.*;

import Calci.Calculator;

public class CalciTest {
	@Test
	public void caladdtest() {
	assertsEquals(40 ,  Calculator.add(20, 20));
	}
	private void assertsEquals(int i, double d) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void caltestsub() {
		assertsEquals(10, Calculator.sub(20, 10));
	}
	@Test
	public void caltestmul() {
		assertsEquals(9, Calculator.mul(3, 3));
	}
	@Test
	public void caltestdiv() {
		assertsEquals(10, Calculator.div(40, 10));
	}

}
