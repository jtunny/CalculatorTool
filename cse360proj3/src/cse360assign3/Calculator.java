package cse360assign3;

/**
 * Description:
 * This class provides a Calculator object that keeps track of what operations were performed
 * on a running total that reflects all the operations performed.  The initial value of the 
 * total is, consequently, zero.  The operations that can be performed are basic; add, subtract,
 * multiply, and divide.  A function is provided to view the history of operations performed on
 * the total.
 * 
 * @author James Tunny ( jtunny@asu.edu ), PIN: 824
 *
 */

public class Calculator {

	private int total;							// The running total. All performed operations operate on this variable.
	
	/**
	 * Construct a Calculator object and initialize total to 0.
	 */
	
	public Calculator () {
		total = 0;  							// Initially, total is 0	
	}
	
	/**
	 * getTotal is an accessor function to retrieve the current running total.
	 * 
	 * @return total - Simply return the running total.
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * add takes the parameter, value, and adds it to the running total
	 * 
	 * @param value - value to add to total
	 */
	
	public void add (int value) {
		total += value;
	}
	
	/**
	 * subtract takes the parameter, value, and subtracts it from the
	 * running total.
	 * 
	 * @param value - value to subtract from total
	 */
	
	public void subtract (int value) {
		total -= value;
	}
	
	/**
	 * multiply will multiply the running total by the given parameter, value.
	 * 
	 * @param value - value to multiply total by
	 */
	
	public void multiply (int value) {
		total *= value;
	}
	
	/**
	 * divide will divide the running total by the given parameter, value.
	 * This will be integer division.
	 * If 0 is given as the parameter, the total will be reset to 0.
	 * 
	 * @param value - value to divide total by
	 */
	
	public void divide (int value) {
		total = value == 0 ? 0 : total / value;
	}
	
	/**
	 * getHistory is a function to return a string of all the operations
	 * that have been performed on total. It also displays what the values
	 * used with those operations were.
	 * 
	 * @return - a string of the values and operations performed on total
	 */
	
	public String getHistory () {
		return "";
	}
	
}
