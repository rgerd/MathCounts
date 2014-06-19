package CountingIsArithmetic.ChallengeProblems;

import util.lang.LangUtility;



public class Question extends com.Question{
	
	public String getQ(com.Context _c) {
		


		Context c = (Context) _c;
		
		if(c.getType() == 5) {
			return LangUtility.populate("How many integers n satisfy ([num_0]) < 1 / n < ([num_1])?", c.getList());
		}
		if(c.getType() == 1)
		{
			String question = LangUtility.populate("How many positive integers less than [num_0] can be written as the sum of [num_1] positive perfect squares.", c.getList().get(0));
		}
		if(c.getType() == 3)
		{
			String q = LangUtility.populate("What is the greatest common factor of [num_0]!, [num_1]!, and [num_2]! ?", c.getList().get(0), c.getList().get(1), c.getList().get(2));
			return q;

		}
		if(c.getType() == 4)
		{
			String zimzambabityboopity=("My house has " +c.getList().get(0)+ "herds of cats, with "+c.getList().get(1) + "cats in each herd. The cats in each herd are numbered from 1 to"+c.getList().get(1)+". How many cats have odd numbers?");
			return zimzambabityboopity;
		}

		return null;
	}


}
