package CountingIsArithmetic.CountingWithAdditionAndSubtraction;

import java.util.ArrayList;

import util.Fraction;
import util.Int;
import util.Number;
import util.Util;

public class Context extends com.Context {
	private int length;
	private ArrayList<Number> list;
	private int start;

	public Context() {
		list = new ArrayList<Number>();
	}

	public ArrayList<Number> getList() {
		return list;
	}

	public Int getAnswer() {
		if (getType() == 2) {
			int count = 0;
			for (int i = 0; i < list.size(); i++) {
				if (i == 0) {
					Int i1 = (Int) (list.get(i));
					int i2 = i1.getValue();
					System.out.println(i2);
					count = +i2;
				} else {
					Int i1 = (Int) (list.get(i));
					int i2 = i1.getValue();
					System.out.println(i2);
					count *= i2;
				}
			}
			System.out.println(count);

			return new Int(count);
		}
		return new Int(length);

	}

	private void gen1() {
		Integer type1 = Util.getRandomNumberInRange(2, 15);
		Integer type2 = Util.getRandomNumberInRange(2, 15);
		Int init = new Int(start);
		list.add(init);
		list.add(init.add(new Int(type1)));
		list.add(init.add(new Int(type2)));
	}

	private void gen2() {
		Integer types = Util.getRandomNumberInRange(3, 5);
		Int init = new Int(start);
		for (int i = 0; i < types; i++) {
			list.add(init.add(new Int(Util.getRandomNumberInRange(2, 15))));
		}
	}

	private void gen3() {

	}

	private void gen4() {

	}

	private void gen5() {

	}

	private void gen6() {

	}
}
