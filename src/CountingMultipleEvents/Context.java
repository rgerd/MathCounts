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
		}else if(type == 6)
		{
			setType(6);
			listGen6();
		}else if(type == 7)
		{
			setType(7);
			listGen7();
		}else if(type == 8)
		{
			setType(8);
			listGen8();
		}else if(type == 9)
		{
			setType(9);
			listGen9();
		}else if(type == 10)
		{
			setType(10);
			listGen10();
		}else if(type == 11)
		{
			setType(11);
			listGen11();
		}else if(type == 12)
		{
			setType(12);
			listGen12();
		}else if(type == 13)
		{
			setType(13);
			listGen13();
		}else if(type == 14)
		{
			setType(14);
			listGen14();
		}else if(type == 15)
		{
			setType(15);
			listGen15();
		}else if(type == 16)
		{
			setType(16);
			listGen16();
		}else if(type == 17)
		{
			setType(17);
			listGen17();
		}else if(type == 18)
		{
			setType(18);
			listGen18();
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
}
