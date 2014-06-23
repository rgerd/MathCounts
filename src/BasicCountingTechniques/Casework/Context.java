package BasicCountingTechniques.Casework;

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
		list.add(new Int(length));
		
		while(alph.length() < length)
		{
			int rand = Util.getRandomNumberInRange(0, 25);
			if(!alph.contains(alphabet.get(rand)))
				alph += alphabet.get(rand);
		}
		
		list.add(new CustomNumber(alph));
		
		int numLetters = Util.getRandomNumberInRange(2, 6);
		list.add(new Int(numLetters));
		
		int answer = 1;
		
		while(numLetters >0)
		{
			answer += (int) Math.pow( length,  numLetters); 
			numLetters --;
		}
		ans = new Int(answer);
	}

	private void gen2() {
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
		
		while(alph.length() < length)
		{
			int rand = Util.getRandomNumberInRange(0, 25);
			if(!alph.contains(alphabet.get(rand)))
				alph += alphabet.get(rand);
		}
		int index = Util.getRandomNumberInRange(0, alph.length()-1);
		String let = alph.substring(index, index+1);
		
		int numLetters = Util.getRandomNumberInRange(2, 6);
		list.add(new CustomNumber(let));
		list.add(new Int(numLetters));
		list.add(new CustomNumber(alph));
		
		int answer = 0;
		
		while(numLetters >0)
		{
			answer += numLetters* (int) Math.pow(length, numLetters-1);
			numLetters--;
		}
		ans = new Int(answer);
	}

	private void gen3() {
		int num = Util.getRandomNumberInRange(3, 6);
		list.add(new Int(num));
		ans = new Int(num);

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