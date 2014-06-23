package BasicCountingTechniques.ComplementaryCounting;



import util.lang.LangUtil;

public class Question extends com.Question {
	private static String[] questions = new String[7];
	static {
		/* type 1 */ questions[0] = "How Many 3 digit numbers arent multiples of ";
		/* type 2 */ questions[1] = null;
		/* type 3 */ questions[2] = "What is the greatest common factor of [num_0], [num_1], and [num_2] ?";
		/* type 4 */ questions[3] = "My house has [num_0] [collection_0] of [noun_0], with [num_1] [noun_0] in each [collection_0_sng]. The [noun_0] in each [collection_0_sng] are numbered from 1 to [num_1]. How many [noun_0_pl] have odd numbers?";
		/* type 5 */ questions[4] = "How many integers n satisfy ([num_0]) < 1 / n < ([num_1])?";
		/*type 3.1*/ questions[5] = "What is the units digit of 1! + 2! + 3! + 4! + ... + [num_0] ?";
		/*type 3.2*/ questions[6] = "How many of the factorials from [num_0] to [num_1] are divisible by [num_2]?";
	}

	public String getQ(com.Context _c) {
		Context c = (Context) _c;
		if(c.getType() == 3)
		{
			if(c.chance() == 2)
				return LangUtil.populate(questions[5], c.getList());
			else if(c.chance() == 3)
				return LangUtil.populate(questions[6], c.getList());
		}
		return LangUtil.populate(questions[c.getType() - 1], c.getList());

	}
}
