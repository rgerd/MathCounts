package CountingIsArithmetic.ChallengeProblems;

import java.util.ArrayList;

import util.Fraction;
import util.Int;
import util.Utilities;
import util.Number;

public class Context extends com.Context {
	private int ans;
	private ArrayList<Number> list;
	private int chance;

	public Context() {
		list = new ArrayList<Number>();
	}

	public ArrayList<Number> getList() {
		return list;
	}

	public int getAns() {
		return ans;
	}

	private void gen1() {
		int length = Utilities.getRandomNumberInRange(10, 1000);
		int numSquares = Utilities.getRandomNumberInRange(2, 8);

	}

	private void gen2() {

	}

	private void gen3() {

	}

	private void gen4() {

	}

	private void gen5() {

		int num_0 = Utilities.getRandomNumberInRange(0, 1000);
		int den_0 = Utilities.getRandomNumberInRange(0, 1000);

		int num_1 = Utilities.getRandomNumberInRange(0, 1000);
		int den_1 = Utilities.getRandomNumberInRange(0, 1000);

		Fraction frac_0 = new Fraction(num_0, den_0);
		Fraction frac_1 = (Fraction) new Fraction(num_1, den_1).add(frac_0);
		list.add(frac_0);
		list.add(frac_1);

		int top = (int) frac_1.reciprocal().divide();
		int bottom = (int) frac_0.reciprocal().divide();

		list.add(new Int(top - bottom + 1));
	}
}
