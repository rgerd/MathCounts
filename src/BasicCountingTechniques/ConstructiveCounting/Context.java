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
			
			ans = new Int( ((int) Math.pow(9, digits - 3)) * 10 * (9/times));
			list.add(new Int(digits));
			list.add(new Int(times));
		}
	}
	
	private void gen2() {
		int length = Util.getRandomNumberInRange(5, 9);
		int lower = Util.getRandomNumberInRange(0,3);
		int upper = Util.getRandomNumberInRange(5,9);
		int possibilities = upper - lower - 1;
		list.add(new Int(lower));
		list.add(new Int(upper));
		list.add(new Int(length));
		ans = new Int(possibilities * ((possibilities - 1) * length));
	}
	
	public int getChance()
	{
		return chance;
	}
	
}
