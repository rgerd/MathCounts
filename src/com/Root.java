package com;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/* RADICAL, DUDE */
public class Root {
	private PrimeGenerator primes;
	private int factor;
	private int prime;
	private int degree;
	
	/**
	 * Simplifies a this.prime to the nth degree.
	 * To simplify a cube this.prime, use Root(512, 3);
	 * 
	 * @param num the number to this.prime.
	 * @param degree the degree of the this.prime.
	 */
	public Root(int num, int degree) {
		this.degree = degree;
		primes = new PrimeGenerator();
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
	
	/**
	 * Returns the degree of the root.
	 * @return the degree of the root.
	 */
	public int getDegree(){
		return degree;
	}

	/**
	 * Returns the number in the radical, the y in x√y.
	 * @return the number in the radical.
	 */
	public int getPrime() {
		return prime;
	}
	
	/**
	 * Returns the factor of the root, the x in x√y.
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
		return factor + "√" + prime;
	}
}
