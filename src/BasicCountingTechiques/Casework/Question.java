package BasicCountingTechiques.Casework;

import util.lang.LangUtil;

import com.Context;

public class Question extends com.Question {
	private static String[] questions = new String[9];

	public String getQ(com.Context _c) {
		Context c = (Context) _c;
		return LangUtil.populate(questions[c.getType() - 1], c.getList());

	}
}
