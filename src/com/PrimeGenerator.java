package com;

public class PrimeGenerator {
	private int[] primes;
	private int index;
	private int _cap;
	
	/**
	 * Creates a new prime number generator with an initial capacity of 100 prime numbers.
	 */
	public PrimeGenerator() {
		this(100);
	}
	
	/**
	 * Creates a new prime number generator with a custom initial capacity for enhanced efficiency.
	 * @param cap the initial capacity.
	 */
	public PrimeGenerator(int cap) {
		primes = new int[cap];
		index = 0;
		_cap = cap;
	}
	
	/**
	 * Generates the next ascending prime number.
	 * @return the next ascending prime number.
	 */
	public int nextPrime() {
		if(index == 0) {
			storePrime(2);
			return 2;
		}
		int prime = primes[index - 1];
		if(prime == 2) {
			storePrime(3);
			return 3;
		}
		boolean found = false;
		while(!found) {
			found = true;
			prime += 2;
			int sqrt = (int) Math.sqrt(prime);
			for (int i = 1; i < index; i++) {
				if(primes[i] > sqrt) break;
				if(prime % primes[i] == 0 || prime == primes[i]) {
					found = false;
					break;
				}
			}
		}
		storePrime(prime);
		return prime;
	}
	
	/**
	 * Resets the generator.
	 */
	public void reset() {
		index = 0;
		primes = new int[_cap];
	}
	
	/**
	 * Stores a prime number in the generator to maximize efficiency.
	 * @param prime the prime number to store.
	 */
	private void storePrime(int prime) {
		primes[index++] = prime;
		
		if(index == primes.length) {
			int[] _p = new int[primes.length * 2];
			for(int i = 0; i < primes.length; i++) {
				_p[i] = primes[i];
			}
			primes = _p;
		}
	}
}
