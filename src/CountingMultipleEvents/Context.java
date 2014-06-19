package CountingMultipleEvents;

import java.util.ArrayList;

import util.Utilities;
import util.Int;
import util.Number;

public class Context extends com.Context {
	private int ans;
	private ArrayList<String> list;
	private ArrayList<Number> list2;
	private int start;
	private boolean ana;
	private int chance4;

	public Context()
	{
		list = new ArrayList<String>();
		list2 = new ArrayList<Number>();
	}

	public ArrayList<String> getList() {
		return list;
	}

	public int getAns() {



		return ans; 


	}

	private void gen1()
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
			noun1 = "language classes";
			noun2 = "art classes";
			num1 = Utilities.getRandomNumberInRange(1,15);
			num2 = Utilities.getRandomNumberInRange(1,15);
			action = "choose classes";
		}else{
			noun1 = "presidential candidates";
			noun2 = "vice-presidential candidates";
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
	private void gen2()

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

	private void gen3()

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

	private void gen4()
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


		chance4 = Utilities.getRandomNumberInRange(1, 5);
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
			int cNum = Utilities.getRandomNumberInRange(2, 10);
			list.add(Integer.toString(cNum)); 
			ans = cNum * (cNum-1);

		}else if(chance4 == 2)
		{
			String plate = "";
			while(plate.length() < 3)
				plate += alphabet.get(Utilities.getRandomNumberInRange(0, 25));
			while(plate.length() < 5)
			{
				int num = Utilities.getRandomNumberInRange(0, 9);
				if(num == 0)
				{
					if(!plate.contains("O"))
						plate += num;
				}
				else
				{
					if(num % 2 == 0)
						plate+= num;
				}
			}
			while(plate.length() < 7)
			{
				int num = Utilities.getRandomNumberInRange(1, 9);
				if(num %2 != 0)
					plate+=num;
			}
			list.add(plate);

			ans = anagramhelper(plate);

		}else if(chance4 == 3)
		{
			int numBooks = Utilities.getRandomNumberInRange(3, 10);
			String numMbooks = "2";
			list.add(numBooks + "");
			list.add(numMbooks);


			numBooks -=2;
			int num = numBooks;

			for(int i = 1; i < numBooks; i++)
			{

				num = num*(numBooks-i);

			}


			ans = num*2;

		}else if(chance4 == 4)
		{
			int numBooks = Utilities.getRandomNumberInRange(3, 10);
			String numMbooks = "2";
			list.add(numBooks + "");
			list.add(numMbooks);

			int n = numBooks;
			for(int i = 1; i < numBooks; i++)
			{
				n = n*(numBooks-i);
			}

			int answer = n/2;

			int num = numBooks -2;
			int n1 = num;
			for(int i = 1; i < num; i++)
			{
				n1 = n1 * (num - i);
			}

			n1 = (numBooks-1) * n1;

			ans = answer - n1;
		}else if(chance4 == 5)
		{
			int numBooks = Utilities.getRandomNumberInRange(3, 10);
			String numMbooks = "2";
			list.add(numBooks + "");
			list.add(numMbooks);

			int num = numBooks -2;
			int n = num;

			for(int i = 1; i < num; i++)
			{
				n = n*(num-i);
			}

			ans = (numBooks-2)*n;
		}else if(chance4 == 6)
		{
			int studentPop = Utilities.getRandomNumberInRange(100, 999);
			int n = studentPop;
			int k = studentPop-4;
			
			for(int i = 1; i < studentPop; i++)
			{
				n = n*(studentPop-i);
			}
			for(int i = 1; i < studentPop-4; i++)
			{
				k = k*(studentPop -4 -i);
			}
			
			ans = n/k;
		}

	}


	private void gen5()
	{

		/** Type 05: Choosing with and without replacement
			Example context: 12 balls numbered 1 through 12 are placed in a bin. In how many ways can 3 balls be drawn, in order, from the bin
			if each ball remains outside the bin after it is drawn?
			if each ball is placed back into the bin if it is drawn?
			the first ball is replaced after it is drawn but the second ball remains outside the bin? **/

		Int size = new Int (Utilities.getRandomNumberInRange(5, 60));
		Int numItems = new Int(3);
		int chance = Utilities.getRandomNumberInRange(1,3);
		String question = "";
		if(chance == 1)
		{
			ans = (int) Math.pow(size.getValue(), numItems.getValue());
			question = "if each [noun_0_sng] is placed back into the [container_0] after it is drawn?";
		}else if(chance == 2)
		{
			ans = 1;
			for(int i = 0; i < (numItems.getValue()); i++){
				ans *= ((size.getValue())-i); 
			}
			question = "if each [noun_0_sng] remains outside the [container_0] after it is drawn?";

		}else
		{
			ans = size.getValue();
			for(int i = 0; i < 2; i++){
				ans *= ((size.getValue())-i); 
			}
			question = "if the first [noun_0_sng] is replaced after it is drawn but the second [noun_0_sng] remains outside the [container_0]?";

		}
		list.add(Integer.toString(size.getValue()));
		list.add("1");
		list.add(Integer.toString(size.getValue()));
		list.add(Integer.toString(numItems.getValue()));
		list.add(question);

	}


	private void gen6()
	{
		int chance=Utilities.getRandomNumberInRange(1,2); 
		int answer =1;
		int answer1=1;
		if(chance==1)
		{
			int chance1=Utilities.getRandomNumberInRange(1,10);
			list.add(Integer.toString(chance1));
			for(int i=0;i<chance1;i++)
			{
				answer*=i+1;
			}
			ans=answer;
		}
		else
		{
			int x=0;
			int y=1;
			while(x<y)
			{
				x = Utilities.getRandomNumberInRange(2, 10);
				y = Utilities.getRandomNumberInRange(1, 10);
			}
			list.add(Integer.toString(x));
			list.add(Integer.toString(y));
			for(int i=0;i<x;i++)
			{
				answer*=i+1;
			}
			for(int i=0;i<y;i++)
			{
				answer1*=i+1;
			}
			answer/=answer1;
			ans=answer;
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
		int r=0;
		for(int x=0;x<al.size();x++)
		{
			r = 0;
			String sr = s.substring(x,x+1);

			for(int y=0;y<al.size();y++)
			{

				if(al.get(y).equals(sr))
				{
					r++;
					al.set(y, "*");
				}

			}
			while(r>=1)
			{
				divideby = divideby*r;
				r--;

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

	public boolean getAna()
	{
		return ana;
	}

	public int chance4()
	{
		return chance4;
	}
}
