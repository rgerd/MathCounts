package BasicCountingTechniques.CountingWithRestrictions;

import util.lang.LangUtil;


public class Question extends com.Question {
	private static String[] questions = new String[7];
	static {
		/* type 1 */ 
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
		else if(c.getType() == 3)
		{
			if(c.chance()==1)
			{
			String st="Our math club has [num_0] members and 3 officers: President, Vice President, and Treasurer. However, one member, [names_0], dislikes another member, [names_1]. How many ways can we fill the offices if [names_0] refuses to serve as an officer if [names_1] is also an officer?";
			return LangUtil.populate(st, c.getList());
			}
			else if(c.chance()==2)
			{
			String st="Club has [num_1] boys and [num_2] girls. How many ways to choose if President and Vice president must be of same gender?";
			return LangUtil.populate(st, c.getList());
			}
			else if(c.chance()==3)
			{
			String st="Club has [num_1] boys and [num_2] girls. How many ways to choose if President and Vice president must be of different gender?";
			return LangUtil.populate(st, c.getList());
			}
			else if(c.chance()==4)
			{
			String st="How many 3-letter words can be formed from the standard 26-letter alphabet, if the first letter must be a vowel?";
			return LangUtil.populate(st, c.getList());
			}
			
		}	
		else if(c.getType() == 4)
		{
		
			
			String st="Our math club has [num_0] members and 3 officers: President, Vice President, and Treasurer. However, one member, [names_0], has a crush another member, [names_1]. How many ways can we fill the offices if [names_0] refuses to serve as an officer if [names_1] is not an officer? [names_1] is unaware of [names_0]'s affections, and is perfectly happy to serve even if [names_0] does not.";
			return LangUtil.populate(st, c.getList());
		
			
		}	
		else if(c.getType() == 5)
		{
		
			if(c.chance()==1)
			{
			String st="Our math club has [num_0] members and 3 officers: President, Vice President, and Treasurer. However, one member, [names_0], has a crush another member, [names_1]. How many ways can we fill the offices if [names_0] refuses to serve as an officer if [names_1] is not an officer? [names_1] is unaware of [names_0]'s affections, and is perfectly happy to serve even if [names_0] does not.";
			return LangUtil.populate(st, c.getList());
			}
			if(c.chance()==2)
			{}
			if(c.chance()==3)
			{}
			
		}	
		return null;
	}

}
