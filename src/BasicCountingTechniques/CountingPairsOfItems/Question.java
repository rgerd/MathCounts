package BasicCountingTechniques.CountingPairsOfItems;

import util.lang.LangUtil;

public class Question extends com.Question {
	private static String[] questions = new String[6];
	static {
		questions[0] = "A tournament for [sport_0] is being held at a school. If each team plays every other team exactly one time and there are [num_0] [sport_0] teams, how many matches will be held?";
		questions[1] = "Compute the sum of 1 + 2 + 3 + 4 + ... [num_0] of the first [num_1] positive integers.";
		questions[3] = "A [club_0] club has [num_0] members and needs to choose 2 members to be co-presidents. In how many ways can the club choose co-presidents?";
		questions[4] = "A sports conference has [num_0] teams in 2 divisions of [num_1]. How many games are in a complete season for the conference if each team must play every other team in its own division twice and every team in the other division once?";
	}

	public String getQ(com.Context _c) {
		Context c = (Context) _c;
		if(c.getType() == 3)
		{
			if(c.chance() == 4)
			{
				String i = "How many diagonals does a convex quadrilateral have?";
				return LangUtil.populate(i, c.getList());
			}
			if(c.chance() == 5)
			{
				String i = "How many diagonals does a convex pentagon have?";
				return LangUtil.populate(i, c.getList());
			}
			if(c.chance() == 6)
			{
				String i = "How many diagonals does a convex hexagon have?";
				return LangUtil.populate(i, c.getList());
			}
			if(c.chance() == 7)
			{
				String i = "How many diagonals does a convex heptagon have?";
				return LangUtil.populate(i, c.getList());
			}
			if(c.chance() == 8)
			{
				String i = "How many diagonals does a convex octagon have?";
				return LangUtil.populate(i, c.getList());
			}
			if(c.chance() == 9)
			{
				String i = "How many diagonals does a convex nonagon have?";
				return LangUtil.populate(i, c.getList());
			}
			if(c.chance() == 10)
			{
				String i = "How many diagonals does a convex decagon have?";
				return LangUtil.populate(i, c.getList());
			}
			if(c.chance() == 11)
			{
				String i = "How many diagonals does a convex 11-gon have?";
				return LangUtil.populate(i, c.getList());
			}
			if(c.chance() == 12)
			{
				String i = "How many diagonals does a convex dodecagon have?";
				return LangUtil.populate(i, c.getList());
			}
			if(c.chance() == 13)
			{
				String i = "How many diagonals does a convex 13-gon have?";
				return LangUtil.populate(i, c.getList());
			}
			if(c.chance() == 14)
			{
				String i = "How many diagonals does a convex 14-gon have?";
				return LangUtil.populate(i, c.getList());
			}
			if(c.chance() == 15)
			{
				String i = "How many diagonals does a convex 15-gon have?";
				return LangUtil.populate(i, c.getList());
			}
		}
		if(c.getType() == 6)
		{
			if(c.chance() == 1)
				return LangUtil.populate("What is the sum of the first [num_0] even integers?", c.getList());
			else if(c.chance() == 2)
				return LangUtil.populate("What is the sum of the first [num_0] odd integers?", c.getList());
			else 
				return LangUtil.populate("What is the sum of the first [num_0] multiples of [num_1]?", c.getList());
		}else
		return LangUtil.populate(questions[c.getType() - 1], c.getList());
	}
}
