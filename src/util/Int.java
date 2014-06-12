package util;

public class Int implements Number {
	private int value;

	/**
	 * Creates a new integer with a value.
	 * 
	 * @param val
	 *            the value of the integer.
	 */
	public Int(int val) {
		value = val;
	}

	/**
	 * Adds another integer to this integer.
	 * 
	 * @return the result.
	 */
	public Number add(Number n) {
		Int _n = (Int) n;
		return new Int(_n.value + value);
	}

	/**
	 * Subtracts another integer from this integer.
	 * 
	 * @return the result.
	 */
	public Number sub(Number n) {
		Int _n = (Int) n;
		return new Int(value - _n.value);
	}

	/**
	 * Divides this integer with another integer.
	 * 
	 * @return the result.
	 */
	public Number div(Number n) {
		Int _n = (Int) n;
		return new Int(value / _n.value);
	}

	/**
	 * Multiplies this integer with another integer.
	 * 
	 * @return the result.
	 */
	public Number mult(Number n) {
		Int _n = (Int) n;
		return new Int(value * _n.value);
	}

	/**
	 * Returns the value of this integer.
	 * 
	 * @return the value of this integer.
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Returns a string representation of this integer.
	 */
	public String toString() {
		return Integer.toString(value);
	}

	
	/**
	 * Returns whether this int is equal to another.
	 * @return whether this int is equal to another.
	 */
	public boolean equals(Number other) {
		return value == ((Int) other).value;
	}
	
}
