package CountingMultipleEvents;

import java.util.ArrayList;
import util.Utilities;

public class Context {
	private int type;
	private int ans;
	private ArrayList<String> list;

	public void generate(int type) {
		if (type == 1) {
			setType(1);
			type01();
		}else if(type == 2)
		{
			setType(2);
			type02();
		}else if(type == 3)
		{
			setType(3);
			type03();
		}else if(type == 4)
		{
			setType(4);
			type04();
		}else if(type == 5)
		{
			setType(5);
			type05();
		}
	}

	public ArrayList<String> getList() {
		return list;
	}

	public int getAns() {
		return ans;

	}


	public String getContext(int op, String problem)
	{
		if(op==1)
		{

		}
		return null;
	}
	private void type01()
	{
		
		/**Question format: You have (#1) (attribute #1)s and (#2) (attribute #2)s. How many ways can you choose a (collection) consisting of 1 (attribute #1) and 1 (attribute #2)?
				Context: shirts and pants make an outfit
				Variation #1: flavors + toppings on ice cream
				Variation #2: electives - language classes + art classes
				Variation #3: president and vice president**/

	}
	private void type02()

	{

		/**
	Same as previous type, but with more options to fill
	Example: In how many ways can we form an international commission if we must choose one European country from among 6 European countries, one Asian country from among 4, one North American Country from among 3, and one African country from among 7?
	Variation #1: choose animals for a zoo
	Variation #2: choose topping types for ice cream (types of fruit + types of nuts + types of candies + types of sauce)
	Variation #3: license plate combinations
	context will involve types of restrictions
	restriction: 3 letters + 4 numbers
	restriction: 2 letters + 3 numbers + 2 letters

		 **/
	}

	private void type03()

	{
		
		int chance = Utilities.getRandomNumberInRange(1,2);
		start = Utilities.getRandomNumberInRange(1,20);
		if(chance == 1)
		{
			int numb = Utilities.getRandomNumberInRange(1,10);
			int answer;
			while(numb>=1)
			{
				answer = answer*numb;
				numb--;
			}
			ans=answer;
			
			
		}
		else
		{
			
			ans = anagramhelper(Question.GetRearrangement());
		}
			
		
		/**Question format: In how many ways can I arrange (#1) (objects) on a shelf?
					Context: Books on a shelf
					Variation #1: Students in a line to buy a ticket for (event)
						Variation #2: Courses in a schedule
						Variation #3: Anagrams of a word **/

		/**
		 * Same as previous type, but with more options to fill Example: In how
		 * many ways can we form an international commission if we must choose
		 * one European country from among 6 European countries, one Asian
		 * country from among 4, one North American Country from among 3, and
		 * one African country from among 7? Variation #1: choose animals for a
		 * zoo Variation #2: choose topping types for ice cream (types of fruit
		 * + types of nuts + types of candies + types of sauce) Variation #3:
		 * license plate combinations context will involve types of restrictions
		 * restriction: 3 letters + 4 numbers restriction: 2 letters + 3 numbers
		 * + 2 letters
		 **/
	}
	
	private void type04()
	{
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	private void type05()
	{
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	


	private int anagramhelper(String s)
	{
		
	}


	private void setType(int t) {
		type = t;
	}

	public int getType() {
		return type;

	}

}
