package util;

public class Fraction implements Number {
	private int num, den;

	/**
	 * Creates a new fraction with a numerator and a denominator.
	 * 
	 * @param numerator
	 *            the numerator.
	 * @param denominator
	 *            the denominator.
	 */
	public Fraction(int numerator, int denominator) {
		num = numerator;
		den = denominator;
		this_simplify();

		if (denominator == 0) {
			System.err.println("FRACTIONS SHOULD NOT HAVE DENOMINATORS OF ZERO.");
			System.err.printf("This is the fraction you attempted to create: (%i / %i)", num, den);
			System.exit(-1);
		}
	}

	/**
	 * Returns the result when the fraction is divided.
	 * 
	 * @return the result when the fraction is divided.
	 */
	public double divide() {
		return (double) num / (double) den;
	}

	/**
	 * Returns the result when this fraction is multiplied by another. If the
	 * number provided is not a fraction, this fraction will be returned
	 * unchanged.
	 * 
	 * @param other
	 *            the other fraction.
	 * @return the result when this fraction is multiplied by another.
	 */
	public Number mult(Number other) {
		if (other instanceof Int)
			return new Fraction(num * ((Int) other).getValue(), den);

		if (!(other instanceof Fraction))
			return this;
		Fraction _other = (Fraction) other;
		return new Fraction(num * _other.num, den * _other.den);
	}

	/**
	 * Returns the result when this fraction is divided by another. If the
	 * number provided is not a fraction, this fraction will be returned
	 * unchanged.
	 * 
	 * @param other
	 *            the other fraction.
	 * @return the result when this fraction is divided by another.
	 */
	public Number div(Number other) {
		if (other instanceof Int)
			return new Fraction(num, den * ((Int) other).getValue());
		
		if (!(other instanceof Fraction))
			return this;
		return mult(((Fraction) other).reciprocal());
	}

	/**
	 * Returns the result when the fraction is added to another. If the number
	 * provided is not a fraction, this fraction will be returned unchanged.
	 * 
	 * @param other
	 *            the other fraction.
	 * @return the result when the fraction is added to another.
	 */
	public Number add(Number other) {
		if (other instanceof Int)
			return new Fraction(num + ((Int) other).getValue() * den, den);
		
		if (!(other instanceof Fraction))
			return this;
		Fraction _other = (Fraction) other;
		int lcm = Util.LCM(den, _other.den);
		int mult1 = lcm / den;
		int mult2 = lcm / _other.den;
		return new Fraction(num * mult1 + _other.num * mult2, lcm);
	}

	/**
	 * Returns the result when the fraction is subtracted from another. If the
	 * number provided is not a fraction, this fraction will be returned
	 * unchanged.
	 * 
	 * @param other
	 *            the other fraction.
	 * @return the result when the fraction is subtracted from another.
	 */
	public Number sub(Number other) {
		if (other instanceof Int)
			return new Fraction(num - ((Int) other).getValue() * den, den);
		
		if (!(other instanceof Fraction))
			return this;
		Fraction _other = (Fraction) other;
		int lcm = Util.LCM(den, _other.den);
		int mult1 = lcm / den;
		int mult2 = lcm / _other.den;
		return new Fraction(num * mult1 - _other.num * mult2, lcm);
	}

	/**
	 * Returns the reciprocal of the function.
	 * 
	 * @return the reciprocal of the function.
	 */
	public Fraction reciprocal() {
		return new Fraction(den, num);
	}
	
	/**
	 * Returns a simplified version of the fraction.
	 * 
	 * @return a simplified version of the fraction.
	 */
	/*
	public Fraction simplify() {
		int gcd = Util.GCD(num, den);
		if (den < 1) {
			num *= -1;
			den *= -1;
		}
		return new Fraction(num / gcd, den / gcd);
	}
	*/
	
	private void this_simplify() {
		int gcd = Util.GCD(num, den);
		if (den < 1) {
			num *= -1;
			den *= -1;
		}
		
		num /= gcd;
		den /= gcd;
	}

	/**
	 * Returns a string representation of the fraction.
	 * 
	 * @return a string representation of the fraction.
	 */
	public String toString() {
		if (den == 1)
			return Integer.toString(num);
		return num + "/" + den;
	}

	/**
	 * Returns the numerator of the fraction.
	 * 
	 * @return the numerator of the fraction.
	 */
	public int getNumerator() {
		return num;
	}

	/**
	 * Returns the denominator of the fraction.
	 * 
	 * @return the denominator of the fraction.
	 */
	public int getDenominator() {
		return den;
	}

	/**
	 * Returns whether this fraction equals another.
	 * 
	 * @param other
	 *            the other fraction.
	 * @return whether this fraction equals another.
	 */
	public boolean equals(Number other) {
		if (other instanceof Int)
			return (int) (num / den) == ((Int) other).getValue();
		else if (!(other instanceof Fraction))
			return false;

		Fraction _other = (Fraction) other;
		return (num == _other.num) && (den == _other.den);
	}

}
