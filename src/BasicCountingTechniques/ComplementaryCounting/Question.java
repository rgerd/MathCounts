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
		return null;
	}
}
