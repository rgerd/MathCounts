package BasicCountingTechniques.Casework;

import util.lang.LangUtil;

public class Question extends com.Question {
	private static String[] questions = new String[9];
	static {
		questions[0] = "On the island of [civilization_0], the [civilization_0] alphabet has only [num_0] letters, [num_1], and every word in the [civilization_0] language has no more than [num_2] letters in it. How many words are possible?";
		questions[1] = "The [civilization_0] decide to change their laws to only allow words that contain the letter [num_0] at least once. But they still limit their words to [num_1] letters or less, and they wish to use only letters [num_2].";
		questions[2] = "At a [foodshop_0] shop, you can order your [toppings_0] [foodshop_0_pl] in two sizes, with or without [toppings_1_pl], and you get your choice of [num_0] different types of [toppings_2_pl]. How many different [toppings_0] [foodshop_0_pl] are there?";
	}

	public String getQ(com.Context _c) {
		Context c = (Context) _c;
		return LangUtil.populate(questions[c.getType() - 1], c.getList());

	}
}
