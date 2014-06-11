package com;

public class PrimeGenerator {
	private int[] primes;
	private int index;
	
	/**
	 * Creates a new prime number generator with an initial capacity of 100 prime numbers.
	 */
	public PrimeGenerator() {
		primes = new int[100];
		index = 0;
	}
	
	/**
	 * Creates a new prime number generator with a custom initial capacity for enhanced efficiency.
	 * @param cap the initial capacity.
	 */
	public PrimeGenerator(int cap) {
		primes = new int[cap];
		index = 0;
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
		if(prime == 2)
			prime = 3;
		boolean found = false;
		while(!found) {
			found = true;
			int sqrt = (int) Math.sqrt(prime);
			for (int i = 1; i < index; i++) {
				if(primes[i] >= sqrt) break;
				if(prime % primes[i] == 0 || prime == primes[i]) {
					found = false;
					prime += 2;
					break;
				}
			}
		}
		storePrime(prime);
		return prime;
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
