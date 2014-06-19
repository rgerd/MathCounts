package CountingIsArithmetic.ChallengeProblems;

import util.lang.*;
public class Question extends com.Question{
<<<<<<< HEAD

	@Override
	public String getQ(com.Context c) 
	{	
=======
	public String getQ(com.Context _c) {
>>>>>>> FETCH_HEAD
		Context c = (Context) _c;
		if(c.getType() == 1)
		{
			String question = LangUtility.populate("How many positive integers less than [num_0] can be written as the sum of [num_1] positive perfect squares.",);
		}
		
		
		return null;
	}

}
