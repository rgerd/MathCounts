package CountingMultipleEvents;

import java.util.ArrayList;

import util.Int;
import util.Utilities;
import util.lang.LangUtility;
import util.Number;



public class Question {
	private static final String Q1 = "You have ";
	private static final String Q3 = "In how many ways can I arrange ";
	private static final String QANA = "How many different arrangements of the word ";
	private static final String Q4_1 = "You have 1 shirt and 1 tie in ";
	private static final String Q4_2 = "In how many ways can the following license plate be arranged: ";
	private static final String Q4_3 = "How many ways can ";
	private static final String Q4_4 = "How many ways can ";
	private String ret;

	public String getQ (Context c)
	{
		ArrayList<String> list = c.getList();

		if(c.getType() == 1)
		{
			String ret = Q1 +  list.get(0) + " " + list.get(1) + "  and " + list.get(2) + " " + list.get(3) + ". How many ways can you " + list.get(4) +  " consisting of 1 " + list.get(1) + " and 1 " + list.get(3) + "?";
			return ret;
		}
		else if(c.getType()==2)
		{ 
			System.out.println(list);
			if(list.size()==7)
			{
				String ret = Q1 +  list.get(0) + " " + list.get(1) + "(s)  and " + list.get(2) + " " + list.get(3)+ "(s)  and " +  list.get(4) + " " + list.get(5) + "(s). How many ways can you choose a(n) "  + list.get(6) +  " consisting of 1 " + list.get(1) + " and 1 " + list.get(3) +" and 1 " + list.get(5) + "?";
				return ret;
			}
			else if(list.size()==9){
				String ret = Q1 +  list.get(0) + " " + list.get(1) + "(s)  and " + list.get(2) + " " + list.get(3)+ "(s)  and " +  list.get(4) + " " + list.get(5) +"(s)  and " +  list.get(6) + " " + list.get(7) + "(s). How many ways can you choose a(n) "  + list.get(8) +  " consisting of 1 " + list.get(1) + " and 1 " + list.get(3) +" and 1 " + list.get(5) +" and 1 " + list.get(7) + "?";
				return ret;
			}
			else if (list.size() == 11){ 
				String ret = Q1 +  list.get(0) + " " + list.get(1) + "(s)  and " + list.get(2) + " " + list.get(3)+ "(s)  and " +  list.get(4) + " " + list.get(5) +"(s)  and " +  list.get(6) + " " + list.get(7) +"(s)  and " +  list.get(8) + " " + list.get(9) + "(s). How many ways can you choose a(n) "  + list.get(10) +  " consisting of 1 " + list.get(1) + " and 1 " + list.get(3) +" and 1 " + list.get(5) +" and 1 " + list.get(7) +" and 1 " + list.get(9) + "?";
				return ret;
			}

		}

		else if(c.getType()==3)
		{
			String ret = Q3 + list.get(0) + " books on a shelf?";

			if(c.getAna())
			{
				ret = QANA + list.get(0) + " can you make?";
			}
			return ret;

		}
		else if(c.getType() == 4)
		{
			if(c.chance4() == 1)
			{
				String ret = Q4_1 + list.get(0) + " different colors each. How many different pairings can be made if the shirt and tie must be different colors?";
				return ret;
			}else if(c.chance4() == 2)
			{
				String ret = Q4_2 + list.get(0) + " ?";
				return ret;
			}else if(c.chance4() == 3)
			{
				String ret = Q4_3 + list.get(0) + " books, " + list.get(1) + " of which are math, be arranged on a shelf with one math book on each end?";
				return ret;
			}else if(c.chance4() == 4)
			{
				String ret = Q4_4 + list.get(0) + " books, " + list.get(1) + " of which are math, be arranged"
			}

			
		}else if(c.getType() == 5){

			Number[] nums = new Number[list.size()];
			for(int i = 0; i < list.size() -1; i++)
			{
				nums[i] = new Int(Integer.parseInt(list.get(i)));
			}
			String chance = list.get(list.size()-1);
			ret = LangUtility.populate("[num_0] [noun_0] numbered [num_1] through [num_2] are placed [container_0]. In how many ways can [num_3] [noun_0] be chosen, in order, [container_0_from] "+chance+"?", nums);
			return  ret;
		}
		
		else 
		{
			if(list.size()==1)
			{
				ret=list.get(0)+"!";
				return  ret;
			}
			else
			{
				ret="P("+list.get(0)+","+list.get(1)+")";
				return ret;
			}
		}
		return null;
	}
	public static String GetRearrangement()
	{
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
<<<<<<< HEAD

=======
>>>>>>> FETCH_HEAD
		arl.add("arctic");
		
		int r =Utilities.getRandomNumberInRange(0,30);

		
<<<<<<< HEAD

		
=======
>>>>>>> FETCH_HEAD
		String anagram = arl.get(r);
		return anagram;
	}

}

