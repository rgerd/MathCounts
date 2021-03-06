package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import util.Int;
import util.Number;
import util.Util;

public class AnswerGen {
	private HashSet<Number> h;
	private Number ans;
	private String ansStr;

	public AnswerGen(Number answer) {
		ans = answer;

	}

	public ArrayList<Number> getWrong(String type) {
		h = new HashSet<Number>();
		if (type.equals("window")) {
			int chance = Util.getRandomNumberInRange(1, 5);
			if (chance == 1) {
				h.add(ans.add(new Int(1)));
				h.add(ans.add(new Int(2)));
				h.add(ans.add(new Int(3)));
				h.add(ans.add(new Int(4)));

			} else if (chance == 2) {
				h.add(ans.add(new Int(1)));
				h.add(ans.add(new Int(2)));
				h.add(ans.add(new Int(3)));
				h.add(ans.sub(new Int(1)));
			} else if (chance == 3) {
				h.add(ans.add(new Int(1)));
				h.add(ans.add(new Int(2)));
				h.add(ans.add(new Int(-1)));
				h.add(ans.add(new Int(-2)));
			} else if (chance == 4) {
				h.add(ans.add(new Int(-1)));
				h.add(ans.add(new Int(-2)));
				h.add(ans.add(new Int(-3)));
				h.add(ans.add(new Int(1)));
			} else {
				h.add(ans.add(new Int(-1)));
				h.add(ans.add(new Int(-2)));
				h.add(ans.add(new Int(-3)));
				h.add(ans.add(new Int(-4)));
			}
		}

		ArrayList<Number> h1 = new ArrayList<Number>();
		h1.add(ans);

		Iterator<Number> itr = h.iterator();
		for (int i = 0; i < h.size(); i++) {
			h1.add(itr.next());
		}

		return h1;
	}

}