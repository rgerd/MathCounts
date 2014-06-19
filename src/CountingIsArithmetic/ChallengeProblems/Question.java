package CountingIsArithmetic.ChallengeProblems;


import CountingIsArithmetic.CountingListsOfNumbers.Context;

import util.lang.*;
public class Question extends com.Question{


	@Override
	public String getQ(com.Context c) 
	{	

	
		Context c = (Context) _c;
		if(c.getType() == 1)
		{
			String question = LangUtility.populate("How many positive integers less than [num_0] can be written as the sum of [num_1] positive perfect squares.",);
		}
		
		
		return null;
	}


}