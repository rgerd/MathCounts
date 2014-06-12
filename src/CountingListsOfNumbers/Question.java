package CountingListsOfNumbers;


public class Question {
	private static final String Q = "How many numbers are in the list:";
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
		String returnstring = Q + st;
		return returnstring;
	
	}
}
