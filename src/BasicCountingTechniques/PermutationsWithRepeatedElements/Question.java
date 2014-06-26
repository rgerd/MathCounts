package BasicCountingTechniques.PermutationsWithRepeatedElements;

import util.lang.LangUtil;

public class Question extends com.Question {
	private static String[] questions = new String[4];
	static {
		questions[0] = "How many distinct arrangements are there of the letters in the word [num_0]?";
		questions[1] = "How many distinct arrangements are there of the letters in the word [num_0]?";
		questions[2] = "How many distinct arrangements are there of the letters in the word [num_0]?";
		questions[3] = "I have [num_0] [noun_0_pl], [num_1] of which are identical. If all of the other [noun_0_pl] are different, in how many ways can I arrange them on a shelf?";
	}

	public String getQ(com.Context _c) {
		Context c = (Context) _c;
		return LangUtil.populate(questions[c.getType() - 1], c.getList());
	}
}
