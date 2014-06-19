package CountingIsArithmetic.ChallengeProblems;

import java.util.ArrayList;

import util.Utilities;
import util.Number;
import util.Int;

public class Context extends com.Context{
	private int ans;
	private ArrayList<Number> list;
	private int chance;
	
	public Context()
	{
		
	}

	public ArrayList<Number> getList() {
		return list;
	}

	public int getAns() {
		return ans; 
	}
	
	private void gen1()
	{
		int length = Utilities.getRandomNumberInRange(10,1000);
		int numSquares = Utilities.getRandomNumberInRange(2,8);
		
		
		
		
		
		
		
	}
	
	private void gen2()
	{
		
		
		
		
		
		
		
		
		
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
	
	private void gen4()
	{
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	private void gen5()
	{
		//How many integers n satisfy (#1 / #2) < 1 / n < (#3 / #4)?
		
	}
}
