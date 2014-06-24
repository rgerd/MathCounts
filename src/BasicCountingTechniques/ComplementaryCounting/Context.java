package BasicCountingTechniques.ComplementaryCounting;



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
	int c=Util.getRandomNumberInRange(1, 2);
	if(c==1)
	{
		int c2=Util.getRandomNumberInRange(2, 15);
		list.add(new Int(c2));
		for(int i=100;i<1000;i++)
		{
		if(i%c2!=0)
		{
			help.add(i);
		}
		}
		ans=new Int(help.size());
	}
	else
	{
		int c1=Util.getRandomNumberInRange(500, 999);
		int c2=Util.getRandomNumberInRange(100, 400);
		list.add(new Int(c2));
		list.add(new Int(c1));
		for(int i=c2;i<c1;i++)
		{
			if(!Util.isSquare(i))
			{
			help.add(i);	
			}
		}
		ans=new Int( help.size());
	}
	

	}

	private void gen2() 
	{
		int f=Util.getRandomNumberInRange(7, 10);
		int f2=Util.getRandomNumberInRange(4, 6);
		int f3=Util.getRandomNumberInRange(2, 4);
		int f4=f-f2;
		list.add(new Int(f));
		list.add(new Int(f2));
		list.add(new Int(f3));
		list.add(new Int(f4));
		int answer=f-f3+1;
		answer*=f2;
		answer*=f2-1;
		if(f3==3)
			answer*=f2-2;
		if(f3==4)
			answer*=f2-3;
		answer*=Util.factorial(f-f3);
		ans=new Int(answer);
				
		
	}

	private void gen3()
	{
		ArrayList<String> alphabet = new ArrayList<String>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		alphabet.add("E");
		alphabet.add("F");
		alphabet.add("G");
		alphabet.add("H");
		alphabet.add("I");
		alphabet.add("J");
		alphabet.add("K");
		alphabet.add("L");
		alphabet.add("M");
		alphabet.add("N");
		alphabet.add("O");
		alphabet.add("P");
		alphabet.add("Q");
		alphabet.add("R");
		alphabet.add("S");
		alphabet.add("T");
		alphabet.add("U");
		alphabet.add("V");
		alphabet.add("W");
		alphabet.add("X");
		alphabet.add("Y");
		alphabet.add("Z");
		
		

	}

	private void gen4() 
	{
		int r= Util.getRandomNumberInRange(5, 15);
		list.add(new Int(r));
		int a = r*r*r;
		a-=r;
		ans=new Int(a);
	}


	private void gen5() {
		
	}

	public int chance()
	{
		return chance;
	}
}
