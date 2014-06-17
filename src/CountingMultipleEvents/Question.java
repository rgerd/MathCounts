package CountingMultipleEvents;

import java.util.ArrayList;



public class Question {
	private static String Q1 = "You have ";
	private String ret;

	public String getQ (Context c)
	{
		ArrayList<String> list = c.getList();
		System.out.println(list);
		if(c.getType() == 1)
		{
			String ret = Q1 +  list.get(0) + " " + list.get(1) + "(s)  and " + list.get(2) + " " + list.get(3) + "(s). How many ways can you choose a(n) "  + list.get(4) +  " consisting of 1 " + list.get(1) + " and 1 " + list.get(3) + "?";
			return ret;
		}
		
		return  ret;
			
	}
	public static String GetRearrangement()
	{
		String anagram = null;
		return anagram;
	}

}

