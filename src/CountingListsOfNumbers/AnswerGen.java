package CountingListsOfNumbers;

import java.util.HashSet;

public class AnswerGen 
{
	private HashSet<Integer> h;
	private int ans;
	
	public AnswerGen(int answer)
	{
		ans = answer;
	}
	
	public void getWrong(String type)
	{
		if(type.equals("window"))
		{
			h.add(ans+1);
			h.add(ans+2);
			h.add(ans-1);
			h.add(ans-2);
		}
	}
	
	public HashSet<Integer> getHash()
	{
		return h;
	}
}
