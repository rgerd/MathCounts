package BasicCountingTechniques.ConstructiveCounting;

import java.util.ArrayList;

import util.lang.LangUtil;

public class Question extends com.Question {
	private static String[] questions = new String[7];
	static {
	questions[0] = "How many [num_0] digit numbers have exactly one zero?";
	questions[1] = "How many [num_0] digit numbers have the property that the third digit is [num_1] times the first digit?";
	questions[2] = "How many sequences, x1, x2, x3, … , x[num_2] can be formed in which all the xi integers greater than [num_0] and less than [num_1], and no two adjacent xi are equal?";
	questions[3] = "In how many ways can we choose a group of 3 different numbers from the group 1, 2, 3, … , [num_0] such that one number is the average of the other two? (The order in which we choose the numbers does not matter.)";
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
		}else if(c.getType() == 2)
		{
			return LangUtil.populate(questions[2], c.getList());
		}else if(c.getType() == 3)
		{
			return LangUtil.populate(questions[3], c.getList());
		}
		return null;
	}
	
}