package BasicCountingTechniques.ConstructiveCounting;

import java.util.HashMap;

import util.Int;
import util.Util;
import util.lang.LangUtil;

public class Question extends com.Question {
	private static String[] questions = new String[20];
	private static HashMap<Integer,String> hs = new HashMap<Integer,String>();
	static {
	questions[0] = "How many [num_0] digit numbers have exactly one zero?";
	questions[1] = "How many [num_0] digit numbers have the property that the third digit is [num_1] times the first digit?";
	questions[2] = "How many sequences, x1, x2, x3, … , x[num_2] can be formed in which all the xi integers greater than [num_0] and less than [num_1], and no two adjacent xi are equal?";
	questions[3] = "In how many ways can we choose a group of 3 different numbers from the group 1, 2, 3, … , [num_0] such that one number is the average of the other two? (The order in which we choose the numbers does not matter.)";
	questions[4] = "How many license plates can be formed if every license plate has [num_0] different letters followed by [num_1] different digits?";
	questions[5] = "How many 3 digit numbers have the property that the first digit is at least twice the second digit?";
	questions[6] = "How many positive, even 3-digit numbers exist such that the sum of the hundreds digit and the tens digit equals the units digit?";
	questions[7] = "How many 4 digit numbers have the second digit even and the fourth digit at least twice the second digit?";
	questions[8] = "How many 4 digit number have the property that the last digit is equal to the sum of the first 2 digits?";
	questions[9] = "How many sequences of [num_0] digits x1, x2, x3, … , x[num_0] can be formed such that no two adjacent have the same parity? (Parity means “odd” or “even”, so for example, x1, x2, and x3 cannot both be odd or both be even.)";
	questions[10] = "How many sequences of [num_0] digits x1, x2, x3, … , x[num_0] can be formed such that all numbers are odd?";
	questions[11] = "How many sequences of [num_0] digits x1, x2, x3, … , x[num_0] can be formed such that all numbers are even?";
	questions[12] = "How many sequences of [num_0] digits x1, x2, x3, … , x[num_0] can we form such that numbers follow the pattern of two odd and one even?";
	questions[13] = "How many 4-digit numbers have only ";
	hs.put(1, "only even digits?");
	hs.put(2, "only even digits?");
	hs.put(3, "digits with the same parity?");
	}
	
	
	public String getQ(com.Context _c) {
		Context c = (Context) _c;
		int chance = c.getChance();
		if(c.getType() == 1)
		{
			if(chance == 1)
			{
				return LangUtil.populate(questions[0], c.getList());
			}else {
				return LangUtil.populate(questions[1], c.getList());
			}
		}
		else if(c.getType() == 2)
		{
			return LangUtil.populate(questions[2], c.getList());
		}
		else if(c.getType() == 3)
		{
			return LangUtil.populate(questions[3], c.getList());
		}
		else if(c.getType() == 4)
		{
			return LangUtil.populate(questions[4], c.getList());
		}
		else if(c.getType() == 5)
		{
			if(chance == 1)
			{
				return LangUtil.populate(questions[5],c.getList());
			}else if(chance == 2)
			{
				return LangUtil.populate(questions[6],c.getList());
			}
		}
		else if(c.getType() ==  6)
		{
			if(chance == 1)
			{
				return LangUtil.populate(questions[9], c.getList());
			}else if(chance == 2){
				return LangUtil.populate(questions[10], c.getList());
			}else if(chance == 3)
			{
				return LangUtil.populate(questions[11],c.getList());
			}else if(chance == 4)
			{
				return LangUtil.populate(questions[12],c.getList());
			}else if(chance == 5)
			{
				int newChance = ((Int) c.getList().get(0)).getValue();
				return questions[13] + hs.get(newChance);
			}
		}
		else {
			
		}
		return null;

	}
	
}