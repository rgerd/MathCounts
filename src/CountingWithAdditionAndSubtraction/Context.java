package CountingWithAdditionAndSubtraction;

import java.util.ArrayList;

import util.Fraction;
import util.Int;
import util.Number;
import util.Utilities;

public class Context {
	private int type;
	private int length;
	private ArrayList<Number> list;
	private int start;
	private int type17;

	public Context()
	{
		list = new ArrayList<Number>();
	}


	public void generate(int type)
	{	
		if(type ==  1)
		{
			setType(1);
			listGen1();
		}else if(type == 2)
		{
			setType(2);
			listGen2();
		}else if(type == 3)
		{
			setType(3);
			listGen3();
		}else if(type == 4)
		{
			setType(4);
			listGen4();
		}else if(type == 5)
		{
			setType(5);
			listGen5();
		}else if(type == 6)
		{
			setType(6);
			listGen6();
		}
	}

	public ArrayList<Number> getList()
	{
		return list;
	}

	public int getAns() 
	{
		if(type == 17)
		{
			int count = 0;
			for(int i = 1; i < type17/2; i++)
			{
				if(i*(i+1) < type17)
					count++;
			}

			return count;
		}
		return length; 

	}

	public int getType17()
	{
		return type17;
	}

	private void listGen1()
	{
		start = 1;
		length=Utilities.getRandomNumberInRange(5,998);
		Int init = new Int(start);
		list.add(init);
		list.add(init.add(new Int(1)));
		list.add(init.add(new Int(2)));
		list.add(init.add(new Int(3)));
		list.add(init.add(new Int(length-1)));
	}

	private void listGen2()
	{		

	}

	private void listGen3()
	{
		start = Utilities.getRandomNumberInRange(-1000,994);
		length=Utilities.getRandomNumberInRange(5,999-start);
		Int init = new Int(start);
		list.add(init);
		list.add(init.add(new Int(1)));
		list.add(init.add(new Int(2)));
		list.add(init.add(new Int(3)));
		list.add(init.add(new Int(length-1)));
	}

	private void listGen4()
	{
		start = Utilities.getRandomNumberInRange(-994,1000);
		length=Utilities.getRandomNumberInRange(5,Math.abs(-999-start));
		Int init = new Int(start);
		list.add(init);
		list.add(init.sub(new Int(1)));
		list.add(init.sub(new Int(2)));
		list.add(init.sub(new Int(3)));
		list.add(init.sub(new Int(length-1)));
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
		}
		else
		{
			list.add(new Int(start));
			list.add(new Int(start - start));
			list.add(new Int(start - start*2));
			list.add(new Int(start - start*3));
			list.add(new Int(start - start*(length-1)));
		}

	}

	private void listGen6()
	{
		start = Utilities.getRandomNumberInRange(-199,199);
		while(start == 0)
		{
			Utilities.getRandomNumberInRange(-199,199);
		}
		int lengthRange = 1000/Math.abs((start));
		length = Utilities.getRandomNumberInRange(5,lengthRange);
		int chance = Utilities.getRandomNumberInRange(1, 2);
		if(chance == 1)
		{
			//increasing

			list.add(new Int(start));
			list.add(new Int(start + start));
			list.add(new Int(start + start*2));
			list.add(new Int(start + start*3));
			list.add(new Int(start + start*(length-1)));
		}else
		{
			//decreasing
			list.add(new Int(start));
			list.add(new Int(start - start));
			list.add(new Int(start - start*2));
			list.add(new Int(start - start*3));
			list.add(new Int(start - start*(length-1)));

		}
	}


	

	

	private void setType(int t)
	{
		type = t;
	}
<<<<<<< HEAD
	
=======

	public int getType()
	{
		return type;

	}
>>>>>>> origin/master
}




