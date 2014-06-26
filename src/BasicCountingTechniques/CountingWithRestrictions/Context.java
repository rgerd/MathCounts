package BasicCountingTechniques.CountingWithRestrictions;

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
	int r=Util.getRandomNumberInRange(8, 12);
	int r2d2=Util.getRandomNumberInRange(3, 5);
	int r4p17=r-r2d2;

	list.add(new Int(r2d2));
	list.add(new Int(r4p17));
	int helper=2*Util.factorial((r2d2-2));
	int urface=Util.factorial(r2d2)/helper;
	urface*=2;
	urface*=Util.factorial((r4p17+(r2d2-2)));
	ans=new Int(urface);

	}

	private void gen2() 
	{
		
		int x=Util.getRandomNumberInRange(3, 6);
		int x2=Util.getRandomNumberInRange(3, 6);
		int x3=Util.getRandomNumberInRange(3, 6);
		int n=x+x2+x3;
		list.add(new Int(n));
		list.add(new Int(x));
		list.add(new Int(x2));
		list.add(new Int(x3));
		
		int answer=Util.factorial(3);
		answer*=Util.factorial(x);
		answer*=Util.factorial(x2);
		answer*=Util.factorial(x3);
		ans=new Int(answer);
	
	}

	private void gen3()
	{
		int chance=Util.getRandomNumberInRange(1, 4);
		int r=Util.getRandomNumberInRange(20, 27);
		list.add(new Int(r));
		int answer=r;
	answer*=r-1;
	answer*=r-2;
	int remove=r-2;
	remove*=6;
	answer-=remove;
	ans=new Int(answer);

	}

	private void gen4() 
	{
		
	}


	private void gen5() 
	{
		
		
	}

	public int chance()
	{
		return chance;
	}
}
