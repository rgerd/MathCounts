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
				ans = new Int(81 + 9 * (8+9));
			}
			list.add(new Int(numDigits));
		}else if(chance == 2)
		{
			int times = Util.getRandomNumberInRange(2,4);
			int digits = Util.getRandomNumberInRange(3,4);
			
			ans = new Int(((digits - 3) * 9) * 10 * (9/times));
			list.add(new Int(digits));
			list.add(new Int(times));
		}
	}
	
	private void gen2() {
		
	}
	
	public int getChance()
	{
		return chance;
	}
	
}
