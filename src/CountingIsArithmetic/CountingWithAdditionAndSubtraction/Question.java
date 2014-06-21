package CountingIsArithmetic.CountingWithAdditionAndSubtraction;

import util.lang.LangUtil;

public class Question extends com.Question {
	String[] questions = {
		"[venue_0], there are [num_0] [noun_0] that [verb_0] [adj_0] and [adj_1]. If [num_1] [noun_0] [verb_0] only [adj_0] and [num_1] [noun_0] [verb_0] only [adj_1], how many [noun_0_pl] must be both [adj_0] and [adj_1]?",	
	};
	
	public String getQ(com.Context _c) {
		
		Context c = (Context) _c;
		
		return LangUtil.populate(questions[c.getType() - 1], c.getList());
	}
}
