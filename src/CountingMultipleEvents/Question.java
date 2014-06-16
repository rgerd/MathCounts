package CountingMultipleEvents;

import util.Utilities;


public class Question {
	private static final String Q = "You have (#1) (attribute #1)s and (#2) (attribute #2)s. How many ways can you choose a (collection) consisting of 1 (attribute #1) and 1 (attribute #2)?";
	private int length;

	public String getQ (Context c)
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

