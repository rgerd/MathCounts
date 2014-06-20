package BasicCountingTechiques.Casework;

import util.lang.LangUtil;

import com.Context;

public class Question extends com.Question {
	private static String[] questions = new String[9];
	questions[1] = "The Mumblians decide to change their laws to only allow words that contain the letter A at least once. But they still limit their words to 3 letters or less, and they wish to use only letters AEMBN.";
	
	public String getQ(com.Context _c) {
		Context c = (Context) _c;
		return LangUtil.populate(questions[c.getType() - 1], c.getList());

	}
}
