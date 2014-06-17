package CountingMultipleEvents;

import java.util.ArrayList;
import util.Utilities;
import util.Int;
import util.Number;

public class Context {
	private int type;
	private int ans;
	private ArrayList<String> list;
	private ArrayList<Number> list2;
	private int start;
	private boolean ana;

	private int length;

	public Context()
	{
		list = new ArrayList<String>();
		list2 = new ArrayList<Number>();
	}
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

	private void type01()
	{
		int chance = Utilities.getRandomNumberInRange(1,4);
		String noun1;
		String noun2;
		int num1;
		int num2;
		String action ="";
		if(chance == 1)
		{
			num1 = Utilities.getRandomNumberInRange(1,15);
			num2 = Utilities.getRandomNumberInRange(1,15);
			noun1 = "shirt";
			noun2 = "pair of pants";
			action = "arrange an outfit";
		}else if(chance == 2)
		{
			noun1 = "flavor";
			noun2 = "topping";
			num1 = Utilities.getRandomNumberInRange(1,15);
			num2 = Utilities.getRandomNumberInRange(1,15);
			action = "order";
		}else if(chance == 3)
		{
			noun1 = "language classe";
			noun2 = "art classe";
			num1 = Utilities.getRandomNumberInRange(1,15);
			num2 = Utilities.getRandomNumberInRange(1,15);
			action = "choose classes";
		}else{
			noun1 = "president";
			noun2 = "vice-president";
			num1 = Utilities.getRandomNumberInRange(1,15);
			num2 = Utilities.getRandomNumberInRange(1,15);
			action = "elect candidates";
		}

		list.add(Integer.toString(num1));
		list.add(noun1);
		list.add(Integer.toString(num2));
		list.add(noun2);
		list.add(action);
		ans = num1 * num2;

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


		Integer types=Utilities.getRandomNumberInRange(3, 5);
		Int init = new Int(start);
		for(int i=0;i<types;i++)
		{
			int i4=Utilities.getRandomNumberInRange(2,15);
			list.add(Integer.toString(i4));
			if(i==0)
				list.add("hat");
			if(i==1)
				list.add("sock");
			if(i==2)
				list.add("shoe");
			if(i==3)
				list.add("shirt");
			if(i==4)
				list.add("pant");

			list2.add(init.add(new Int(i4)));  
		}
		list.add("outfits");

		int count = 0;
		for(int i = 0; i < list2.size(); i++)
		{
			if(i==0)
			{
				Int i1 = (Int)(list2.get(i));
				int i2=i1.getValue();
				
				count=+i2;
			}
			else{
				Int i1 = (Int)(list2.get(i));
				int i2=i1.getValue();
			
				count*=i2;
			}

	
		}
		ans=count;

	}

	private void type03()

	{

		ana = false;
		int chance =Utilities.getRandomNumberInRange(1,2);

		int numb = Utilities.getRandomNumberInRange(4,10);
		String g = Integer.toString(numb);
		list.add(g);
		if(chance == 1)
		{

			int answer =1;
			while(numb>=1)
			{
				
				answer = answer*numb;
				numb--;
			}
			ans=answer;


		}
		else
		{
			String h = Question.GetRearrangement();
			ans = anagramhelper(h);
			list.add(h);
			ana = true;

		}


	}

	private void type04()
	{

		/**Type 04: Arrangements with restrictions
		Context: Have 1 shirt and 1 tie in each of 8 different colors. How many outfits can be made, if the shirt and tie must be different colors?
		Variation #1: Licence plates
		Can�t choose both number 0 and letter O
		3 letters + 2 even digits + 2 odd digits
		etc
		Variation #2: Books on a shelf
		6 books, 2 of which are math, arranged with math on ends of stack
		6 books, 2 of which are math, arranged with math books not next to each other
		6 books, 2 of which are math, arranged with math exactly 1 space apart
		Variation #3: Medals to Olympians
		Context: various sports
		Context: countries, with and without restrictions of how many times each country can win
		Variation #4: Student council
		President, Vice President, Secretary, Treasurer
		Boys vs Girls
		Variation #5: People on a sports team
		Example = Basketball - 1 center, 1 power forward, 1 shooting forward, 1 point guard, 1 shooting guard
		Do other sports**/



	}


	private void type05()
	{















	}



	private int anagramhelper(String s)
	{
		return s.length();	
	}


	private void setType(int t) {
		type = t;
	}

	public int getType() {
		return type;

	}

}
