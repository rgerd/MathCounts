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
	questions[4] = "How many license plates can be formed if every license plate has [num_0] different letters followed by [num_1] different digits?";
	questions[5] = "How many 3 digit numbers have the property that the first digit is at least twice the second digit?";
	}
	private static final String[] places = {"1st","2nd","3rd"};
	
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
		}else if(c.getType() == 4)
		{
			return LangUtil.populate(questions[4], c.getList());
		}else if(c.getType() == 5)
		{
			int chance = c.getChance();
			if(chance == 1)
			{
				return LangUtil.populate(questions[5],c.getList());
			}
		}
		return null;
	}
	
}