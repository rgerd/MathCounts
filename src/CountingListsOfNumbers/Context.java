package CountingListsOfNumbers;

import java.util.ArrayList;
import com.Utilities;
import com.Fraction;

public class Context<E> {
	private int type;
	private int length;
	private ArrayList<Integer> list;
	private int start;
	
	
	public Context()
	{
		length=Utilities.getRandomNumberInRange(1,1000);
		start=Utilities.getRandomNumberInRange(1,1000);
		list = new ArrayList<E>();
	}
	
	public void generate(int type)
	{
		
	}
	
	public ArrayList<E> getList()
	{
		
	}
	
	public E getAns() 
	{
		if(type == 1)
		{
			
		}
	}
	
	private void listGen1()
	{
		list.add(start);
		list.
	}
}
