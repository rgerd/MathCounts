package CountingIsArithmetic.CountingMultipleEvents;

import java.util.ArrayList;

import util.Int;
import util.Utilities;
import util.lang.LangUtility;
import util.Number;

public class Question extends com.Question {
	private static final String Q1 = "You have ";
	private static final String Q3 = "In how many ways can I arrange ";
	private static final String QANA = "How many different arrangements of the word ";
	private static final String Q4_1 = "You have 1 shirt and 1 tie in ";
	private static final String Q4_2 = "In how many ways can the following license plate be arranged: ";
	private static final String Q4_3 = "How many ways can ";
	private static final String Q4_4 = "How many ways can ";
	private static final String Q4_5 = "How many ways can a school elect a President, Vice President, Secretary, and Treasurer if the student pool is ";
	private static final String Q4_6 = "How many ways can 3 Olympic athletes get Gold, Silver, and Bronze medals if the number of athletes competing is ";
	private static final String Q4_7 = "How many ways can a basketball coach choose a center, a point guard, a shooting forward, and a shooting guard from a player pool of ";
	private String ret;

	public String getQ(com.Context _c) {
		Context c = (Context) _c;

		ArrayList<String> list = c.getList();

		if (c.getType() == 1) {
			String ret = LangUtility.populate("You have [num_0] [noun_0] and [num_1] [noun_1]. How many ways can you choose a collection consisting of 1 [noun_0_sng] and 1 [noun_1_sng]?", new Int(Integer.parseInt(list.get(0))), new Int(Integer.parseInt(list.get(1))));
			return ret;
		} else if (c.getType() == 2) {
			if (list.size() == 7) {
				String ret = Q1 + list.get(0) + " " + list.get(1) + ", " + list.get(2) + " " + list.get(3) + ", and " + list.get(4) + " " + list.get(5) + ". How many ways can you choose an " + list.get(6) + " consisting of 1 " + list.get(1).substring(0, list.get(1).length()-1) + ", 1 " + list.get(3).substring(0, list.get(3).length()-1) + ", and 1 " + list.get(5).substring(0, list.get(5).length()-1) + "?";
				return ret;
			} else if (list.size() == 9) {
				String ret = Q1 + list.get(0) + " " + list.get(1) + ", " + list.get(2) + " " + list.get(3) + ", " + list.get(4) + " " + list.get(5) + ", and " + list.get(6) + " " + list.get(7) + ". How many ways can you choose an " + list.get(8) + " consisting of 1 " + list.get(1).substring(0, list.get(1).length()-1) + ", 1 " + list.get(3).substring(0, list.get(3).length()-1) + ", 1 " + list.get(5).substring(0, list.get(5).length()-1) + " and 1 " + list.get(7).substring(0, list.get(7).length()-1) + "?";
				return ret;
			} else if (list.size() == 11) {
				String ret = Q1 + list.get(0) + " " + list.get(1) + ", " + list.get(2) + " " + list.get(3) + ", " + list.get(4) + " " + list.get(5) + ", " + list.get(6) + " " + list.get(7) + ", and " + list.get(8) + " " + list.get(9) + ". How many ways can you choose an " + list.get(10) + " consisting of 1 " + list.get(1).substring(0, list.get(1).length()-1) + ", 1 " + list.get(3).substring(0, list.get(3).length()-1) + ", 1 " + list.get(5).substring(0, list.get(5).length()-1) + ", 1 " + list.get(7).substring(0, list.get(7).length()-1) + ", and 1 " + list.get(9).substring(0, list.get(9).length()-1) + "?";
				return ret;
			}

		}

		else if (c.getType() == 3) {
			int chance = Utilities.getRandomNumberInRange(1,4);
			String ret = null;
					if(chance==1)
						 ret = Q3 + list.get(0) + " books on a shelf?";
					if(chance==2)
						 ret = Q3 + list.get(0) + " people in a line?";
					if(chance==3)
						 ret = Q3 + list.get(0) + " food in a buffet line?";
					else
						 ret = Q3 + list.get(0) + " birds on a power line?";
			if (c.getAna()) {
				ret = QANA + list.get(0) + " can you make?";
			}
			return ret;

		} else if (c.getType() == 4) {
			if (c.chance4() == 1) {
				String ret = Q4_1 + list.get(0) + " different colors each. How many different pairings can be made if the shirt and tie must be different colors?";
				return ret;
			} else if (c.chance4() == 2) {
				String ret = Q4_2 + list.get(0) + " ?";
				return ret;
			} else if (c.chance4() == 3) {
				String ret = Q4_3 + list.get(0) + " books, " + list.get(1) + " of which are math, be arranged on a shelf with one math book on each end?";
				return ret;
			} else if (c.chance4() == 4) {
				String ret = Q4_4 + list.get(0) + " books, " + list.get(1) + " of which are math, be arranged on a shelf if the math books can't be next to each other?";
				return ret;
			} else if (c.chance4() == 5) {
				String ret = Q4_4 + list.get(0) + " books, " + list.get(1) + " of which are math, be arranged on a shelf if the math books must be one apart?";
				return ret;
			} else if(c.chance4() == 6)
			{
				String ret = Q4_5 + list.get(0) + "?";
				return ret;
			}else if (c.chance4() == 7)
			{
				String ret = Q4_6 + list.get(0) + "?";
				return ret;
			}else if(c.chance4() == 8)
			{
				String ret = Q4_7 + list.get(0) + "?";
				return ret;
			}

		} else if (c.getType() == 5) {

			Number[] nums = new Number[list.size()];
			for (int i = 0; i < list.size() - 1; i++) {
				nums[i] = new Int(Integer.parseInt(list.get(i)));
			}
			String chance = list.get(list.size() - 1);
			ret = LangUtility.populate("[num_0] [noun_0] numbered [num_1] through [num_2] are placed [container_0]. In how many ways can [num_3] [noun_0] be chosen, in order, [container_0_from] " + chance + "?", nums);
			return ret;
		}

		else {
			if (list.size() == 1) {
				ret = list.get(0) + "!";
				return ret;
			} else {
				ret = "P(" + list.get(0) + "," + list.get(1) + ")";
				return ret;
			}
		}
		return null;
	}

	public static String GetRearrangement() {
		ArrayList<String> arl = new ArrayList();
		arl.add("bottle");
		arl.add("chair");
		arl.add("computer");
		arl.add("window");
		arl.add("calculus");
		arl.add("algebra");
		arl.add("flap");
		arl.add("book");
		arl.add("oreo");
		arl.add("cheetos");
		arl.add("puppy");
		arl.add("flabby");
		arl.add("cat");
		arl.add("dougy");
		arl.add("caven");
		arl.add("Quinton");
		arl.add("angi");
		arl.add("robert");
		arl.add("glasses");
		arl.add("shoe");
		arl.add("soccer");
		arl.add("arms");
		arl.add("board");
		arl.add("zebra");
		arl.add("noodles");
		arl.add("bag");
		arl.add("map");
		arl.add("white");
		arl.add("blue");
		arl.add("green");
		arl.add("arctic");

		int r = Utilities.getRandomNumberInRange(0, 30);

		String anagram = arl.get(r);
		return anagram;
	}

}
