package BasicCountingTechniques.ConstructiveCounting;

import java.util.ArrayList;

import util.Number;
import util.*;

public class Context extends com.Context {
	private Number ans;
	private ArrayList<Number> list;
	private int chance;

	public Context(){
		list = new ArrayList<Number>();
	}
	public Number getAnswer() {
		return ans;
	}


	public ArrayList<Number> getList() {
		return list;
	}

	private void gen1()
	{
		chance = Util.getRandomNumberInRange(1,2);
		if(chance == 1)
		{
			int numDigits = Util.getRandomNumberInRange(2,4);
			if(numDigits == 2)
			{
				ans = new Int(9);
			}else if(numDigits == 3)
			{
				ans = new Int(9 *(8 + 9));
			}else if(numDigits == 4)
			{
				ans = new Int((81 + (18 * 8)) * 9);
			}
			list.add(new Int(numDigits));
		}else if(chance == 2)
		{
			int times = Util.getRandomNumberInRange(2,4);
			int digits = Util.getRandomNumberInRange(3,4);

			ans = new Int(2 * ((int) Math.pow(9, digits - 3)) * 10 * (9/times));
			list.add(new Int(digits));
			list.add(new Int(times));
		}
	}

	private void gen2() {
		int length = Util.getRandomNumberInRange(5, 9);
		int lower = Util.getRandomNumberInRange(0,2);
		int upper = Util.getRandomNumberInRange(5,9);
		int possibilities = upper - lower - 1;
		list.add(new Int(lower));
		list.add(new Int(upper));
		list.add(new Int(length));
		ans = new Int(possibilities * ((possibilities - 1) * length));
	}


	private void gen3() {
		int original = Util.getRandomNumberInRange(400,600);
		Int length = new Int(original/2);
		int x = 1;
		int answer = 0;
		while(Math.round((double) x) < (length.getValue() + (x/2)))
		{
			answer += (((int) (length.getValue() + x/2)) - x);
			x++;
		}
		ans = new Int(answer);
		list.add(new Int(original));
	}

	private void gen4() {
		int num1 = Util.getRandomNumberInRange(1,3);
		int num2 = Util.getRandomNumberInRange(1,3);
		list.add(new Int(num1));
		list.add(new Int(num2));
		int answer = 1;

		while(num1 > 0)
		{
			answer *= (26 - num1 + 1);
			num1--;
		}while(num2 > 0)
		{
			answer *= (9 - num2 + 1);
			num2--;
		}
		ans = new Int(answer);

	}

	private void gen5()
	{
		chance = 2;
		int answer = 0;
		if(chance == 1)
		{
			int digit1 = Util.getRandomNumberInRange(0,1);
			int digit2 = Util.getRandomNumberInRange(digit1+1,2);
			if(digit2 == 1)
			{
				list.add(new CustomNumber("second"));
			}else
			{
				list.add(new CustomNumber("first"));
			}
			if(digit1 == 0)
			{
				list.add(new CustomNumber("third"));
			}else
			{
				list.add(new CustomNumber("second"));
			}
			for(int i = 100; i < 1000; i++)
			{
				int temp = i;
				ArrayList<Integer> digits = new ArrayList<Integer>();
				while(temp > 0)
				{
					digits.add(temp % 10);
					temp = temp/10;
				}
				if(digits.get(digit2) >= digits.get(digit1) * 2)
				{
					System.out.println("digit2: " + digits.get(digit2)  + " digit1: " + digits.get(digit1));
					answer++;
				}
			}
		}else if(chance == 2)
		{
			int sumDigit = Util.getRandomNumberInRange(0,2);
			int addDigit1 = 0;
			int addDigit2 = 0;
			if(sumDigit == 0)
			{
				list.add(new CustomNumber("hundreds"));
				list.add(new CustomNumber("tenths"));
				list.add(new CustomNumber("units"));
				addDigit1 = 1;
				addDigit2 = 2;
			}else if(sumDigit == 1)
			{
				list.add(new CustomNumber("hundreds"));
				list.add(new CustomNumber("units"));
				list.add(new CustomNumber("tenths"));
				addDigit1 = 0;
				addDigit2 = 2;
			}
			else {
				list.add(new CustomNumber("units"));
				list.add(new CustomNumber("tenths"));
				list.add(new CustomNumber("hundreds"));
				addDigit1 = 0;
				addDigit2 = 1;
			}

			for(int i = 100; i < 1000; i++)
			{
				int temp = i;
				ArrayList<Integer> digits = new ArrayList<Integer>();
				while(temp > 0)
				{
					digits.add(temp % 10);
					temp = temp/10;
				}
				if(digits.get(sumDigit) == (digits.get(addDigit1) + digits.get(addDigit2)))
				{
					answer++;
				}
			}
		}
		ans = new Int(answer);
	}

	private void gen6()
	{
		int length = Util.getRandomNumberInRange(4,7);
		int temp = length;
		int answer = 0;
		chance = Util.getRandomNumberInRange(1,5);
		list.add(new Int(length));
		if(chance == 1)
		{
			if(temp % 2 == 0)
			{
				answer += Math.pow(4,(temp/2)) * Math.pow(5,(temp/2));
				answer *= 2;
			}else
			{
				answer += 5*(temp/2) + 4 * (temp - (temp/2));
				answer += 4*(temp/2) + 5 * (temp - (temp/2));
			}
		}else if(chance == 2)
		{
			list.add(new Int(length));
			answer = (int)Math.pow(5, length);
		}else if(chance == 3)
		{
			list.add(new Int(length));
			answer = (int)Math.pow(4,length);
		}else if(chance == 4)
		{
			list.add(new Int(length));
			answer = (length/3 * 4) + (5*(length - length/2)) * 3;
		}else
		{
			int secondChance = Util.getRandomNumberInRange(1,3);
			list.add(new Int(secondChance));
			int digits = Util.getRandomNumberInRange(3,5);
			if(secondChance == 1)
			{

				answer = (int) Math.pow(5, digits);
			}else if(secondChance == 2){
				answer = (int) Math.pow(4, digits);
			}else if(secondChance == 3)
			{
				answer = (int) ( Math.pow(5,digits) + Math.pow(4,digits));
			}
		}
		ans = new Int(answer);
	}

	private void gen7()
	{
		int length = Util.getRandomNumberInRange(50, 100);
		int combos = 0;
		for(int i = 1; i < (length/i); i++)
		{
			for(int a = length; a > (i * (i+1)); a--)
			{
				combos += Math.ceil(((double)a/(double)i)) -(i+1);
			}
		}
		list.add(new Int(length));
		ans = new Int(combos);
	}
	public int getChance()
	{
		return chance;
	}

}
