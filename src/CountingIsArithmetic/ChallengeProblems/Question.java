package CountingIsArithmetic.ChallengeProblems;

import util.lang.LangUtil;

public class Question extends com.Question {
	private static String[] questions = new String[5];
	static {
		/* type 1 */ questions[0] = "How many positive integers less than [num_0] can be written as the sum of [num_1] positive perfect squares?";
		/* type 2 */ questions[1] = null;
		/* type 3 */ questions[2] = "What is the greatest common factor of [num_0], [num_1], and [num_2] ?";
		/* type 4 */ questions[3] = "My house has [num_0] [collection_0] of [noun_0], with [num_1] [noun_0] in each [collection_0_sng]. The [noun_0] in each [collection_0_sng] are numbered from 1 to [num_1]. How many [noun_0_pl] have odd numbers?";
		/* type 5 */ questions[4] = "How many integers n satisfy ([num_0]) < 1 / n < ([num_1])?";
	}

	public String getQ(com.Context _c) {
		Context c = (Context) _c;
		return LangUtil.populate(questions[c.getType() - 1], c.getList());
	}
}
