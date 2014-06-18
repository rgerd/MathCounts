package CountingListsOfNumbers;

import java.util.ArrayList;
import util.Fraction;
import util.Int;
import util.Number;
import util.Utilities;

public class Context extends com.Context {
	private int length;
	private ArrayList<Number> list;
	private int start;
	private int type17;

	public Context() {
		list = new ArrayList<Number>();
	}

	public ArrayList<Number> getList() {
		return list;
	}

	public int getAns() {
		if (getType() == 17) {
			int count = 0;
			for (int i = 1; i < type17 / 2; i++) {
				if (i * (i + 1) < type17)
					count++;
			}

			return count;
		}
		return length;

	}

	public int getType17() {
		return type17;
	}

	private void gen1() {
		start = 1;
		length = Utilities.getRandomNumberInRange(5, 998);
		Int init = new Int(start);
		list.add(init);
		list.add(init.add(new Int(1)));
		list.add(init.add(new Int(2)));
		list.add(init.add(new Int(3)));
		list.add(init.add(new Int(length - 1)));
	}

	private void gen2() {
		start = Utilities.getRandomNumberInRange(1, 994);
		length = Utilities.getRandomNumberInRange(5, 999 - start);
		Int init = new Int(start);
		list.add(init);
		list.add(init.add(new Int(1)));
		list.add(init.add(new Int(2)));
		list.add(init.add(new Int(3)));
		list.add(init.add(new Int(length - 1)));
	}

	private void gen3() {
		start = Utilities.getRandomNumberInRange(-1000, 994);
		length = Utilities.getRandomNumberInRange(5, 999 - start);
		Int init = new Int(start);
		list.add(init);
		list.add(init.add(new Int(1)));
		list.add(init.add(new Int(2)));
		list.add(init.add(new Int(3)));
		list.add(init.add(new Int(length - 1)));
	}

	private void gen4() {
		start = Utilities.getRandomNumberInRange(-994, 1000);
		length = Utilities.getRandomNumberInRange(5, Math.abs(-999 - start));
		Int init = new Int(start);
		list.add(init);
		list.add(init.sub(new Int(1)));
		list.add(init.sub(new Int(2)));
		list.add(init.sub(new Int(3)));
		list.add(init.sub(new Int(length - 1)));
	}

	private void gen5() {
		start = Utilities.getRandomNumberInRange(2, 10);
		int lengthRange = (1000 / start) - 1;
		length = Utilities.getRandomNumberInRange(2, lengthRange);
		int chance = Utilities.getRandomNumberInRange(1, 2);
		if (chance == 1) {
			list.add(new Int(start));
			list.add(new Int(start + start));
			list.add(new Int(start + start * 2));
			list.add(new Int(start + start * 3));
			list.add(new Int(start + start * (length - 1)));
		} else {
			list.add(new Int(start));
			list.add(new Int(start - start));
			list.add(new Int(start - start * 2));
			list.add(new Int(start - start * 3));
			list.add(new Int(start - start * (length - 1)));
		}

	}

	private void gen6() {
		start = Utilities.getRandomNumberInRange(-199, 199);
		while (start == 0) {
			Utilities.getRandomNumberInRange(-199, 199);
		}
		int lengthRange = 1000 / Math.abs((start));
		length = Utilities.getRandomNumberInRange(5, lengthRange);
		int chance = Utilities.getRandomNumberInRange(1, 2);
		if (chance == 1) {
			// increasing

			list.add(new Int(start));
			list.add(new Int(start + start));
			list.add(new Int(start + start * 2));
			list.add(new Int(start + start * 3));
			list.add(new Int(start + start * (length - 1)));
		} else {
			// decreasing
			list.add(new Int(start));
			list.add(new Int(start - start));
			list.add(new Int(start - start * 2));
			list.add(new Int(start - start * 3));
			list.add(new Int(start - start * (length - 1)));

		}
	}

	private void gen7() {
		start = Utilities.getRandomNumberInRange(2, 10);
		// How long should the list of unit fractions be?
		length = Utilities.getRandomNumberInRange(5, 999);
		int chance = Utilities.getRandomNumberInRange(1, 2);
		if (chance == 1) {
			list.add(new Fraction(1, start).simplify());
			list.add(new Fraction(1 + 1, start).simplify());
			list.add(new Fraction(1 + 2, start).simplify());
			list.add(new Fraction(1 + 3, start).simplify());
			list.add(new Fraction(1 + length - 1, start).simplify());
		} else {
			list.add(new Fraction(1, start).simplify());
			list.add(new Fraction(0, start).simplify());
			list.add(new Fraction(-1, start).simplify());
			list.add(new Fraction(-2, start).simplify());
			list.add(new Fraction(1 - (length - 1), start).simplify());
		}

	}

	private void gen8() {
		start = Utilities.getRandomNumberInRange(2, 10);
		length = Utilities.getRandomNumberInRange(15, 25);
		int chance = Utilities.getRandomNumberInRange(1, 2);
		int rand = Utilities.getRandomNumberInRange(1, 10);
		if (chance == 1) {
			list.add(new Fraction(rand, start).simplify());
			list.add(new Fraction(rand + 1, start).simplify());
			list.add(new Fraction(rand + 2, start).simplify());
			list.add(new Fraction(rand + 3, start).simplify());
			list.add(new Fraction(rand + length, start).simplify());
		} else {
			list.add(new Fraction(-rand, start).simplify());
			list.add(new Fraction(-rand + 1, start).simplify());
			list.add(new Fraction(-rand + 2, start).simplify());
			list.add(new Fraction(-rand + 3, start).simplify());
			list.add(new Fraction(-rand + length, start).simplify());
		}
		length = length + 1;

	}

	private void gen9() {
		int g1 = Utilities.getRandomNumberInRange(1, 8);

		double r = Utilities.getRandomNumberInRange(2, 4);
		start = g1;

		length = Utilities.getRandomNumberInRange(5, 8);
		int end = (int) Math.pow(r, (double) length - 1);
		end = end * start;

		int chance = Utilities.getRandomNumberInRange(1, 2);
		if (chance == 1) {
			list.add(new Int(start));
			list.add(new Int(start * (int) Math.pow(r, 1)));
			list.add(new Int(start * (int) Math.pow(r, 2)));
			list.add(new Int(start * (int) Math.pow(r, 3)));
			list.add(new Int(end));
		} else {
			list.add(new Int(start));
			list.add(new Int(start * (int) Math.pow(r, 1) * (int) Math.pow(-1, 1)));
			list.add(new Int(start * (int) Math.pow(r, 2) * (int) Math.pow(-1, 2)));
			list.add(new Int(start * (int) Math.pow(r, 3) * (int) Math.pow(-1, 3)));

			if (length % 2 == 0)
				list.add(new Int(end * -1));
			else
				list.add(new Int(end));
		}
	}

	private void gen10()// DO THIS
	{
		start = Utilities.getRandomNumberInRange(2, 10);
		int lengthRange = (1000 / start) - 1;
		length = Utilities.getRandomNumberInRange(5, lengthRange);

		list.add(new Fraction(1, start).simplify());
		list.add(new Fraction(1, start * 2).simplify());
		list.add(new Fraction(1, start * 3).simplify());
		list.add(new Fraction(1, start * 4).simplify());
		list.add(new Fraction(1, start * (length - 1)).simplify());
	}

	private void gen11() {
		int chance = Utilities.getRandomNumberInRange(1, 2);
		start = Utilities.getRandomNumberInRange(1, 20);
		length = Utilities.getRandomNumberInRange(1, 20);
		if (chance == 1) {
			// increasing
			start = Utilities.getRandomNumberInRange(1, 15);
			length = Utilities.getRandomNumberInRange(5, 20 - start);
			list.add(new Int((int) (Math.pow(start, 2))));
			list.add(new Int((int) (Math.pow(start + 1, 2))));
			list.add(new Int((int) (Math.pow(start + 2, 2))));
			list.add(new Int((int) (Math.pow(start + 3, 2))));
			list.add(new Int((int) (Math.pow(length - 1, 2))));

		} else {
			// decreasing
			start = Utilities.getRandomNumberInRange(5, 20);
			length = Utilities.getRandomNumberInRange(5, Math.abs(0 - start));
			list.add(new Int((int) (Math.pow(start, 2))));
			list.add(new Int((int) (Math.pow(start - 1, 2))));
			list.add(new Int((int) (Math.pow(start - 2, 2))));
			list.add(new Int((int) (Math.pow(start - 3, 2))));
			list.add(new Int((int) (Math.pow(start - length - 1, 2))));
		}

	}

	private void gen12() {

		start = Utilities.getRandomNumberInRange(1, 5);
		length = Utilities.getRandomNumberInRange(start + 4, 10);
		int chance = Utilities.getRandomNumberInRange(1, 2);

		if (chance == 1) {
			// increasing

			list.add(new Int((int) Math.pow(start, 3)));
			list.add(new Int((int) Math.pow(start + 1, 3)));
			list.add(new Int((int) Math.pow(start + 2, 3)));
			list.add(new Int((int) Math.pow(start + 3, 3)));
			list.add(new Int((int) Math.pow(length, 3)));
		} else {
			list.add(new Int((int) Math.pow(-start, 3)));
			list.add(new Int((int) Math.pow(-start - 1, 3)));
			list.add(new Int((int) Math.pow(-start - 2, 3)));
			list.add(new Int((int) Math.pow(-start - 3, 3)));
			list.add(new Int((int) Math.pow(-length, 3)));
		}
	}

	private void gen13() { // REMEMBER ANSWERS DONT COUNT 0 OR 1000

		start = 1;
		length = 30;
		int i = 1;
		int i1 = 1;
		while (util.Utilities.GCD(i, i1) != 1 || i == i1 || (i % i1) == 0) {
			i = Utilities.getRandomNumberInRange(2, 15);
			i1 = Utilities.getRandomNumberInRange(2, 15);
		}
		length = Utilities.getRandomNumberInRange(100, 700);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int x = 1;

		while (x * i < length) {
			boolean isgood = true;
			for (int y = 0; y * i1 < length; y++) {
				if (i * x == i1 * y) {
					isgood = false;

				}

			}
			if (isgood == true)
				ar.add(i * x);
			x++;

		}

		list.add(new Int(length));
		length = ar.size();
		list.add(new Int(i));
		list.add(new Int(i1));

	}

	private void gen14() {

		start = 1;
		length = 30;
		int i = 1;
		int i1 = 1;
		while (util.Utilities.GCD(i, i1) == 1 || i == i1 || (i % i1) == 0) {
			i = Utilities.getRandomNumberInRange(2, 15);
			i1 = Utilities.getRandomNumberInRange(2, 15);
		}
		length = Utilities.getRandomNumberInRange(100, 700);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int x = 1;

		while (x * i < length) {
			boolean isgood = true;
			for (int y = 0; y * i1 < length; y++) {
				if (i * x == i1 * y) {
					isgood = false;

				}

			}
			if (isgood == true)
				ar.add(i * x);
			x++;

		}

		list.add(new Int(length));
		length = ar.size();
		list.add(new Int(i));
		list.add(new Int(i1));

	}

	private void gen15() {
		start = Utilities.getRandomNumberInRange(1, 25);
		length = Utilities.getRandomNumberInRange(5, 999);
		int end = start + length - 1;
		list.add(new Int(start));
		list.add(new Int(end));

	}

	private void gen16() { // DO THIS

	}

	private void gen17() {
		type17 = Utilities.getRandomNumberInRange(1, 999);
	}

	private void gen18() {
		int rNum = Utilities.getRandomNumberInRange(1, 1);
		int rDen = Utilities.getRandomNumberInRange(2, 8);
		int g1 = Utilities.getRandomNumberInRange(1, 5);
		length = Utilities.getRandomNumberInRange(5, 8);
		Fraction r = new Fraction(rNum, rDen);
		int start = g1;
		int num = r.getNumerator();
		int den = r.getDenominator();
		Fraction end = new Fraction((int) Math.pow(num, length - 1), (int) Math.pow(den, length - 1));;
		end = new Fraction(end.getNumerator() * start, end.getDenominator());

		int chance = Utilities.getRandomNumberInRange(1, 2);
		if (chance == 1) {
			list.add(new Int(start));
			num = r.getNumerator();
			den = r.getDenominator();
			r = new Fraction((int) Math.pow(num, 1), (int) Math.pow(den, 1));
			r = new Fraction(r.getNumerator() * start, r.getDenominator());
			list.add(r.simplify());

			num = r.getNumerator();
			den = r.getDenominator();
			r = new Fraction((int) Math.pow(num, 2), (int) Math.pow(den, 2));
			r = new Fraction(r.getNumerator() * start, r.getDenominator());
			list.add(r.simplify());

			num = r.getNumerator();
			den = r.getDenominator();
			r = new Fraction((int) Math.pow(num, 2), (int) Math.pow(den, 3));
			r = new Fraction(r.getNumerator() * start, r.getDenominator());
			list.add(r.simplify());

			list.add(end.simplify());
		} else {
			list.add(new Int(start));

			num = r.getNumerator();
			den = r.getDenominator();
			r = new Fraction((int) Math.pow(num, 1), (int) Math.pow(den, 1));
			r = new Fraction(r.getNumerator() * start * -1, r.getDenominator());
			list.add(r.simplify());

			num = r.getNumerator();
			den = r.getDenominator();
			r = new Fraction((int) Math.pow(num, 2), (int) Math.pow(den, 2));
			r = new Fraction(r.getNumerator() * start, r.getDenominator());
			list.add(r.simplify());

			num = r.getNumerator();
			den = r.getDenominator();
			r = new Fraction((int) Math.pow(num, 2), (int) Math.pow(den, 3));
			r = new Fraction(r.getNumerator() * start * -1, r.getDenominator());
			list.add(r.simplify());

			Fraction e = (Fraction) end.mult(new Fraction(-1, 1));
			if (length % 2 == 0)
				list.add(e.simplify());
			else
				list.add(end);
		}

	}

	private void gen19() {
		start = Utilities.getRandomNumberInRange(1, 25);
		length = Utilities.getRandomNumberInRange(5, 999);
		list.add(new Int(start));
		list.add(new Int(length * 2 + start));
		int counter = 0;
		for (int i = start; i < length * 2 + start; i++) {
			if (i % 2 != 0)
				counter++;
		}
		length = counter;
	}

	private void gen20() {
		start = Utilities.getRandomNumberInRange(1, 25);
		length = Utilities.getRandomNumberInRange(5, 999);
		list.add(new Int(start));
		list.add(new Int(length * 2 + start));
		int counter = 0;
		for (int i = start; i < length * 2 + start; i++) {
			if (i % 2 == 0)
				counter++;
		}
		length = counter;
	}
}