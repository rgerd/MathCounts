package CountingIsArithmetic.ChallengeProblems;

import util.lang.*;
import util.Int;
public class Question extends com.Question{
	
	public String getQ(com.Context _c) {
		
		Context c = (Context) _c;
		if(c.getType() == 1)
		{
			String question = LangUtility.populate("How many positive integers less than [num_0] can be written as the sum of [num_1] positive perfect squares.", c.getList().get(0));
		}
		else if(c.getType() == 3)
		{
			String q = LangUtility.populate("What is the greatest common factor of [num_0]!, [num_1]!, and [num_2]! ?", c.getList().get(0), c.getList().get(1), c.getList().get(2));
			return q;
		}
		
		return null;
	}

}
