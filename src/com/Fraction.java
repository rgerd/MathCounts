package com;

public class Fraction {
	private int num, den;
	
	/**
	 * Creates a new fraction with a numerator and a denominator.
	 * @param numerator the numerator.
	 * @param denominator the denominator.
	 */
	public Fraction(int numerator, int denominator) {
		num = numerator;
		den = denominator;
	}
	
	/**
	 * Returns the result when the fraction is divided.
	 * @return the result when the fraction is divided.
	 */
	public double divide() {
		return (double) num / (double) den;
	}
	
	/**
	 * Returns the result when this fraction is multiplied by another.
	 * @param other the other fraction.
	 * @return the result when this fraction is multiplied by another.
	 */
	public Fraction mult(Fraction other) {
		return new Fraction(num * other.num, den * other.den);
	}
	
	/**
	 * Returns the result when this fraction is divided by another.
	 * @param other the other fraction.
	 * @return the result when this fraction is divided by another.
	 */
	public Fraction div(Fraction other) {
		return mult(other.reciprocal());
	}
	
	/**
	 * Returns the result when the fraction is added to another.
	 * @param other the other fraction.
	 * @return the result when the fraction is added to another.
	 */
	public Fraction add(Fraction other) {
		int lcm = Utilities.LCM(den, other.den);
		int mult1 = lcm / den;
		int mult2 = lcm / other.den;
		return new Fraction(num * mult1 + other.num * mult2, lcm);
	}
	
	/**
	 * Returns the result when the fraction is subtracted from another.
	 * @param other the other fraction.
	 * @return the result when the fraction is subtracted from another.
	 */
	public Fraction sub(Fraction other) {
		int lcm = Utilities.LCM(den, other.den);
		int mult1 = lcm / den;
		int mult2 = lcm / other.den;
		return new Fraction(num * mult1 - other.num * mult2, lcm);
	}
	
	/**
	 * Returns the reciprocal of the function.
	 * @return the reciprocal of the function.
	 */
	public Fraction reciprocal() {
		return new Fraction(den, num);
	}
	
	/**
	 * Returns a simplified version of the fraction.
	 * @return a simplified version of the fraction.
	 */
	public Fraction simplify() {
		int gcd = Utilities.GCD(num, den);
		return new Fraction(num / gcd, den / gcd);
	}
	
	/**
	 * Returns a string representation of the fraction.
	 * @return a string representation of the fraction.
	 */
	public String toString() {
		return "[" + num + "/" + den + "]";
	}
	
	/**
	 * Returns the numerator of the fraction.
	 * @return the numerator of the fraction.
	 */
	public int getNumerator() {
		return num;
	}

	/**
	 * Returns the denominator of the fraction.
	 * @return the denominator of the fraction.
	 */
	public int getDenominator() {
		return den;
	}
	
	/**
	 * Returns whether this fraction equals another.
	 * @param other the other fraction.
	 * @return whether this fraction equals another.
	 */
	public boolean equals(Fraction other) {
		Fraction frac_0 = this.simplify();
		Fraction frac_1 = this.simplify();
		return (frac_0.num == frac_1.num) && (frac_0.den == frac_1.den);
	}
}
