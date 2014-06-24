package BasicCountingTechniques.ConstructiveCounting;

import java.util.ArrayList;

import util.lang.LangUtil;

public class Question extends com.Question {
	private static String[] questions = new String[7];
	static {
	questions[0] = "How many [num_0] digit numbers have exactly one zero?";
	questions[1] = "How many [num_0] digit numbers have the property that the third digit is [num_1] times the first digit?";
	}
	
	public String getQ(com.Context _c) {
		Context c = (Context) _c;

		if(c.getType() == 1)
		{
			int chance = c.getChance();
			if(chance == 1)
			{
				return LangUtil.populate(questions[0], c.getList());
			}else {
				return LangUtil.populate(questions[1], c.getList());
			}
		}
		return null;
	}
	
}