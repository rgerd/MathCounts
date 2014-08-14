package BasicCountingTechniques.Casework;

import util.lang.LangUtil;

public class Question extends com.Question {
	private static String[] questions = new String[9];
	static {
		questions[0] = "On the island of [civilization_0], the [civilization_0] alphabet has only [num_0] letters, [num_1], and every word in the [civilization_0] language has no more than [num_2] letters in it. How many words are possible?";
		questions[1] = "The [civilization_0] decide to change their laws to only allow words that contain the letter [num_0] at least once. But they still limit their words to [num_1] letters or less, and they wish to use only letters [num_2].";
		questions[2] = "At a [foodshop_0] shop, you can order your [toppings_0] [foodshop_0_pl] in [num_1] sizes, with or without [toppings_1_pl], and you get your choice of [num_0] different types of [toppings_2_pl]. How many different [toppings_0] [foodshop_0_pl] are there?";
		questions[3] = "How many pairs of positive integers (m,n) satisfy m^2 + n < [num_0]";
		questions[4] = "I have 2 hats. In one hat are [chap2casework5_0_pl] numbered 1 through [num_0]. In the next hat are [chap2casework5_0_pl] numbered [num_1] through [num_2]. If I first choose a hat, then from that hat I choose [num_3] [chap2casework5_0_pl] without replacing the [chap2casework5_0_pl] between selections. How many different ordered selections of [num_3] [chap2casework5_0_pl] are possible?";
		questions[5] = "<p><img src=\"https://parktudor.blackboard.com/bbcswebdav/xid-530[num_0]_1\" width=\"[num_1]\" height=\"[num_2]\" /><br>";
		questions[6] = "How many non-congruent triangles can be formed by connecting 3 of the vertices of a [num_0]-sided polygon?";
	}

	public String getQ(com.Context _c) {
		Context c = (Context) _c;
		if(c.getType() == 6)
		{
			if(c.chance() == 1)
			{
				String str = questions[5] + " The figure represents a road map between 4 villages, labeled A, B, C, and D. The arrows indicate paths between various villages. There are [num_3] paths from village A to village B, [num_4] paths from village B to village D, [num_5] paths from village A to village C, and [num_6] paths from village C to village D. How many ways are there to go from A to D along the paths, if you can only move along a path in the direction indicated?";
				return LangUtil.populate(str, c.getList());
			}else if(c.chance() == 2)
			{
				String str = questions[5] + " The figure represents a road map between 5 villages, labeled A, B, C, D, and E. The arrows indicate paths between various villages. There are [num_3] paths from village A to village B, [num_4] paths from village A to village C, [num_5] paths from village A to village D, [num_6] paths from village B to village E, [num_7] paths from village C to village E, and [num_8] paths from village D to village E. How many ways are there to go from A to E along the paths, if you can only move along a path in the direction indicated?";
				return LangUtil.populate(str, c.getList());
			}else if(c.chance() == 3)
			{
				String str = questions[5] + " The figure represents a road map between 5 villages, labeled A, B, C, D, and E. The arrows indicate paths between various villages. There are [num_3] paths from village A to village B, [num_4] paths from village A to village C, [num_5] paths from village A to village D, [num_6] paths from village B to village C, [num_7] paths from village C to village E, and [num_8] paths from village D to village E. How many ways are there to go from A to E along the paths, if you can only move along a path in the direction indicated?";
				return LangUtil.populate(str, c.getList());
			}else if(c.chance() == 4)
			{
				String str = questions[5] + " The figure represents a road map between 6 villages, labeled A, B, C, D, E, and F. The arrows indicate paths between various villages. There are [num_3] paths from village A to village B, [num_4] paths from village A to village D, [num_5] paths from village B to village C, [num_6] paths from village D to village C, [num_7] paths from village C to village E, [num_8] paths from village D to village E, and [num_9] paths from E to village F. How many ways are there to go from A to F along the paths, if you can only move along a path in the direction indicated?";
				return LangUtil.populate(str, c.getList());
			}else if(c.chance() == 5)
			{
				String str = questions[5] + " The figure represents a road map between 7 villages, labeled A, B, C, D, E, F, and G. The arrows indicate paths between various villages. There are [num_3] paths from village A to village B, [num_4] paths from village A to village C, [num_5] paths from village B to village D, [num_6] paths from village C to village D, [num_7] paths from village D to village F, [num_8] paths from village D to village E, [num_9] paths from F to village G, and [num_10] paths from E to village G. How many ways are there to go from A to G along the paths, if you can only move along a path in the direction indicated?";
				return LangUtil.populate(str, c.getList());
			}
			return null;
				
		}else if(c.getType() == 7)
		{
			if(c.chance() == 1)
			{
				String i =  "How many non-congruent triangles can be formed by connecting 3 of the vertices of a quadrilateral?"; 
				return LangUtil.populate(i, c.getList());
			}
			else if(c.chance() == 2)
			{
				String i = "How many non-congruent triangles can be formed by connecting 3 of the vertices of a pentagon?"; 
				return LangUtil.populate(i, c.getList());
			}
			else if(c.chance() == 3)
			{
				String i = "How many non-congruent triangles can be formed by connecting 3 of the vertices of a hexagon?"; 
				return LangUtil.populate(i, c.getList());
			}
			else if(c.chance() == 4)
			{
				String i = "How many non-congruent triangles can be formed by connecting 3 of the vertices of a octagon?"; 
				return LangUtil.populate(i, c.getList());
			}
			else if(c.chance() == 5)
			{
				String i = "How many non-congruent triangles can be formed by connecting 3 of the vertices of a decagon?"; 
				return LangUtil.populate(i, c.getList());
			}
			else
			{
				String i = "How many non-congruent triangles can be formed by connecting 3 of the vertices of a dodecagon?"; 
				return LangUtil.populate(i, c.getList());
			}
		}else if(c.getType() == 8)
		{
			if(c.chance() == 1)
			{
				String i = "A [num_0]X[num_1] grid is made up of equally spaced dots. How many squares of any size can be formed by connecting the dots in the grid?";
				return LangUtil.populate(i, c.getList());
			}
			else
			{
				String i = "A [num_0]X[num_1] grid is made up of equally spaced dots. How many rectangles of any size can be formed by connecting the dots in the grid?";
				return LangUtil.populate(i, c.getList());
			}
		}else
			return LangUtil.populate(questions[c.getType() - 1], c.getList());
	}
}
