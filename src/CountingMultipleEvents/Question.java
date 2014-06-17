package CountingMultipleEvents;

import java.util.ArrayList;



public class Question {
	private static final String Q1 = "You have ";
	private static final String Q3 = "In how many ways can I arrange ";
	private String ret;

	public String getQ (Context c)
	{
		ArrayList<String> list = c.getList();

		if(c.getType() == 1)
		{
			String ret = Q1 +  list.get(0) + " " + list.get(1) + "(s)  and " + list.get(2) + " " + list.get(3) + "(s). How many ways can you choose a(n) "  + list.get(4) +  " consisting of 1 " + list.get(1) + " and 1 " + list.get(3) + "?";
			return ret;
		}
		else if(c.getType()==2)
		{ 
			if(list.size()==7)
			{
				String ret = Q1 +  list.get(0) + " " + list.get(1) + "(s)  and " + list.get(2) + " " + list.get(3)+ "(s)  and " +  list.get(4) + " " + list.get(5) + "(s). How many ways can you choose a(n) "  + list.get(6) +  " consisting of 1 " + list.get(1) + " and 1 " + list.get(3) + "?";
			}
				else if(list.size()==9){
					String ret = Q1 +  list.get(0) + " " + list.get(1) + "(s)  and " + list.get(2) + " " + list.get(3)+ "(s)  and " +  list.get(4) + " " + list.get(5) +"(s)  and " +  list.get(6) + " " + list.get(7) + "(s). How many ways can you choose a(n) "  + list.get(8) +  " consisting of 1 " + list.get(1) + " and 1 " + list.get(3) + "?";
				}
				else{ 
					String ret = Q1 +  list.get(0) + " " + list.get(1) + "(s)  and " + list.get(2) + " " + list.get(3)+ "(s)  and " +  list.get(4) + " " + list.get(5) +"(s)  and " +  list.get(6) + " " + list.get(7) +"(s)  and " +  list.get(8) + " " + list.get(9) + "(s). How many ways can you choose a(n) "  + list.get(10) +  " consisting of 1 " + list.get(1) + " and 1 " + list.get(3) + "?";
				}

		}

		else if(c.getType()==3)
		{


			System.out.println(list);

			System.out.println(list.get(0));

			String ret = Q3 + list.get(0) + "books on a shelf?";


			return ret;

		}
		return  ret;

	}
	public static String GetRearrangement()
	{
		String anagram = "angi";
		return anagram;
	}

}

