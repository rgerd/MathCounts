package CountingIsArithmetic.ChallengeProblems;

import java.util.ArrayList;

import util.Fraction;
import util.Int;
import util.Utilities;
import util.Number;

public class Context extends com.Context {
	private int ans;
	private ArrayList<Number> list;
	private int chance;

	public Context() {
		list = new ArrayList<Number>();
	}

	public ArrayList<Number> getList() {
		return list;
	}

	public int getAns() {
		return ans;
	}

	private void gen1()
	{
		/**Question format: How many positive integers less than (#1) can be written as the
		sum of (#2) positive perfect squares? **/
		int length = Utilities.getRandomNumberInRange(10,1000);
		int numSquares = Utilities.getRandomNumberInRange(2,8);
		
		
		
		
		
		
		
	}

	private void gen2() {

	}

	private void gen3()
	{
		/**Type 03: Math with factorials
		What is the greatest common factor of (#1)!, (#2)!, and (#3)!?
		What is the units digit of 1! + 2! + 3! +4! + É +(#1)!?
		How many of the factorials from (#1)! to (#2)! are divisible by (#3)?
		 **/
		chance = Utilities.getRandomNumberInRange(1, 3);
		if(chance == 1)
		{
			int num1 = Utilities.getRandomNumberInRange(10, 100);
			int num2 = Utilities.getRandomNumberInRange(10, 100);
			int num3 = Utilities.getRandomNumberInRange(10, 100);
			
			list.add(new Int(num1));
			list.add(new Int(num2));
			list.add(new Int(num3));
			
			
		} else if(chance == 2)
		{
			
		} else if(chance == 3)
		{
			
		}
		
	}

	private void gen4() {

	}

	private void gen5() {

		int num_0 = Utilities.getRandomNumberInRange(0, 1000);
		int den_0 = Utilities.getRandomNumberInRange(0, 1000);

		int num_1 = Utilities.getRandomNumberInRange(0, 1000);
		int den_1 = Utilities.getRandomNumberInRange(0, 1000);

		Fraction frac_0 = new Fraction(num_0, den_0);
		Fraction frac_1 = (Fraction) new Fraction(num_1, den_1).add(frac_0);
		list.add(frac_0);
		list.add(frac_1);

		int top = (int) frac_1.reciprocal().divide();
		int bottom = (int) frac_0.reciprocal().divide();

		list.add(new Int(top - bottom + 1));
	}
}
