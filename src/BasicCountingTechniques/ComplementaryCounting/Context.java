package BasicCountingTechniques.ComplementaryCounting;



import java.util.ArrayList;
import java.util.HashSet;

import util.CustomNumber;
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
		
		chance = Util.getRandomNumberInRange(1, 6);
		
		if(chance == 1)
		{
			int length1 = Util.getRandomNumberInRange(2,4);
			list.add(new Int(length1));
			int answer = (int) Math.pow(5, length1);
			answer = (int) (answer - Math.pow(3, length1));
			ans = new Int(answer);
		}
		else if(chance == 2)
		{
			int num1 = Util.getRandomNumberInRange(2,4);
			list.add(new Int(num1));
			String s = "";
			list.add(new CustomNumber(s));
			int num = Util.combo(3, 2);
			int perm = Util.perm(3,2);
			int answer = (int) Math.pow(5, num1);
			answer = (int) (answer - Math.pow(2, num1));
			ans = new Int(answer);
		}
		else if(chance == 3)
		{
			int num1 = Util.getRandomNumberInRange(2,4);
			list.add(new Int(num1));
			int answer = (int) Math.pow(5, num1);
			answer = (int) (answer - Math.pow(3, num1));
			answer = (int) (answer - 2*num1*Math.pow(3, num1-1));
			ans = new Int(answer);
		}
		else if(chance == 4) //one zero
		{
			int num1 = Util.getRandomNumberInRange (2, 6);
			list.add(new Int(num1));
			int answer = (int) (9*Math.pow(10, num1-1));
			answer = (int) (answer - Math.pow(9, num1));
			ans = new Int(answer);
		}
		else if(chance == 5) //two zeros
		{
			int num1 = Util.getRandomNumberInRange (3, 6);
			list.add(new Int(num1));
			int answer = (int) (9*Math.pow(10, num1-1));
			answer = (int) (answer - Math.pow(9, num1));
			answer = (int) (answer - Math.pow(9, num1-1)*(num1-1));
			ans = new Int(answer);
		}
		else //three zeros
		{
			int num1 = Util.getRandomNumberInRange (4, 6);
			list.add(new Int(num1));
			int answer = (int) (9*Math.pow(10, num1-1));
			answer = (int) (answer - Math.pow(9, num1));
			answer = (int) (answer - Math.pow(9, num1-1)*(num1-1));
			answer = (int) (answer - Math.pow(9, num1-2)*Util.combo(num1-1, 2));
			ans = new Int(answer);
		}


	}

	private void gen4() 
	{
		int r= Util.getRandomNumberInRange(5, 15);
		list.add(new Int(r));
		int a = r*r*r;
		a-=r;
		ans=new Int(a);
	}


	private void gen5() 
	{
		int r=Util.getRandomNumberInRange(5, 15);
		list.add(new Int(r));
		int answer=Util.factorial(r);
		int j=r-1;
		j*=2;
		ans=new Int(answer-j);
		
	}

	public int chance()
	{
		return chance;
	}
}
