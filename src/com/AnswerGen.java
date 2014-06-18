package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import util.Int;
import util.Number;
import util.Utilities;


public class AnswerGen 
{
	private HashSet<Number> h;
	private int ans;
	
	public AnswerGen(int answer)
	{
		ans = answer;
	}
	
	public ArrayList<Number> getWrong(String type)
	{
		h = new HashSet<Number>();
		if(type.equals("window"))
		{
			int chance = Utilities.getRandomNumberInRange(1,5);
			if(chance == 1)
			{
				Int an = new Int(ans);
				h.add(an.add(new Int(1)));
				h.add(an.add(new Int(2)));
				h.add(an.add(new Int(3)));
				h.add(an.add(new Int(4)));

			}
			else if(chance == 2)
			{
				Int an = new Int(ans);
				h.add(an.add(new Int(1)));
				h.add(an.add(new Int(2)));
				h.add(an.add(new Int(3)));
				h.add(an.sub(new Int(1)));
			}else if(chance == 3)
			{
				h.add(new Int(ans+1));
				h.add(new Int(ans+2));
				h.add(new Int(ans-1));
				h.add(new Int(ans-2));
			}else if(chance == 4)
			{
				Int an = new Int(ans);
				h.add(an.sub(new Int(1)));
				h.add(an.sub(new Int(2)));
				h.add(an.sub(new Int(3)));
				h.add(an.add(new Int(1)));
			}else 
			{
				Int an = new Int(ans);
				h.add(an.sub(new Int(1)));
				h.add(an.sub(new Int(2)));
				h.add(an.sub(new Int(3)));
				h.add(an.sub(new Int(4)));
			}
		}

		ArrayList<Number> h1 = new ArrayList<Number>();
		h1.add(new Int(ans));
		
		Iterator<Number> itr = h.iterator();
		for(int i= 0; i < h.size(); i++)
		{
			h1.add(itr.next());
		}
		
		return h1;
	}
	

}