package BasicCountingTechniques.CountingWithRestrictions;

import util.lang.LangUtil;


public class Question extends com.Question {
	private static String[] questions = new String[7];
	static {
		/* type 1 */ 
		questions[0] = "How Many 3 digit numbers arent multiples of ";
		questions[1] = "How many numbers between : ";
	}

	public String getQ(com.Context _c) {
		Context c = (Context) _c;
		if(c.getType() == 1)
		{
			String st="In how many ways can I arrange [num_0] different [subject_0] books and [num_1] different [subject_1] books on my bookshelf, if I require there to be a [subject_0] book on both ends?";
			return LangUtil.populate(st, c.getList());
		}	
		else if(c.getType() == 2)
		{
			String st="The Super Awesome High School’s European debate club has [num_1] [countries_0] delegates, [num_2] [countries_1] delegates, and [num_3] [countries_2] delegates. In how many ways can these [num_0] delegates sit in a row of [num_0] chairs, if each country’s delegates insist on all sitting next to each other?";
			return LangUtil.populate(st, c.getList());
		}	
		return null;
	}

}
