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
		return LangUtil.populate(questions[c.getType() - 1], c.getList());

	}
}
