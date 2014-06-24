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
		chance = Util.getRandomNumberInRange(1,4);
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
			/**
			 * 
			 */
			ans = new Int(10 * 3);
		}
	}
	
}
