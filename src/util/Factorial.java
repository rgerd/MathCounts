package util;

public class Factorial implements Number {
	private Int num;

	public Factorial(int n) {
		num = new Int(n);
	}

	public Factorial(Int n) {
		num = n;
	}

	/**
	 * Adds an int to this factorial's number. For example: 5! + 7 = 13! This is
	 * for answer generation.
	 */
	public Number add(Number n) {
		if (!(n instanceof Int))
			return this;
		return new Factorial((Int) num.add(n));
	}

	/**
	 * Subtracts an int to this factorial's number. For example: 5! + 7 = 13!
	 * This is for answer generation.
	 */
	public Number sub(Number n) {
		if (!(n instanceof Int))
			return this;
		return new Factorial((Int) num.sub(n));
	}

	public Number mult(Number n) {
		return this;
	}

	public Number div(Number n) {
		return this;
	}

	/**
	 * Returns the value of the factorial. 5! => 120
	 * 
	 * @return the value of the factorial.
	 */
	public int getValue() {
		return Util.factorial(num.getValue());
	}

	/**
	 * Checks if the factorial is equal to the number. This works with
	 * everything except Root.
	 */
	public boolean equals(Number n) {
		if (n instanceof Int)
			return ((Int) n).getValue() == this.getValue();

		if (n instanceof Fraction)
			return (int) ((Fraction) n).divide() == this.getValue();

		if (!(n instanceof Factorial))
			return false;

		return ((Factorial) n).num == num;
	}

	public String toString() {
		return num.getValue() + "!";
	}
}
