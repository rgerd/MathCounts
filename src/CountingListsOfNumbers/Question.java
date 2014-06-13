package CountingListsOfNumbers;

import util.Utilities;


public class Question {
	private static final String Q = "How many numbers are in the list:";
	private static final String R = "How many roots between 1 and 10 inclusive are not included in the list";
	private static final String M = "How Many numbers are multiples of";
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
		//int r = Utilities.getRandomNumberInRange(1,2);
		//if(c.getType() == 12&&r==1)
		//{
		//	returnstring = R + st;
		//}
		//else
		//{
		returnstring = Q + st;
		//}
		return returnstring;
	
	}
	
}
