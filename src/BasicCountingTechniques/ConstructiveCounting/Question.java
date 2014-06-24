package BasicCountingTechniques.ConstructiveCounting;

import java.util.ArrayList;

import util.lang.LangUtil;

public class Question extends com.Question {
	private static String[] questions = new String[7];
	static {
	questions[0] = "How many [num_0] digit numbers have exactly one zero?";
	questions[1] = "How many [num_0] digit numbers have the property that the third digit is [num_1] times the first digit?";
	questions[2] = "How many sequences, x1, x2, x3, … , x[num_3] can be formed in which all the xi integers greater than [num_0] and less than [num_1], and no two adjacent xi are equal?";
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