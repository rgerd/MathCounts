package com;

public class NumberFraction {
	private Number num, den;

	/**
	 * Creates a new fraction with a numerator and a denominator.
	 * 
	 * @param numerator
	 *            the numerator.
	 * @param denominator
	 *            the denominator.
	 */
	public NumberFraction(Number numerator, Number denominator) {
		num = numerator;
		den = denominator;
	}

	/**
	 * Returns the result when this fraction is multiplied by another.
	 * 
	 * @param other
	 *            the other fraction.
	 * @return the result when this fraction is multiplied by another.
	 */
	public NumberFraction mult(NumberFraction other) {
		return new NumberFraction(num.mult(other.num), den.mult(other.den));
	}

	/**
	 * Returns the result when this fraction is divided by another.
	 * 
	 * @param other
	 *            the other fraction.
	 * @return the result when this fraction is divided by another.
	 */
	public NumberFraction div(NumberFraction other) {
		return mult(other.reciprocal());
	}

	/**
	 * Returns the reciprocal of the function.
	 * 
	 * @return the reciprocal of the function.
	 */
	public NumberFraction reciprocal() {
		return new NumberFraction(den, num);
	}

	/**
	 * Returns a string representation of the fraction.
	 * 
	 * @return a string representation of the fraction.
	 */
	public String toString() {
		/*
		Fraction simp = this.simplify();
		if (simp.den == 1)
			return Integer.toString(simp.num);
		return num + "/" + den;
		*/
		return null;
	}

	/**
	 * Returns the numerator of the fraction.
	 * 
	 * @return the numerator of the fraction.
	 */
	public Number getNumerator() {
		return num;
	}

	/**
	 * Returns the denominator of the fraction.
	 * 
	 * @return the denominator of the fraction.
	 */
	public Number getDenominator() {
		return den;
	}

	/**
	 * Returns whether this fraction equals another.
	 * 
	 * @param other
	 *            the other fraction.
	 * @return whether this fraction equals another.
	 */
	public boolean equals(Fraction other) {
		return true;
		/*
		Fraction frac_0 = this.simplify();
		Fraction frac_1 = this.simplify();
		return (frac_0.num == frac_1.num) && (frac_0.den == frac_1.den);
		*/
	}
}
