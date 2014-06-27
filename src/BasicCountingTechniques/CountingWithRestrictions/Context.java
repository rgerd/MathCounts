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
		chance=Util.getRandomNumberInRange(1, 5);
		if(chance==1)
		{
		int r=Util.getRandomNumberInRange(20, 27);
		list.add(new Int(r));
		int answer=r;
	answer*=r-1;
	answer*=r-2;
	answer*=6;
	int remove=r-2;
	remove*=6;
	answer-=remove;
	ans=new Int(answer);
		}
		if(chance==2)
		{
		int r=Util.getRandomNumberInRange(16,20);
		int r1=Util.getRandomNumberInRange(8, 12);
		int r2=r-r1;
		list.add(new Int(r));
		list.add(new Int(r1));
		list.add(new Int(r2));
	int answer=Util.combo(r1,2)+Util.combo(r2,2);
	answer*=2;
	ans=new Int(answer);
	
		}
		if(chance==3)
		{
		int r=Util.getRandomNumberInRange(16,20);
		int r1=Util.getRandomNumberInRange(8, 12);
		int r2=r-r1;
		list.add(new Int(r));
		list.add(new Int(r1));
		list.add(new Int(r2));
	int answer=Util.combo(r1,1)*Util.combo(r2,1);
	answer*=2;
	ans=new Int(answer);
		}
		if(chance==4)
		{

		int answer=1;
	answer=26;
	
	answer*=26;

	answer*=Util.factorial(5);

	ans=new Int(answer);
		}
		if(chance==5)
		{

		int answer=1;
	answer*=5;
	
	answer*=4;

	answer*=3;

	ans=new Int(answer);
		}
		
		
	
		
	}

	private void gen4() 
	{
	
		int r=Util.getRandomNumberInRange(20, 27);
		list.add(new Int(r));
		int answer=r;
	answer*=r-1;
	answer*=r-2;
	answer*=6;
	int remove=r-2;
	remove*=r-3;
	remove*=6;
	answer-=remove;
	ans=new Int(answer);
		
	}


	private void gen5() 
	{
		int r=Util.getRandomNumberInRange(20, 27);
		int chance=Util.getRandomNumberInRange(1,3);
		if(chance==1)
		{
			int answer= r;
			answer*=r-1;
			answer*=r-2;
			answer*=Util.factorial(3);
		}
		else if(chance==2)
		{
			int answer= r;
			answer*=r-1;
			answer*=r-2;
			answer*=Util.factorial(3);
			int extra=r*(r-1);
		}
		
		
	}

	public int chance()
	{
		return chance;
	}
}
