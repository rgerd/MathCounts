package CountingListsOfNumbers;

import java.util.ArrayList;

import com.Root;
import com.Fraction;
import com.Utilities;
import com.Number;
import com.Int;

public class Context {
	private int type;
	private int length;
	private ArrayList<Number> list;
	private int start;
	
	
	public Context()
	{
		list = new ArrayList<Number>();
	}
	
	public void generate(int type)
	{	
		length=Utilities.getRandomNumberInRange(1,1000);
		start=Utilities.getRandomNumberInRange(1,1000);
		if(type ==  1)
		{
			listGen1();
		}else if(type == 2)
		{
			listGen2();
		}else if(type == 3)
		{
			listGen3();
		}else if(type == 4)
		{
			listGen4();
		}else if(type == 5)
		{
			listGen5();
		}
	}
	
	public ArrayList<Number> getList()
	{
		return list;
	}
	
	public int getAns() 
	{
		return length; 
	}
	
	private void listGen1()
	{
		start = 1;
		list.add(new Int(start));
		list.add(new Int(start +1));
		list.add(new Int(start +2));
		list.add(new Int(start+3));
		list.add(new Int(start+length-1));
	}
	
	private void listGen2()
	{
		list.add(new Int(start));
		list.add(new Int(start +1));
		list.add(new Int(start +2));
		list.add(new Int(start+3));
		list.add(new Int(start+length-1));
	}
	
	private void listGen3()
	{
		start = Utilities.getRandomNumberInRange(-1000,1000);
		list.add(new Int(start));
		list.add(new Int(start +1));
		list.add(new Int(start +2));
		list.add(new Int(start+3));
		list.add(new Int(start+length-1));
	}
	
	private void listGen4()
	{
		start = Utilities.getRandomNumberInRange(-1000,1000);
		list.add(new Int(start));
		list.add(new Int(start -1));
		list.add(new Int(start - 2));
		list.add(new Int(start - 3));
		list.add(new Int(start - length+1));
	}
	
	private void listGen5()
	{
		start = Utilities.getRandomNumberInRange(2,10);
		int lengthRange = (1000/start)-1;
		length = Utilities.getRandomNumberInRange(2,lengthRange);
		int chance = Utilities.getRandomNumberInRange(1, 2);
		if(chance == 1)
		{
			list.add(new Int(start));
			list.add(new Int(start + start));
			list.add(new Int(start + start*2));
			list.add(new Int(start + start*3));
			list.add(new Int(start + start*(length-1)));
		}else
		{
			list.add(new Int(start));
			list.add(new Fraction(start,start).simplify());
			list.add(new Fraction(start,start*2).simplify());
			list.add(new Fraction(start,start*3).simplify());
			list.add(new Fraction(start,start*length-1).simplify());
		}
		
	}
	
	private void listGen6()
	{
		
	}
	
	
}
