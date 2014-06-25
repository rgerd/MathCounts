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
				ans = new Int(9*2);
			}else if(numDigits == 3)
			{
			ans = new Int(9 *(8 + 9) * 2);
			}else if(numDigits == 4)
			{
				ans = new Int((81 + (18 * 8)) * 9 * 2);
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
		int chance = Util.getRandomNumberInRange(1,4);
		if(chance == 1)
		{
			int digit1 = Util.getRandomNumberInRange(1,3);
			int digit2 = Util.getRandomNumberInRange(1,3);
			
			
		}else if(chance == 2)
		{
		}
	}
	
	private void gen6(){
		int length = Util.getRandomNumberInRange(5,9);
		int temp = length;
		int answer = 0;
		if(temp % 2 == 0)
		{
			answer += 4*(temp/2) + 5*(temp/2);
		}else
		{
			answer += 5*(temp/2) + 4 * (temp - (temp/2));
			answer += 4*(temp/2) + 5 * (temp - (temp/2));
		}
		
		ans = new Int(answer);
	}
	public int getChance()
	{
		return chance;
	}
	
}
