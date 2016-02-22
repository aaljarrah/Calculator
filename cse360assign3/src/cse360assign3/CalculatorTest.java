package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		
		Calculator calc = new Calculator();
		
		assertNotNull(calc);
		
	}

	@Test
	public void testGetTotal() {
		
		Calculator calc = new Calculator();
		
		assertEquals(0, calc.getTotal());
		
	}

	@Test
	public void testAdd() {
		
		Calculator calc = new Calculator();
		
		calc.add(2);
		
		assertEquals(2, calc.getTotal());
		
	}

	@Test
	public void testSubtract() {
		
		Calculator calc = new Calculator();
		
		calc.add(3);
		calc.subtract(2);
		
		assertEquals(1, calc.getTotal());
		
	}

	@Test
	public void testMultiply() {
		
		Calculator calc = new Calculator();
		
		calc.add(3);
		calc.multiply(2);
		
		assertEquals(6, calc.getTotal());
		
	}

	@Test
	public void testDivide() {
		
		Calculator calc = new Calculator();
		
		calc.add(6);
		calc.divide(2);
		
		assertEquals(3, calc.getTotal());
		
	}
	
	@Test
	public void testDivideByZero() {
		
		Calculator calc = new Calculator();
		
		calc.add(6);
		calc.divide(0);
		
		assertEquals(0, calc.getTotal());
		
	}

	@Test
	public void testGetHistory() {
		
		Calculator calc = new Calculator();
		
		calc.add(4);
		calc.subtract(2);
		calc.multiply(2);
		calc.add(5);
		calc.divide(1);
		calc.divide(0);
		
		assertEquals("0 + 4 - 2 * 2 + 5 / 1 / 0", calc.getHistory());
		
	}

}
