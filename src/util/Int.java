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
	 * Adds another integer or fraction to this integer.
	 * 
	 * @return the result.
	 */
	public Number add(Number n) {
		if (n instanceof Fraction) {
			Fraction f = (Fraction) n;
			return f.add(new Fraction(value, 1));
		}

		if (!(n instanceof Int))
			return this;

		Int _n = (Int) n;
		return new Int(_n.value + value);
	}

	/**
	 * Subtracts another integer from this integer.
	 * 
	 * @return the result.
	 */
	public Number sub(Number n) {
		if (n instanceof Fraction) {
			Fraction f = (Fraction) n;
			return new Fraction(value, 1).sub(f);
		}

		if (!(n instanceof Int))
			return this;

		Int _n = (Int) n;
		return new Int(value - _n.value);
	}

	/**
	 * Divides this integer with another integer.
	 * 
	 * @return the result.
	 */
	public Number div(Number n) {
		if (n instanceof Fraction) {
			Fraction f = (Fraction) n;
			return new Fraction(value, 1).div(f);
		}

		if (!(n instanceof Int))
			return this;

		Int _n = (Int) n;
		return new Int(value / _n.value);
	}

	/**
	 * Multiplies this integer with another integer.
	 * 
	 * @return the result.
	 */
	public Number mult(Number n) {
		if (n instanceof Fraction) {
			Fraction f = (Fraction) n;
			return f.mult(new Fraction(value, 1));
		}

		if (!(n instanceof Int))
			return this;

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
	 * Returns whether this int is equal to another int or fraction.
	 * 
	 * @return whether this int is equal to another int or fraction.
	 */
	public boolean equals(Number other) {
		if (other instanceof Fraction)
			return ((Fraction) other).equals(new Fraction(value, 1));

		if (!(other instanceof Int))
			return false;

		return value == ((Int) other).value;
	}

}
