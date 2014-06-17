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
			cWAAS1();
		}else if(type == 2)
		{
			setType(2);
			cWAAS2();
		}else if(type == 3)
		{
			setType(3);
			cWAAS3();
		}else if(type == 4)
		{
			setType(4);
			cWAAS4();
		}else if(type == 5)
		{
			setType(5);
			cWAAS5();
		}else if(type == 6)
		{
			setType(6);
			cWAAS6();
		}
	}

	public ArrayList<Number> getList()
	{
		return list;
	}

	public int getAns() 
	{
		if(type == 2)
		{
			int count = 0;
			for(int i = 0; i < list.size(); i++)
			{
				if(i==0)
				{
					Int i1 = (Int)(list.get(i));
					int i2=i1.getValue();
					count=+i2;
				}
				else{
				Int i1 = (Int)(list.get(i));
				int i2=i1.getValue();
						count*=i2;
				}
			}

			return count;
		}
		return length; 

	}

	private void cWAAS1()
	{
		Integer type1 = Utilities.getRandomNumberInRange(2,15);
		Integer type2 = Utilities.getRandomNumberInRange(2,15);
		Int init = new Int(start);
		list.add(init);
		list.add(init.add(new Int(type1)));
		list.add(init.add(new Int(type2)));
	}
	private void cWAAS2()
	{		
		Integer types=Utilities.getRandomNumberInRange(3, 5);
		Int init = new Int(start);
      for(int i=0;i<types;i++)
      {
    	list.add(init.add(new Int(Utilities.getRandomNumberInRange(2,15))));  
      }
	}
	private void cWAAS3()
	{
		
	}
	private void cWAAS4()
	{
		
	}
	private void cWAAS5()
	{
		
	}
	private void cWAAS6()
	{
		
	}
	private void setType(int t)
	{
		type = t;
	}

}




