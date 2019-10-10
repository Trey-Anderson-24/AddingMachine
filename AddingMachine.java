package cse360assign2;

/*
 * Takes the input and can either add or subtract it from the total while the 
 * toString prints out the inputs and whether it is a addition or subtraction
 */
public class AddingMachine {

	private int total;
	private String endString = "0";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/*
	 * returns the total running value
	 */
	public int getTotal () {
		return total;
	}
	
	/*
	 * @parm takes in a input value
	 * adds the input value to total to kepp a running total
	 */
	public void add (int value) {
		total = total + value;
		endString = endString + " + " + value;
	}
	
	/*
	 * @parm takes a input value
	 * subtracts the value from the running total
	 */
	public void subtract (int value) {
		total = total - value;
		endString = endString + " - " + value;
	}
	
		/*
		 * returns the inputs and whether they were added or subtracted
		 */
	public String toString () {
		return endString;
	}
	
	/*
	 * method clear returns the total to 0 and makes the endString to 0
	 */
	public void clear() {
	endString  = "0";
	total = 0;
	}
}
