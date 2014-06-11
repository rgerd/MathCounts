package CountingListsOfNumbers;


public class Question {
	private static final String Q = "How many numbers are in the list.";
	private int length;
	
	public String getQ (Context c)
	{
		
		String st = c.getList().toString();
		String returnstring = Q + st;
		return returnstring;
		//this will be further formatted, but I 
		//cannot do that until I can run it and see 
		//what this will look like and what must be done.
	}
	

}
