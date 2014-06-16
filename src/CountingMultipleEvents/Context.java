package CountingMultipleEvents;

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


	private void listGen1()
	{
		
	}

	private void listGen2()
	{		
		
	}

	private void listGen3()
	{
		
	}

	private void listGen4()
	{
		
	}

	private void listGen5()
	{

	}
	private void setType(int t)
	{
		type = t;
	}

	public int getType()
	{
		return type;

	}
}
