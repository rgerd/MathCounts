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
		int num1 = Util.getRandomNumberInRange(1, 5);
		list.add(new Int(num));
		list.add(new Int(num1));
		ans = new Int(2*num*num1);

	}

	private void gen4() {
		int num = Util.getRandomNumberInRange(5, 999);
		list.add(new Int(num));
		int answer = 0;
		
		int root = (int) Math.sqrt(num);
		while(root > 0)
		{
			int square = (int) Math.pow(root, 2);
			answer+= num-square-1;
			root--;
		}
		
		ans = new Int(answer);
	}

	private void gen5() {
		int hat1 = Util.getRandomNumberInRange(4, 15);
		list.add(new Int(hat1));
		int num2 = hat1 + 1;
		list.add(new Int(num2));
		int num3 = Util.getRandomNumberInRange(4, 15);
		int hat2 = num3;
		num3 = num2 +num3;
		list.add(new Int(num3));
		
		
		int numBalls = Util.getRandomNumberInRange(2, 4);
		list.add(new Int(numBalls));
		
		int ans1 = hat1;
		int ans2 = hat2;
		
		for(int i = 1; i < numBalls; i++)
		{
			hat1--;
			ans1 = ans1*hat1;
			
			hat2--;
			ans2 = ans2*hat2;
		}
		int answer = ans1 + ans2;
		ans = new Int(2*answer);
	}

	public int chance() {
		return chance;
	}
}
