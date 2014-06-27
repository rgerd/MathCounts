package BasicCountingTechniques.CountingPairsOfItems;



import java.util.ArrayList;
import java.util.HashSet;

import util.CustomNumber;
import util.Factorial;
import util.Fraction;
import util.Int;
import util.Number;
import util.Util;
import util.lang.LangUtil;

public class Context extends com.Context {
	private Number ans;
	private ArrayList<Number> list;
	private ArrayList<Integer> help;
	private int chance;

	public Context() {
		list = new ArrayList<Number>();
		help=new ArrayList<Integer>();
	}

	public ArrayList<Number> getList() {
		return list;
	}

	public Number getAnswer() {
		return ans;
	}

	private void gen1() 
	{
		int numPlayers = Util.getRandomNumberInRange(5, 20);
		list.add(new Int(numPlayers));
		ans = new Int(Util.combo(numPlayers, 2));
	}

	private void gen2() 
	{
		int endNum = Util.getRandomNumberInRange(10, 999);
		int firstBlankNum = Util.getRandomNumberInRange(5, endNum);
		list.add(new Int(endNum));
		list.add(new Int(firstBlankNum));
		
		int answer = (firstBlankNum*(1+firstBlankNum))/2;
		ans = new Int(answer);
	}

	private void gen3()
	{
		
	}

	private void gen4() 
	{
		int num = Util.getRandomNumberInRange(8, 11);
		list.add(new Int(num));
		
		ans = new Int(Util.combo(num, 2));
	}
	
	private void gen5()
	{
		boolean exit = false;
		int totalNumTeams = 0;
		while(!exit)
		{
			int rand = Util.getRandomNumberInRange(10, 40);
			if(rand % 2 == 0)
			{
				totalNumTeams = rand;
				exit = true;
			}
		}
		
		list.add(new Int(totalNumTeams));
		list.add(new Int(totalNumTeams/2));
		
		int num1 = 2*(2*(Util.combo(totalNumTeams/2, 2)));
		int answer = num1 + ((totalNumTeams/2)*(totalNumTeams/2));
		ans = new Int(answer);
	}
	
	private void gen6()
	{
		chance = Util.getRandomNumberInRange(1, 3);
		if(chance == 1)
		{
			int rand = Util.getRandomNumberInRange(10, 999);
			list.add(new Int(rand));
			int sum = 0;
			for(int i = 1; i <= rand; i++)
			{
				if(i % 2 == 0)
					sum += i;
			}
			
			ans = new Int(sum);
		}else if(chance == 2)
		{
			int rand = Util.getRandomNumberInRange(10, 999);
			list.add(new Int(rand));
			int sum = 0;
			for(int i = 1; i <= rand; i++)
			{
				if(i % 2 != 0)
					sum += i;
			}
			
			ans = new Int(sum);
		}else if(chance == 3)
		{
			int rand = Util.getRandomNumberInRange(10, 999);
			int multiple = Util.getRandomNumberInRange(3, 19);
			list.add(new Int(rand));
			list.add(new Int(multiple));
			int sum = 0;
			for(int i = 1; i <= rand; i++)
			{
				if(i % multiple != 0)
					sum += i;
			}
			
			ans = new Int(sum);
		}
	}

	public int chance()
	{
		return chance;
	}
}
