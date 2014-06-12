package com;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/* RADICAL, DUDE */
public class Root implements Number {
	private int factor;
	private int prime;
	private int degree;
	
	/**
	 * Simplifies a root to the nth degree.
	 * To simplify a cube root, use Root(512, 3);
	 * 
	 * @param num the number to root.
	 * @param degree the degree of the root.
	 */
	public Root(int num, int degree) {
		this.degree = degree;
		PrimeGenerator primes = new PrimeGenerator();
		HashMap<Integer, Integer> factors = new HashMap<Integer, Integer>();
		while(true) {
			int prime = primes.nextPrime();
			while(num % prime != 0) {
				prime = primes.nextPrime();
			}
			primes.reset();
			num /= prime;
			if(factors.containsKey(prime))
				factors.put(prime, factors.get(prime) + 1);
			else
				factors.put(prime, 1);
			if(num == 1)
				break;
		}
		this.prime = 1;
		factor = 1;
		Set<Entry<Integer, Integer>> f = factors.entrySet();
		for(Entry<Integer, Integer> fac : f) {
			int prime = fac.getKey();
			int occ = fac.getValue();
			int power = occ / degree;
			int pri = occ % degree;
			this.prime *= Math.pow(prime, pri);
			factor *= Math.pow(prime, power);
		}
	}
	
	private Root(int factor, int prime, int degree) {
		this(prime, degree);
		this.factor *= factor;
	}
	
	/**
	 * Returns the degree of the root.
	 * @return the degree of the root.
	 */
	public int getDegree(){
		return degree;
	}

	/**
	 * Returns the number in the radical, the y in xÃy.
	 * @return the number in the radical.
	 */
	public int getPrime() {
		return prime;
	}
	
	/**
	 * Returns the factor of the root, the x in xÃy.
	 * @return the factor of the root.
	 */
	public int getFactor() {
		return factor;
	}
	
	/**
	 * Returns the string representation of this radical.
	 * @return the string representation of this radical.
	 */
	public String toString() {
		return "[" + factor + " " + (degree > 2 ? degree : "") + "Ã" + prime + "]";
	}

	public Number add(Number n) {
		Root _n = (Root)n;
		return null;
	}

	public Number sub(Number n) {
		return null;
	}

	/**
	 * Divides this root with another.
	 * @return the result.
	 */
	public Number div(Number n) {
		Root _n = (Root) n;
		return null;
	}

	/**
	 * Multiplies this root with another.
	 * @return the result.
	 */
	public Number mult(Number n) {
		Root _n = (Root) n;
		int lcm = Utilities.LCM(this.degree, _n.degree);
		int mult_0 = lcm / degree;
		int mult_1 = lcm / _n.degree;
		int prime_0 = (int) Math.pow(this.prime, mult_0);
		int prime_1 = (int) Math.pow(_n.prime, mult_1);
		int _prime = prime_0 * prime_1;
		int _degree = lcm;
		int _factor = this.factor * _n.factor;
		return new Root(_factor, _prime, _degree);
	}
}
