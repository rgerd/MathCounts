package CountingIsArithmetic.ChallengeProblems;

import java.util.ArrayList;
import java.util.HashSet;

import util.Factorial;
import util.Fraction;
import util.Int;
import util.Number;
import util.Util;

public class Context extends com.Context {
	private Number ans;
	private ArrayList<Number> list;
	private int chance;

	public Context() {
		list = new ArrayList<Number>();
	}

	public ArrayList<Number> getList() {
		return list;
	}

	public Number getAnswer() {
		return ans;
	}

	private void gen1() {
		/**
		 * Question format: How many positive integers less than (#1) can be
		 * written as the sum of 2 positive perfect squares?
		 **/
		HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int max = Util.getRandomNumberInRange(1, 200);
		int combos = 0;
		int upperLimit = (int) Math.sqrt((double) max);
		for(int i = 1; i < upperLimit; i++)
		{
			nums.add(i);
			for(int a = 0; a < nums.size(); a++)
			{
				hs.add(i+ (int)Math.pow(nums.get(a), 2.0));
			}
		}
		list.add(new Int(max));
		combos = hs.size();
		ans = (new Int(combos));




		int max = Util.getRandomNumberInRange(1, 200);
		int answer = 0;
		int uppersquare = (int) Math.sqrt((double) max);
		int middle = (int) Math.sqrt((max - 1) / 2);
		answer += (new Factorial(middle)).getValue();
		System.out.println("length: " + max + " combos: " + max + " divide: " + max);
		int leftovers = max - uppersquare;

		for (int i = 0; i < leftovers; i++) {
			int uppercombos = (uppersquare + i);
			answer+= (int) Math.sqrt(max - uppercombos);
		} 
		list.add(new Int(max));
		ans = (new Int(answer));
		
		
		
		
		
		
		
		
		
		
		int maximum = Util.getRandomNumberInRange(1, 200);
		int answe=0;
		ArrayList<Integer> AL = new ArrayList();
		int x=2;
		int squared=(int) Math.pow(x,  3);
		
		while(squared<maximum)
		{
			AL.add(squared);
			x++;
			squared = (int) Math.pow(x,  3);
		}
		ArrayList<Integer> an = new ArrayList();
		for(int a =0; a<AL.size(); a++)
		{
			for(int b=0; b<AL.size();b++)
			{
				if(an.contains(AL.get(a)+AL.get(b))||AL.get(a)+AL.get(b)>=maximum)
				{
					
				}
				else
				{
					an.add(AL.get(a)+AL.get(b));
				}
			}
		}
		Int ad = new Int(an.size());
		ans = ad;
		Int listaddd = new Int(maximum);
		list.add(listaddd);
		
		

	

	}

	private void gen2() {

	}

	private void gen3() {
		/**
		 * Type 03: Math with factorials What is the greatest common factor of
		 * (#1)!, (#2)!, and (#3)!? What is the units digit of 1! + 2! + 3! +4!
		 * + É +(#1)!? How many of the factorials from (#1)! to (#2)! are
		 * divisible by (#3)?
		 **/
		chance = Util.getRandomNumberInRange(1, 3);



		if(chance == 1)
		{
			int num1 = Util.getRandomNumberInRange(10, 100);
			int num2 = Util.getRandomNumberInRange(10, 100);
			int num3 = Util.getRandomNumberInRange(10, 100);

			list.add(new Factorial(num1));
			list.add(new Factorial(num2));
			list.add(new Factorial(num3));

			int min = Math.min(num1, Math.min(num2, num3));

			ans = new Factorial(min);
		} else if (chance == 2) {
			int end = Util.getRandomNumberInRange(10, 100);
			list.add(new Factorial(end));
			ans = new Int(3);

		} else if (chance == 3) {
			int num1 = Util.getRandomNumberInRange(1, 999);
			int num2 = Util.getRandomNumberInRange(2, 999);
			int divisor = Util.getRandomNumberInRange(2, 999);
			list.add(new Factorial(num1));
			list.add(new Factorial(num2));
			list.add(new Int(divisor));
			
			int a = Math.max(num1, num2);
			int b = Math.min(num1, num2);
			
			if(a-divisor < 0)
				ans = new Int(0);
			else if(divisor < b)
				ans = new Int(a-b);
			else
				ans = new Int(a-divisor);
		}

	}

	private void gen4() 
	{
		int answer = 0;

		int g = Util.getRandomNumberInRange(2, 100);
		int i = Util.getRandomNumberInRange(2, 100);
		list.add(new Int(g));
		list.add(new Int(i));
		for (int x = 0; x < g; x++) {
			for (int y = 0; y < i; y++) {
				if (y+1 % 2 == 1)
					answer++;
			}
		}
		ans = new Int(answer);
	}


	private void gen5() {
		int num_0 = Util.getRandomNumberInRange(1, 10);
		int den_0 = Util.getRandomNumberInRange(1, 10);

		int num_1 = Util.getRandomNumberInRange(1, 5);
		int den_1 = Util.getRandomNumberInRange(5, 10);

		Fraction frac_0 = new Fraction(num_0, den_0);
		Fraction frac_1 = (Fraction) new Fraction(num_1, den_1).add(frac_0);
		list.add(frac_0);
		list.add(frac_1);

		int top = (int) frac_1.reciprocal().divide();
		int bottom = (int) frac_0.reciprocal().divide();

		ans = new Int(Math.abs(top - bottom) + 1);
	}

	public int chance()
	{
		return chance;
	}
}
