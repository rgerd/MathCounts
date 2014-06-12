package CountingListsOfNumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;



public class AnswerGen 
{
	private HashSet<Integer> h;
	private int ans;
	
	public AnswerGen(int answer)
	{
		ans = answer;
	}
	
	public ArrayList<Integer> getWrong(String type)
	{
		h = new HashSet<Integer>();
		if(type.equals("window"))
		{
			h.add(ans+1);
			h.add(ans+2);
			h.add(ans-1);
			h.add(ans-2);
		}

		ArrayList<Integer> h1 = new ArrayList<Integer>();
		Iterator<Integer> itr = h.iterator();
		for(int i= 0; i < h.size(); i++)
		{
			h1.add(itr.next());
		}
		
		return h1;
	}
	

}