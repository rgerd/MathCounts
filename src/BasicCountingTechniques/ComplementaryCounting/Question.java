package BasicCountingTechniques.ComplementaryCounting;



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
			if(c.getList().size()==1)
				return questions[0]+c.getList().get(0)+"?";
			else 
				return questions[1]+c.getList().get(0)+" and "+c.getList().get(1)+" are not perfect squares?";
		}
		else if(c.getType() == 2)
		{
			String i ="The [family_0] family has "+c.getList().get(1)+" sons and "+ c.getList().get(3)+" daughters. In how many ways can they be sated in a row of "+c.getList().get(0)+" chairs so that "+c.getList().get(2)+" boys can sit next to eachother";
	        return LangUtil.populate(i,c.getList());	
		}
		else if(c.getType() == 4)
		{
			String i ="The guy has [num_0] [clothes_0], [num_0] [clothes_1] and [num_0] [clothes_2] Each item comes in the same [num_0] colors (so that I have 1 one item of each color). He refuses to wear an outfit in which all 3 items are the same color. How many choices for outfits do I have?";
	        return LangUtil.populate(i,c.getList());	
		}
		else if(c.getType() == 5)
		{
			String i ="In how many ways can [num_0] people be seated in a row of chairs if two of the people, [names_0] and [names_1], refuse to sit next to each other?";
	        return LangUtil.populate(i,c.getList());	
		}
		return null;
	}
}
