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

	@Test
	public void testGetTotal() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}
