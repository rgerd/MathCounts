package util.lang;

import util.Int;
import util.Utilities;

public class Driver {
	public static void main(String... args) {
		for (int i = 0; i < 20; i++) {
			Int total = new Int(Utilities.getRandomNumberInRange(1, 20));
			Int other = new Int(Utilities.getRandomNumberInRange(0, 10));
			double p_num_0 = Math.random();
			Int num_0 = new Int(1);//(int) (((Int) total.sub(other)).getValue() * p_num_0));
			Int num_1 = new Int(1);//new Int((int) (((Int) total.sub(other)).getValue() * (1 - p_num_0)));

			String question = LangUtility.populate("[num_0] [noun_0] [verb] [venue_0]. [num_1] of them [verb] [adj_0]. [num_2] of them [verb] [adj_1]. How many [noun_0_pl] [verb] not [adj_0] or [adj_1]??", total, num_0, num_1);
			System.out.println(question);
		}
	}
}
