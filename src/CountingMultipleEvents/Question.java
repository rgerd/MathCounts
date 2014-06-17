package CountingMultipleEvents;

import java.util.ArrayList;

import util.Utilities;


public class Question {
	private static String Q1 = "You have ";
	private String ret;

	public String getQ (Context c)
	{
		ArrayList<String> list = c.getList();
		if(c.getType() == 1)
		{
			Q1 += list.get(0) + " " + list.get(1) + "(s)  and " + list.get(2) + " " + list.get(3) + "(s). How many ways can you choose a collection consisting of 1 " + list.get(1) + " and 1 " + list.get(3) + "?";
			ret = Q1;
		}
		
		return  ret;
			
	}
	public static String GetRearrangement()
	{
		String anagram = null;
		return anagram;
	}

}

