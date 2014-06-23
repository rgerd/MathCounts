package BasicCountingTechiques.Casework;

import java.util.ArrayList;
import java.util.HashSet;

import util.CustomNumber;
import util.Factorial;
import util.Fraction;
import util.Int;
import util.Number;
import util.Util;

public class Context extends com.Context {
	private Number ans;
	private ArrayList<Number> list;
	private int chance;

	public Context() {
		list = new ArrayList<Number>();
	}

	public ArrayList<Number> getList() {
		return list;
	}

	public Number getAnswer() {
		return ans;
	}

	private void gen1() {
		ArrayList<String> alphabet = new ArrayList<String>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		alphabet.add("E");
		alphabet.add("F");
		alphabet.add("G");
		alphabet.add("H");
		alphabet.add("I");
		alphabet.add("J");
		alphabet.add("K");
		alphabet.add("L");
		alphabet.add("M");
		alphabet.add("N");
		alphabet.add("O");
		alphabet.add("P");
		alphabet.add("Q");
		alphabet.add("R");
		alphabet.add("S");
		alphabet.add("T");
		alphabet.add("U");
		alphabet.add("V");
		alphabet.add("W");
		alphabet.add("X");
		alphabet.add("Y");
		alphabet.add("Z");
		
		String alph = "";
		
		int length = Util.getRandomNumberInRange(5, 10);
		
		while(alph.length() < 5)
		{
			int rand = Util.getRandomNumberInRange(0, 25);
			if(!alph.contains(alphabet.get(rand)))
				alph += alphabet.get(rand);
		}
		
		list.add(new CustomNumber(alph));
		
		int numLetters = Util.getRandomNumberInRange(3, length);
		
	}

	private void gen2() {

	}

	private void gen3() {

	}

	private void gen4() {
		int p = Util.getRandomNumberInRange(5, 100);
		int p1 = Util.getRandomNumberInRange(5, 100);
		int p2 = Util.getRandomNumberInRange(5, 100);
		list.add(new Int(p));
		list.add(new Int(p1));
		list.add(new Int(p2));
		p *= p1;
		p *= p2;
		Int q = new Int(p);
		ans = q;
	}

	private void gen5() {

	}

	public int chance() {
		return chance;
	}
}
