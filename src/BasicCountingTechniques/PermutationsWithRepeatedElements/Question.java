package BasicCountingTechniques.PermutationsWithRepeatedElements;

import util.lang.LangUtil;

public class Question extends com.Question {
	private static String[] questions = new String[4];
	static {
		questions[0] = "How many distinct arrangements are there of the letters in the word [num_0]?";
		questions[1] = "How many distinct arrangements are there of the letters in the word [num_0]?";
		questions[2] = "How many distinct arrangements are there of the letters in the word [num_0]?";

	}

	public String getQ(com.Context _c) {
		Context c = (Context) _c;
		return LangUtil.populate(questions[c.getType() - 1], c.getList());
	}
}
