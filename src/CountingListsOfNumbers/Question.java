package CountingListsOfNumbers;

import util.Utilities;


public class Question {
	private static final String Q = "You have ";
	
	public String getQ (Context c)
	{
		if(c.getType() == 1)
		{
			
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
