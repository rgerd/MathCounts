package CountingListsOfNumbers;

import java.util.ArrayList;

import com.Utilities;
import com.Number;
import com.Int;

public class Context<Number> {
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
		list.add((Number) new Int(start));
		list.add((Number) new Int(start +1));
		list.add((Number) new Int(start +2));
		list.add((Number) new Int(start+3));
		list.add((Number) new Int(start+length-1));
	}
	
	private void listGen2()
	{
		list.add((Number) new Int(start));
		list.add((Number) new Int(start +1));
		list.add((Number) new Int(start +2));
		list.add((Number) new Int(start+3));
		list.add((Number) new Int(start+length-1));
	}
	
	private void listGen3()
	{
		start = Utilities.getRandomNumberInRange(-1000,1000);
		list.add((Number) new Int(start));
		list.add((Number) new Int(start +1));
		list.add((Number) new Int(start +2));
		list.add((Number) new Int(start+3));
		list.add((Number) new Int(start+length-1));
	}
	
	private void listGen4()
	{
		start = Utilities.getRandomNumberInRange(-1000,1000);
		list.add((Number) new Int(start));
		list.add((Number) new Int(start -1));
		list.add((Number) new Int(start - 2));
		list.add((Number) new Int(start - 3));
		list.add((Number) new Int(start - length+1));
	}
	
	private void listGen5()
	{
		
	}
	
	
}
