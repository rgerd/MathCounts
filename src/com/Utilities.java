package com;
import java.util.Random;

public class Utilities {
	/* Random is more random than Math.random() */
	private static Random rand = new Random();

	public Utilities() {

	}

	/**
	 * Returns a random integer between two numbers (inclusive). 
	 * @param min The minimum number.
	 * @param max The maximum number.
	 * @return A random integer between two numbers.
	 */
	public static int getRandomNumberInRange(int min, int max) {
		return rand.nextInt(max + 1) + min;
	}
	
	/**
	 * Returns the greatest common denominator between two numbers.
	 * Uses Euclid's algorithm. 
	 * @param a the first number.
	 * @param b the second number.
	 * @return the greatest common denominator.
	 */
	public static int GCD(int a, int b) {
		if(b == 0)
			return a;
		return GCD(b, a % b);
	}
}
