package util;

import java.util.Random;

public class Util {
	/* Random is more random than Math.random() */
	private static Random rand = new Random();

	/**
	 * Returns a random integer between two numbers (inclusive).
	 * 
	 * @param min
	 *            The minimum number.
	 * @param max
	 *            The maximum number.
	 * @return A random integer between two numbers.
	 */
	public static int getRandomNumberInRange(int min, int max) {
		return min + (int) (rand.nextDouble() * ((max - min) + 1));
	}

	/**
	 * Returns the greatest common denominator between two numbers. Uses
	 * Euclid's algorithm.
	 * 
	 * @param a
	 *            the first number.
	 * @param b
	 *            the second number.
	 * @return the greatest common denominator.
	 */
	public static int GCD(int a, int b) {
		if (b == 0)
			return a;
		return GCD(b, a % b);
	}

	/**
	 * Returns the least common multiple from a list of integers, typically two.
	 * To call the method, list any number of arguments. For example: LCM(4, 5,
	 * 6, 8) or just LCM(4, 5)
	 * 
	 * @param nums
	 *            the numbers to use to find the LCM
	 * @return the least common multiple from a list of integers.
	 */
	public static int LCM(int... nums) {
		if (nums.length == 1)
			return nums[0];
		int[] _nums = nums.clone();
		int answer = 0;
		boolean done = false;
		while (!done) {
			done = true;
			int least = nums[0];
			int least_index = 0;
			for (int i = 1; i < nums.length; i++) {
				if(nums[i] == 0)
					return 0;
				if (nums[i] != nums[0])
					done = false;
				if (nums[i] < least) {
					least_index = i;
					least = nums[i];
				}
			}
			if (!done)
				nums[least_index] += _nums[least_index];
			answer = least;
		}
		return answer;
	}
	
	/**
	 * Returns the factorial of a number; n!
	 * A classic recursion problem.
	 * 
	 * @param n the number.
	 * @return the number's factorial.
	 */
	public static int factorial(int n) {
		if(n == 1 || n==0)
			return 1;
		return n * factorial(n - 1);
	}
	
	public static int perm(int n, int k)
	{
		int top = n;
		int bottom = n-k;
		
		return factorial(top)/factorial(bottom);
	}
	
	public static int combo(int n,int r) {
	int top=n;
	int bot=r;
	int j=factorial(top);

	int b=factorial(bot)*factorial(top-bot);
	
<<<<<<< HEAD
	int ans = j/b;
	return ans;
=======
	
	j/=b;
	return j;
>>>>>>> FETCH_HEAD
	
	}
	
	
	public static boolean isSquare(int n)
	{
	int k=1;
	while (n!=0)
	{
	if (n<0)
	{
		
	return false;
	}

	else
	{
	n=n-k;
	k+=2;
	}
	}

	return true;
	}
}
