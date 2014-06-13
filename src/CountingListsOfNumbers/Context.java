package CountingListsOfNumbers;

import java.util.ArrayList;

import util.Fraction;
import util.Int;
import util.Number;
import util.Root;
import util.Utilities;

public class Context {
	private int type;
	private int length;
	private ArrayList<Number> list;
	private int start;


	public Context()
	{
		list = new ArrayList<Number>();
	}


	public void generate(int type)
	{	
		start=Utilities.getRandomNumberInRange(1,1000);
		if(type ==  1)
		{
			setType(1);
			listGen1();
		}else if(type == 2)
		{
			setType(2);
			listGen2();
		}else if(type == 3)
		{
			setType(3);
			listGen3();
		}else if(type == 4)
		{
			setType(4);
			listGen4();
		}else if(type == 5)
		{
			setType(5);
			listGen5();
		}else if(type == 6)
		{
			setType(6);
			listGen6();
		}else if(type == 7)
		{
			setType(7);
			listGen7();
		}else if(type == 8)
		{
			setType(8);
			listGen8();
		}else if(type == 9)
		{
			setType(9);
			listGen9();
		}else if(type == 10)
		{
			setType(10);
			listGen10();
		}else if(type == 11)
		{
			setType(11);
			listGen11();
		}else if(type == 12)
		{
			setType(12);
			listGen12();
		}else if(type == 13)
		{
			setType(13);
			listGen13();
		}else if(type == 14)
		{
			setType(14);
			listGen14();
		}else if(type == 15)
		{
			setType(15);
			listGen15();
		}else if(type == 16)
		{
			setType(16);
			listGen16();
		}else if(type == 17)
		{
			setType(17);
			listGen17();
		}else if(type == 18)
		{
			setType(18);
			listGen18();
		}
	}

	public ArrayList<Number> getList()
	{
		return list;
	}

	public int getAns() 
	{
		return length; 
	}

	private void listGen1()
	{
		start = 1;
		length=Utilities.getRandomNumberInRange(5,998);
		Int init = new Int(start);
		list.add(init);
		list.add(init.add(new Int(1)));
		list.add(init.add(new Int(2)));
		list.add(init.add(new Int(3)));
		list.add(init.add(new Int(length-1)));
	}

	private void listGen2()
	{		
		start=Utilities.getRandomNumberInRange(1,994);
		length=Utilities.getRandomNumberInRange(5,999-start);
		Int init = new Int(start);
		list.add(init);
		list.add(init.add(new Int(1)));
		list.add(init.add(new Int(2)));
		list.add(init.add(new Int(3)));
		list.add(init.add(new Int(length-1)));
	}

	private void listGen3()
	{
		start = Utilities.getRandomNumberInRange(-1000,994);
		length=Utilities.getRandomNumberInRange(5,999-start);
		Int init = new Int(start);
		list.add(init);
		list.add(init.add(new Int(1)));
		list.add(init.add(new Int(2)));
		list.add(init.add(new Int(3)));
		list.add(init.add(new Int(length-1)));
	}

	private void listGen4()
	{
		start = Utilities.getRandomNumberInRange(-994,1000);
		length=Utilities.getRandomNumberInRange(5,Math.abs(-999-start));
		Int init = new Int(start);
		list.add(init);
		list.add(init.sub(new Int(1)));
		list.add(init.sub(new Int(2)));
		list.add(init.sub(new Int(3)));
		list.add(init.sub(new Int(length-1)));
	}

	private void listGen5()
	{
		start = Utilities.getRandomNumberInRange(2,10);
		int lengthRange = (1000/start)-1;
		length = Utilities.getRandomNumberInRange(2,lengthRange);
		int chance = Utilities.getRandomNumberInRange(1, 2);
		if(chance == 1)
		{
			list.add(new Int(start));
			list.add(new Int(start + start));
			list.add(new Int(start + start*2));
			list.add(new Int(start + start*3));
			list.add(new Int(start + start*(length-1)));
		}
		else
		{
			list.add(new Int(start));
			list.add(new Int(start - start));
			list.add(new Int(start - start*2));
			list.add(new Int(start - start*3));
			list.add(new Int(start - start*(length-1)));
		}

	}

	private void listGen6()
	{
		start = Utilities.getRandomNumberInRange(-199,199);
		int lengthRange = 1000/Math.abs((start));
		length = Utilities.getRandomNumberInRange(5,lengthRange);
		int chance = Utilities.getRandomNumberInRange(1, 2);
		if(chance == 1)
		{
			//increasing

			list.add(new Int(start));
			list.add(new Int(start + start));
			list.add(new Int(start + start*2));
			list.add(new Int(start + start*3));
			list.add(new Int(start + start*(length-1)));
		}else
		{
			//decreasing
			list.add(new Int(start));
			list.add(new Int(start - start));
			list.add(new Int(start - start*2));
			list.add(new Int(start - start*3));
			list.add(new Int(start - start*(length-1)));

		}
	}

	private void listGen7()
	{
		start = Utilities.getRandomNumberInRange(2,10);
		//How long should the list of unit fractions be?
		length = Utilities.getRandomNumberInRange(5,999);
		int chance = Utilities.getRandomNumberInRange(1,2);
		if(chance == 1)
		{
			list.add(new Fraction(1,start).simplify());
			list.add(new Fraction(1+1,start).simplify());
			list.add(new Fraction(1+2,start).simplify());
			list.add(new Fraction(1+3,start).simplify());
			list.add(new Fraction(1+length-1,start).simplify());
		}else
		{
			list.add(new Fraction(1,start).simplify());
			list.add(new Fraction(0,start).simplify());
			list.add(new Fraction(-1,start).simplify());
			list.add(new Fraction(-2,start).simplify());
			list.add(new Fraction(1-(length-1),start).simplify());
		}

	}

	private void listGen8()
	{
		start = Utilities.getRandomNumberInRange(2,10);
		length = Utilities.getRandomNumberInRange(15,25);
		int chance = Utilities.getRandomNumberInRange(1,2);
		int rand = Utilities.getRandomNumberInRange(1,10);
		if(chance == 1)
		{
			list.add(new Fraction(rand,start).simplify());
			list.add(new Fraction(rand+1,start).simplify());
			list.add(new Fraction(rand+2,start).simplify());
			list.add(new Fraction(rand+3,start).simplify());
			list.add(new Fraction(length,start).simplify());
		}else
		{
			list.add(new Fraction(-rand,start).simplify());
			list.add(new Fraction(-rand+1,start).simplify());
			list.add(new Fraction(-rand+2,start).simplify());
			list.add(new Fraction(-rand+3,start).simplify());
			list.add(new Fraction(-rand+length,start).simplify());	
		}

	}
	private void listGen9()
	{
		int g1 = Utilities.getRandomNumberInRange(1, 8);

		double r = Utilities.getRandomNumberInRange(2, 4);
		start = g1;

		length = Utilities.getRandomNumberInRange(5, 8);
		int end = (int) Math.pow(r, (double)length-1);

		int chance = Utilities.getRandomNumberInRange(1, 2);
		if(chance == 1)
		{
			list.add(new Int(start));
			list.add(new Int(start * (int) Math.pow(r, 1)));
			list.add(new Int(start * (int) Math.pow(r, 2)));
			list.add(new Int(start * (int) Math.pow(r, 3)));
			list.add(new Int(end));
		}
		else
		{
			list.add(new Int(start));
			list.add(new Int(start * (int) Math.pow(r, 1)* (int) Math.pow(-1, 1)));
			list.add(new Int(start * (int) Math.pow(r, 2)* (int) Math.pow(-1, 2)));
			list.add(new Int(start * (int) Math.pow(r, 3)* (int) Math.pow(-1, 3)));

			if(length %2 == 0)
				list.add(new Int(end*-1));
			else
				list.add(new Int(end));
		}
	}

	private void listGen10()
	{












	}

	private void listGen11()
	{
		int chance = Utilities.getRandomNumberInRange(1,2);
		start = Utilities.getRandomNumberInRange(1,20);
		length = Utilities.getRandomNumberInRange(1,20);
		if(chance == 1)
		{
			//increasing
			start = Utilities.getRandomNumberInRange(1,15);
			length = Utilities.getRandomNumberInRange(5, 20-start);
			list.add(new Int ((int)(Math.pow(start,2))));
			list.add(new Int ((int)(Math.pow(start+1,2))));
			list.add(new Int ((int)(Math.pow(start+2,2))));
			list.add(new Int ((int)(Math.pow(start+3,2))));
			list.add(new Int ((int)(Math.pow(length-1,2))));

		}else{
			//decreasing
			start = Utilities.getRandomNumberInRange(5,20);
			length = Utilities.getRandomNumberInRange(5, Math.abs(0-start));
			list.add(new Int ((int)(Math.pow(start,2))));
			list.add(new Int ((int)(Math.pow(start-1,2))));
			list.add(new Int ((int)(Math.pow(start-2,2))));
			list.add(new Int ((int)(Math.pow(start-3,2))));
			list.add(new Int ((int)(Math.pow(start-length-1,2))));
		}





	}

	private void listGen12()
	{

		start = Utilities.getRandomNumberInRange(1,5);
		length = Utilities.getRandomNumberInRange(start+4,10);
		int chance = Utilities.getRandomNumberInRange(1,2);

		if(chance == 1)
		{
			//increasing

			list.add(new Int((int) Math.pow(start, 3) ));
			list.add(new Int((int) Math.pow(start+1, 3) ));
			list.add(new Int((int) Math.pow(start+2, 3) ));
			list.add(new Int((int) Math.pow(start+3, 3) ));
			list.add(new Int((int) Math.pow(length, 3) ));
		}else
		{
			list.add(new Int((int)Math.pow(-start, 3) ));
			list.add(new Int((int) Math.pow(-start-1, 3) ));
			list.add(new Int((int) Math.pow(-start-2, 3) ));
			list.add(new Int((int) Math.pow(-start-3, 3) ));
			list.add(new Int((int) Math.pow(-length, 3) ));
		}
	}

	private void listGen13()
	{

		start = 1;
		length=Utilities.getRandomNumberInRange(5,1000);
		int i= 1;
		int i1=1;
		while(i%i1==0)
		{
			i=Utilities.getRandomNumberInRange(1,15);
			i1=Utilities.getRandomNumberInRange(1,15);
		}


	}

	private void listGen14()
	{
<<<<<<< HEAD
<<<<<<< HEAD
		int int1 = Utilities.getRandomNumberInRange(1,15);
		int int2 = Utilities.getRandomNumberInRange(1,15);
=======
<<<<<<< HEAD
		int int1 = Utilities.getRandomNumberInRange(min, max);
		int int2 = Utilities.getRandomNumberInRange(min,max);

=======
		int int1 = Utilities.getRandomNumberInRange(1, 69);
		int int2 = Utilities.getRandomNumberInRange(420,500);
>>>>>>> origin/master
	
>>>>>>> FETCH_HEAD
=======
		int int1 = Utilities.getRandomNumberInRange(1, 69);
		int int2 = Utilities.getRandomNumberInRange(420,500);

>>>>>>> 849ea3cbf2448367dd49a9948bbcf61aac3acf6b
	}

	private void listGen15()
	{












	}
	private void listGen16()
	{
		start = Utilities.getRandomNumberInRange(2,10);
		int lengthRange = (1000/start)-1;
		length = Utilities.getRandomNumberInRange(2,lengthRange);
		int chance = Utilities.getRandomNumberInRange(1, 2);
		list.add(new Int(start));
		list.add(new Fraction(start,start).simplify());
		list.add(new Fraction(start,start*2).simplify());
		list.add(new Fraction(start,start*3).simplify());
		list.add(new Fraction(start,start*length-1).simplify());
	}

	private void listGen17()
	{
		start = Utilities.getRandomNumberInRange(2,10);
		int lengthRange = (1000/start)-1;
		length = Utilities.getRandomNumberInRange(2,lengthRange);
		int chance = Utilities.getRandomNumberInRange(1, 2);
		list.add(new Fraction(1,start).simplify());
		list.add(new Fraction(1,start*2).simplify());
		list.add(new Fraction(1,start*3).simplify());
		list.add(new Fraction(1,start*4).simplify());
		list.add(new Fraction(1,start*(length-1)).simplify());
	}

	private void listGen18()
	{
		int rNum = Utilities.getRandomNumberInRange(1, 10);
		int rDen = Utilities.getRandomNumberInRange(1, 8);
		int g1 = Utilities.getRandomNumberInRange(1, 20);
		Fraction r = new Fraction(rNum, rDen);
		int start = g1;
		int end = 0;

		int chance = Utilities.getRandomNumberInRange(1, 2);
		if(chance == 1)
		{
			list.add(new Int(start));
			list.add(new Int(start * (int) Math.pow(r, 1)));
			list.add(new Int(start * (int) Math.pow(r, 2)));
			list.add(new Int(start * (int) Math.pow(r, 3)));
			list.add(new Int(end));
		}
		else
		{
			list.add(new Int(start));
			list.add(new Int(start * (int) Math.pow(r, 1)* (int) Math.pow(-1, 1)));
			list.add(new Int(start * (int) Math.pow(r, 2)* (int) Math.pow(-1, 2)));
			list.add(new Int(start * (int) Math.pow(r, 3)* (int) Math.pow(-1, 3)));

			if(length %2 == 0)
				list.add(new Int(end*-1));
			else
				list.add(new Int(end));
		}

	}

	private void setType(int t)
	{
		type = t;
	}

	public int getType()
	{
		return type;

	}
<<<<<<< HEAD

}
=======
}


>>>>>>> 849ea3cbf2448367dd49a9948bbcf61aac3acf6b

