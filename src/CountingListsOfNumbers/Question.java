package CountingListsOfNumbers;

import util.Utilities;


public class Question {
	private static final String Q = "How many numbers are in the list:";
	private static final String Q_T14 = "How many positive numbers under ";
	private static final String R = "How many roots between 1 and 10 inclusive are not included in the list";
	private static final String M = "How Many numbers are multiples of";
	private static final String Q_TYPE17 = "How many pairs of consecutive integers have products less than ";
	private static final String Q_TYPE15 = "You are assigned homework problems from ";
	private static final String Q_TYPE21 = "You are numbering jerseys for a sports team. How many players are on the team if the first jersey is labeled ";
	private static final String Q_TYPE19 = "You are assigned odd homework problems from ";
	private static final String Q_TYPE20 = "You are assigned even homework problems from ";
	private static final String Q_TYPE22 = "You are counting players with odd jerseys on a team. If the first jersey is labeled ";
	private int length;

	public String getQ (Context c)
	{
		if(c.getType() == 17)
		{
			String str = Q_TYPE17 + c.getType17() + "?";
			return str;
		}else if(c.getType() == 14 || c.getType() == 13)
		{
			String str = Q_T14 + c.getList().get(0) + " are multiples of " + c.getList().get(1) + " but not " + c.getList().get(2) + "?";
			return str;
		}else if(c.getType() == 15 || c.getType() == 21)
		{
			String str = "";
			if(c.getType() == 15)
				str = Q_TYPE15 + c.getList().get(0) + " to " + c.getList().get(1) + " (inclusive). How many problems were assigned?";
			else
				str = Q_TYPE21 + c.getList().get(0) + " and the last is labeled " + c.getList().get(1) + "?";
			return str;
		}else if (c.getType() == 19 || c.getType() == 20 || c.getType() == 22 || c.getType() == 23)
		{
			if(c.getType() == 19)
			{
				String str = Q_TYPE19 + c.getList().get(0) + " to " + c.getList().get(1) + " (inclusive). How many problems were assigned?";
				return str;
			}
			else if(c.getType() == 20)
			{
				String str = Q_TYPE20 + c.getList().get(0) + " to " + c.getList().get(1) + " (inclusive). How many problems were assigned?";
				return str;
			}
			else if(c.getType() == 22)
			{
				String str = Q_TYPE22 + c.getList().get(0) + " and the last is labeled " + c.getList().get(1) + ", how many odd jerseys are there?";
				return str;
			}
			else
			{
				String str = Q_TYPE22 + c.getList().get(0) + " and the last is labeled " + c.getList().get(1) + ", how many even jerseys are there?";
				return str;
			}
		}
		else
		{
			String st = c.getList().toString();
			int y = 0;

			for(int x =0; x<st.length();x++)
			{
				if(st.substring(x,x+1).equals(","))
				{
					y++;
				}
				if(y==4)
				{

					st=" "+st.substring(1,x)+"..."+st.substring(x+1,st.length()-1)+"?";

					x = st.length();
				}
			}
			String returnstring;

			returnstring = Q + st;

			return returnstring;
		}

	}

}
