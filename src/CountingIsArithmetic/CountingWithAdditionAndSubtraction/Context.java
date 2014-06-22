package CountingIsArithmetic.CountingWithAdditionAndSubtraction;

import java.util.ArrayList;
import util.Int;
import util.Number;
import util.Util;

public class Context extends com.Context {
	private Number answer;
	private ArrayList<Number> list;

	public Context() {
		list = new ArrayList<Number>();
		answer = null;
	}

	public ArrayList<Number> getList() {
		return list;
	}

	private void gen1() {
		Int total = new Int(Util.getRandomNumberInRange(10, 100));
		Int num_0 = new Int(Util.getRandomNumberInRange((int) (total.getValue() * 0.1), (int) (total.getValue() * 0.9)));
		Int num_1 = (Int) total.sub(num_0);
		
		list.add(total);
		list.add(num_0);
		list.add(num_1);
		
		answer = total.sub(num_0.add(num_1));
	}

	private void gen2() {
		Int total = new Int(Util.getRandomNumberInRange(10, 100));
		Int num_0 = new Int(Util.getRandomNumberInRange((int) (total.getValue() * 0.1), (int) (total.getValue() * 0.9)));
		Int num_1 = (Int) total.sub(num_0);
		
		list.add(total);
		list.add(num_0);
		list.add(num_1);
		
		answer = total.sub(num_0.add(num_1));
	}

	private void gen3() {

	}

	private void gen4() {

	}

	private void gen5() {

	}

	private void gen6() {

	}

	private void gen7() {

	}

	public Number getAnswer() {
		return answer;
	}
}
