package CountingListsOfNumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import util.Int;
import util.Number;


public class AnswerGen 
{
	private HashSet<Number> h;
	private int ans;
	
	public AnswerGen(int answer)
	{
		ans = answer;
	}
	
	public ArrayList<Number> getWrong(String type)
	{
		h = new HashSet<Number>();
		if(type.equals("window"))
		{
			h.add(new Int(ans+1));
			h.add(new Int(ans+2));
			h.add(new Int(ans-1));
			h.add(new Int(ans-2));
		}

		ArrayList<Number> h1 = new ArrayList<Number>();
		h1.add(new Int(ans));
		
		Iterator<Number> itr = h.iterator();
		for(int i= 0; i < h.size(); i++)
		{
			h1.add(itr.next());
		}
		
		return h1;
	}
	

}