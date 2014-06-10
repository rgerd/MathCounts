
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
	 * Returns a simplified version of the fraction.
	 * @return a simplified version of the fraction.
	 */
	public Fraction simplify() {
		int gcd = Utilities.GCD(num, den);
		return new Fraction(num / gcd, den / gcd);
	}
	
	/**
	 * Returns a string representation of the fraction.
	 */
	public String toString() {
		return "[" + num + "/" + den + "]";
	}
}
