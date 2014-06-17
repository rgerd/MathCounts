package util.lang;

import util.Int;
import util.Utilities;

public class Driver {
	public static void main(String... args) {
		for (int i = 0; i < 20; i++) {
			double p_num_0 = Math.random() * 0.5;
			double p_num_1 = Math.random();
			Int total = new Int(Utilities.getRandomNumberInRange(10, 20));
			Int other = new Int((int) (total.getValue() * p_num_0));
			Int num_0 = new Int((int) (((Int) total.sub(other)).getValue() * p_num_1));
			Int num_1 = new Int((int) (((Int) total.sub(other)).getValue() * (1 - p_num_1)));

			String question = LangUtility.populate("[num_0] [noun_0] [verb_0] [venue_0]. [num_1] of them [verb_0] [adj_0]. [num_2] of them [verb_0] [adj_1]. How many [noun_0_pl] [venue_0] [verb_0] not [adj_0] or [adj_1]??", total, num_0, num_1);
			System.out.println(question);
		}
	}
}
