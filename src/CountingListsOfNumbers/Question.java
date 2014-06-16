package CountingListsOfNumbers;

import util.Utilities;


public class Question {
	private static final String Q = "How many numbers are in the list:";
	private static final String Q_T14 = "How many numbers are multiples of ";
	private static final String R = "How many roots between 1 and 10 inclusive are not included in the list";
	private static final String M = "How Many numbers are multiples of";
	private static final String Q_TYPE17 = "How many pairs of consecutive integers have products less than ";
	private int length;
	
	public String getQ (Context c)
	{
		if(c.getType() == 17)
		{
			String str = Q_TYPE17 + c.getType() + "?";
			return str;
		}else if(c.getType() == 14 || c.getType() == 13)
		{
			String str = Q_T14 + c.getType() + "?";
			return str;
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
