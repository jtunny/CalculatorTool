package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Description:
 * Testing Environment for assign3. This is a J-Unit test class to test a Calculator object.
 * Eclipse provides a great testing environment where we can use built in functions to test functionality
 * of an object using assertions.  Each test method tests a certain aspect of the object Calculator using assertion
 * methods and the return values of Calculator object methods.
 * 
 * @author James Tunny ( jtunny@asu.edu ), PIN: 824
 * 
 */

public class CalculatorTest {

	/*
	 * A test to make sure that a Calculator object is actually
	 * being created.
	 * 
	 * 1) Test that the Calculator constructor does not return NULL.
	 * 
	 */
	
	@Test
	public void testCalculator() {
		
		Calculator calc = new Calculator();   	// Create a Calculator object to test if it is null or not
		
		assertNotNull(calc);					// Use an assertion to test that calc is not null
	}

	/*
	 * A test to make sure getTotal() returns the correct total.
	 * 
	 * 1) Create a calculator object.
	 * 2) Perform some operations(add, subtract).
	 * 3) Check the return value of getTotal() with an assertion.
	 */
	
	@Test
	public void testGetTotal() {
		
		Calculator calc = new Calculator();
		
		calc.add(7);
		
		assertEquals(7, calc.getTotal());
		
		calc.subtract(5);
		
		assertEquals(2, calc.getTotal());
		
	}

	/*
	 * A test to make sure add() is working correctly.
	 * 
	 * 1) Create a calculator object.
	 * 2) Perform additions with a positive value.
	 * 3) Check the total.
	 * 4) Perform additions with negative values.
	 * 5) Check the total.
	 */
	
	@Test
	public void testAdd() {
		
		Calculator calc = new Calculator();
		
		calc.add(7);
		calc.add(3);
		
		assertEquals(10, calc.getTotal());
		
		calc.add(-3);
		calc.add(-9);
		
		assertEquals(-2, calc.getTotal());
		
	}

	/*
	 * A test to make sure subtract is working properly.
	 * 
	 * 1) Create a calculator object.
	 * 2) Perform addition with positive value.
	 * 3) Perform subtractions with a positive value.
	 * 4) Check the total.
	 * 5) Perform subtractions with negative values.
	 * 6) Check the total. 
	 * 7) Perform a subtraction to make the total negative.
	 * 8) Check the total.
	 */
	
	@Test
	public void testSubtract() {
		
		Calculator calc = new Calculator();
		
		calc.add(40);
		
		calc.subtract(4);
		calc.subtract(5);
		
		assertEquals(31, calc.getTotal());
		
		calc.subtract(-3);
		calc.subtract(-6);
		
		assertEquals(40, calc.getTotal());
		
		calc.subtract(20);
		calc.subtract(25);
		
		assertEquals(-5, calc.getTotal());
	}

	/*
	 * A test to make sure multiply() is working properly
	 * 
	 * 1) Create a Calculator object.
	 * 2) Perform multiplication(should be 0 since the total will be 0 to begin with).
	 * 3) Check to make sure total is 0.
	 * 4) Perform addition so we can multiply by a number other than 0.
	 * 5) Perform multiplication with positive value.
	 * 6) Check the total.
	 * 7) Perform multiplication with a negative value.
	 * 8) Check that total is now negative.
	 * 9) Perform multiplication with two negative numbers.
	 * 10) Make sure total is positive.
	 */
	
	@Test
	public void testMultiply() {
		
		Calculator calc = new Calculator();
		
		calc.multiply(5);
		
		assertEquals(0, calc.getTotal());
		
		calc.add(6);
		
		calc.multiply(4);
		 
		assertEquals(24, calc.getTotal());
		
		calc.multiply(-2);
		
		assertEquals(-48, calc.getTotal());
		
		calc.multiply(-2);
		
		assertEquals(96, calc.getTotal());
		
	}

	/*
	 * A test to check that divide is working properly.
	 * 
	 * 1) Create a Calculator object.
	 * 2) Perform division(should be 0 since the total will be 0 to begin with).
	 * 3) Check to make sure total is 0.
	 * 4) Perform addition so we can divide by a number other than 0.
	 * 5) Perform division with positive value.
	 * 6) Check the total.
	 * 7) Perform division with a negative value.
	 * 8) Check that total is now negative.
	 * 9) Perform division by 0.
	 * 10) Make sure total resets to zero.
	 * 11) Divide two negative values.
	 * 12) Make sure total is positive. 
	 */
	
	@Test
	public void testDivide() {
		
		Calculator calc = new Calculator();
		
		calc.divide(2);
		
		assertEquals(0, calc.getTotal());
		
		calc.add(56);
		
		calc.divide(7);
		
		assertEquals(8, calc.getTotal());
		
		calc.divide(-2);
		
		assertEquals(-4, calc.getTotal());
		
		calc.divide(0);
		
		assertEquals(0, calc.getTotal());
		
		// At this point total is 0. So subtract 4 before dividing by another negative number.
		calc.subtract(4);
		
		calc.divide(-2);
		
		assertEquals(2, calc.getTotal());
		
	}

	/*
	 * A test to make sure the getHistory() method is working properly.
	 * 
	 * 1) 	Perform some operations and verify that the string
	 * 		returned by getHistory() reflects the operations
	 * 		we performed.
	 */
	
	@Test
	public void testGetHistory() {
		
		Calculator calc = new Calculator();
		
		calc.add(7);
		
		assertEquals("0 + 7", calc.getHistory());
		
		calc.subtract(2);
		calc.multiply(2);
		calc.divide(5);
		calc.add(22);
		calc.add(-12);
		
		assertEquals("0 + 7 - 2 * 2 / 5 + 22 + -12", calc.getHistory());
		
	}

}
