package CountingIsArithmetic.ChallengeProblems;

import util.lang.LangUtility;

public class Question extends com.Question{
	public String getQ(com.Context _c) {
		Context c = (Context) _c;
		
		if(c.getType() == 5) {
			return LangUtility.populate("How many integers n satisfy ([num_0]) < 1 / n < ([num_1])?", c.getList());
		}
		
		return null;
	}

}
