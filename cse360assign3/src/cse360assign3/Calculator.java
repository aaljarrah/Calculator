/** Description of Calculator
 *  This class has as names is a calculator than can
 *  sum, add, subtract, multiply and divide. It also
 *  can return the history of your calculations.
*
* @author Abdullah Aljarrah
* @pin 105
* @version Feb 21, 2016.
*/

package cse360assign3;

public class Calculator {
	
	private int total;
	private String history;
	
	/** Description of Calculator()
	 *  This is the constructor of class Calculator where it
	 *  initializes value total to 0.
	 *  */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/** Description of getTotal()
	 *	Returns the total variable.
	 *
	 *	@return total return global variable total. 
	 *  */
	
	public int getTotal () {
		return total;
	}
	
	/** Description of add(int value)
	 * 	Add the the param value to variable total
	 * 
	 * @param value The number added to total
	 *  */
	
	public void add (int value) {
		
		total += value;
		history += " + " + value;
		
	}
	
	/** Description of subtract(int value)
	 * 	Subtract the the param value to variable total
	 * 
	 * @param value The number subtracted to total
	 *  */
	
	public void subtract (int value) {
		
		total -= value;
		history += " - " + value;
		
	}
	
	/** Description of multiply(int value)
	 * 	Multiply the the param value to variable total
	 * 
	 * @param value The number multiplied to total
	 *  */
	
	public void multiply (int value) {
		
		total *= value;
		history += " * " + value;
		
	}
	
	/** Description of divide(int value) 
	 * 	Divide the the param value to variable total
	 * 
	 * @param value The number divided to total
	 *  */
	
	public void divide (int value) {
		
		if(value==0)
			total = 0;
		else
			total /= value;
		
		history += " / " + value;
		
	}
	
	/** Description of getHistory()
	 * 	Returns the history of all operations
	 * 
	 * @return returns the string history
	 *  */
	
	public String getHistory () {
		
		return history;
		
	}

}
