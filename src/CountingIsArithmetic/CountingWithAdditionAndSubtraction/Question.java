package CountingIsArithmetic.CountingWithAdditionAndSubtraction;


public class Question extends com.Question {
	private static final String Q = "How many numbers are in the list:";
	private static final String Q_T14 = "How many positive numbers under ";
	private static final String R = "How many roots between 1 and 10 inclusive are not included in the list";
	private static final String M = "How Many numbers are multiples of";
	private static final String Q_TYPE17 = "How many pairs of consecutive integers have products less than ";
	private int length;
	
	public String getQ (com.Context _c)
	{
		Context c = (Context) _c;
		return null;
		//Commented out until someone can fix the errors
		/*
		if(c.getType() == 17)
		{
			String str = Q_TYPE17 + c.getType17() + "?";
			return str;
		}else if(c.getType() == 14 || c.getType() == 13)
		{
			String str = Q_T14 + c.getList().get(0) + " are multiples of " + c.getList().get(1) + " but not " + c.getList().get(2) + "?";
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
		*/
	}
	

}
