package CountingIsArithmetic.ChallengeProblems;

<<<<<<< HEAD
import util.lang.LangUtility;

=======
import util.lang.*;
>>>>>>> FETCH_HEAD
public class Question extends com.Question{
<<<<<<< HEAD

	@Override
	public String getQ(com.Context c) 
	{	
=======
	public String getQ(com.Context _c) {
>>>>>>> FETCH_HEAD
		Context c = (Context) _c;
<<<<<<< HEAD
		
		if(c.getType() == 5) {
			return LangUtility.populate("How many integers n satisfy ([num_0]) < 1 / n < ([num_1])?", c.getList());
		}
=======
		if(c.getType() == 1)
		{
			String question = LangUtility.populate("How many positive integers less than [num_0] can be written as the sum of [num_1] positive perfect squares.",);
		}
		
>>>>>>> FETCH_HEAD
		
		return null;
	}

}
