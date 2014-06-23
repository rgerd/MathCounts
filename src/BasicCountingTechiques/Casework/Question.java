package BasicCountingTechiques.Casework;

import util.lang.LangUtil;

public class Question extends com.Question {
	private static String[] questions = new String[9];
	static {
		questions[0] = "On the island of [civilization_0], the [civilization_0] alphabet has only [num_0] letters, [num_1], and every word in the [civilization_1] has no more than [num_2] letters in it. How many words are possible?";
		questions[1] = "The Mumblians decide to change their laws to only allow words that contain the letter A at least once. But they still limit their words to 3 letters or less, and they wish to use only letters AEMBN.";
	}

	public String getQ(com.Context _c) {
		Context c = (Context) _c;
		return LangUtil.populate(questions[c.getType() - 1], c.getList());

	}
}
