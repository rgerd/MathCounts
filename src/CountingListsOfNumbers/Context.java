package CountingListsOfNumbers;

import java.util.ArrayList;
import com.Utilities;

public class Context<E> {
	private int type;
	private int length;
	private ArrayList<Integer> list;
	private int start;
	
	
	public Context()
	{
		length=Utilities.getRandomNumberInRange(1,1000);
		start=Utilities.getRandomNumberInRange(1,1000);
		list = new ArrayList<Integer>();
	}
	
	public void generate(int type)
	{
		if(type ==  1)
		{
			listGen1();
		}else if(type == 2)
		{
			listGen2();
		}else if(type == 3)
		{
			listGen3();
		}
	}
	
	public ArrayList<Integer> getList()
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
		list.add(start);
		list.add(start +1);
		list.add(start+2);
		list.add(start+3);
		list.add(start+length);
	}
	
	private void listGen2()
	{
		list.add(start);
		list.add(start +1);
		list.add(start+2);
		list.add(start+3);
		list.add(start+length);
	}
	
	private void listGen3()
	{
		start = Utilities.getRandomNumberInRange(-1000,1000);
		list.add(start);
		list.add(start +1);
		list.add(start+2);
		list.add(start+3);
		list.add(start+length);
	}
	
	
}
