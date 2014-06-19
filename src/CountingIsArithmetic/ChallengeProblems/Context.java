package CountingIsArithmetic.ChallengeProblems;

import java.util.ArrayList;

import util.Int;
import util.Number;
import util.Utilities;

public class Context extends com.Context{
	private int ans;
	private ArrayList<Number> list;
	
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
		
		
		
		
		
		
		
		
	}
	
	private void gen2()
	{
		
		
		
		
		
		
		
		
		
	}
	
	private void gen3()
	{
		
		
		
		
		
		
		
		
		
	}
	
	private void gen4()
	{
		int answer=0;
		
		int g=Utilities.getRandomNumberInRange(2, 100);
		int i=Utilities.getRandomNumberInRange(2, 100);
		list.add(new Int(g));
		list.add(new Int(g));
		for(int x=0;x<g;x++)
		{
			for(int y=0;y<i;y++)
			{
				if(i%2==1)
					answer++;
			}
		}
		ans=answer;
		
		
		
		
		
		
		
		
		
	}
	
	private void gen5()
	{
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

