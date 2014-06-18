package CountingMultipleEvents;

import java.util.ArrayList;

import util.Utilities;
import util.Int;
import util.Number;
import util.lang.LangUtility;

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
		}else if(type == 6)
		{
			setType(6);
			type06();
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

		if(chance == 1)
		{

			String g = Integer.toString(numb);
			list.add(g);
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
		Can’t choose both number 0 and letter O
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


		int chance4 = Utilities.getRandomNumberInRange(1, 6);
		ArrayList<String> alphabet = new ArrayList<String>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		alphabet.add("E");
		alphabet.add("F");
		alphabet.add("G");
		alphabet.add("H");
		alphabet.add("I");
		alphabet.add("J");
		alphabet.add("K");
		alphabet.add("L");
		alphabet.add("M");
		alphabet.add("N");
		alphabet.add("O");
		alphabet.add("P");
		alphabet.add("Q");
		alphabet.add("R");
		alphabet.add("S");
		alphabet.add("T");
		alphabet.add("U");
		alphabet.add("V");
		alphabet.add("W");
		alphabet.add("X");
		alphabet.add("Y");
		alphabet.add("Z");

		if(chance4 == 1)
		{
			String s = "shirts";
			String t = "ties";
			int sNum = Utilities.getRandomNumberInRange(1, 10);
			int tNum = Utilities.getRandomNumberInRange(1, 10);
			int cNum = Utilities.getRandomNumberInRange(2, 10);

			list.add(s);
			list.add(t);
			list.add(Integer.toString(sNum));
			list.add(Integer.toString(tNum));
			list.add(Integer.toString(cNum)); 

		}else if(chance4 == 2)
		{
			String plate = "";
			while(plate.length() < 3)
				plate += alphabet.get(Utilities.getRandomNumberInRange(0, 25));
			while(plate.length() < 5)
			{
				int num = Utilities.getRandomNumberInRange(, max)
			}
		}else if(chance4 == 3)
		{

		}else if(chance4 == 4)
		{

		}else if(chance4 == 5)
		{

		}else
		{

		}


	}


	private void type05()
	{

		/** Type 05: Choosing with and without replacement
			Example context: 12 balls numbered 1 through 12 are placed in a bin. In how many ways can 3 balls be drawn, in order, from the bin
			if each ball remains outside the bin after it is drawn?
			if each ball is placed back into the bin if it is drawn?
			the first ball is replaced after it is drawn but the second ball remains outside the bin? **/

		Int size = new Int (Utilities.getRandomNumberInRange(5, 60));
		Int numItems = new Int (Utilities.getRandomNumberInRange(3,6));
		Number[] nums = {size, new Int(1), size, numItems };
		String an = LangUtility.populate("[num_0] [noun_0] numbered [num_1] through [num_2] are placed [container_0]. In how many ways can [num_3] [noun_0] be chosen, in order, [container_0_from]?", size, new Int(1), size, numItems);
		System.out.println(an);
	}


	private void type06()
	{
		int chance=Utilities.getRandomNumberInRange(1,2); 
		int answer =1;
		if(chance==1)
		{
			int chance1=Utilities.getRandomNumberInRange(1,10);
			list.add(Integer.toString(chance1));
			for(int i=0;i<chance1;i++)
			{
				answer*=chance1;
			}
			ans=answer;
		}
		else
		{
			int x = Utilities.getRandomNumberInRange(2, 10);
			int y = Utilities.getRandomNumberInRange(1, 10);
			list.add(Integer.toString(x));
			list.add(Integer.toString(y));
			
		}
	}
	private int anagramhelper(String s)
	{

		ArrayList al = new ArrayList();
		for(int i=0; i<s.length(); i++)
		{
			String st = s.substring(i,i+1);

			
			
			al.add(st);
				
		}
		int divideby=1;
		for(int x=0;x<al.size();x++)
		{
			int r = 0;
			String sr = s.substring(x,x+1);
			if(al.contains(sr))
			{
				for(int y=0;x<al.size();x++)
				{
					if(al.get(y).equals(sr))
						r++;
				}
				while(r>=1)
				{
					divideby = divideby*r;
					r--;
				}
				
			}
		
		}

		int numb = al.size();
		int answer=1;
		while(numb>=1)
		{
			answer = answer*numb;
			numb--;
		}

		int retans = answer/divideby;
		return retans;
		}



	private void setType(int t) 
	{
		type = t;
	}

	public int getType() {
		return type;

	}
	public boolean getAna()
	{
		return ana;
	}

}
