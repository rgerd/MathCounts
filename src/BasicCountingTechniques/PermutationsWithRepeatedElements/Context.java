package BasicCountingTechniques.PermutationsWithRepeatedElements;



import java.util.ArrayList;
import java.util.HashSet;

import util.CustomNumber;
import util.Factorial;
import util.Fraction;
import util.Int;
import util.Number;
import util.Util;
import util.lang.LangUtil;

public class Context extends com.Context {
	private Number ans;
	private ArrayList<Number> list;
	private ArrayList<Integer> help;
	private int chance;

	public Context() {
		list = new ArrayList<Number>();
		help=new ArrayList<Integer>();
	}

	public ArrayList<Number> getList() {
		return list;
	}

	public Number getAnswer() {
		return ans;
	}

	private void gen1() 
	{
		String word = LangUtil.populate("[3letterword_0]");
		list.add(new CustomNumber(word));
		int answer = anagramhelper(word);
		ans = new Int(answer);
	}

	private void gen2() 
	{
		String word = LangUtil.populate("[4letterword_0]");
		list.add(new CustomNumber(word));
		int answer = anagramhelper(word);
		ans = new Int(answer);
		
	}

	private void gen3()
	{
		String word = LangUtil.populate("[longword_0]");
		list.add(new CustomNumber(word));
		int answer = anagramhelper(word);
		ans = new Int(answer);
	}

	private void gen4() 
	{
		int totalNum = Util.getRandomNumberInRange(5, 10);
		int duplicates = Util.getRandomNumberInRange(2, 4);
		
		
	}
	
	private int anagramhelper(String s) 
	{

		ArrayList al = new ArrayList();
		for (int i = 0; i < s.length(); i++) {
			String st = s.substring(i, i + 1);
			al.add(st);

		}
		int divideby = 1;
		int r = 0;
		for (int x = 0; x < al.size(); x++) {
			r = 0;
			String sr = s.substring(x, x + 1);

			for (int y = 0; y < al.size(); y++) {

				if (al.get(y).equals(sr)) {
					r++;
					al.set(y, "*");
				}

			}
			while (r >= 1) {
				divideby = divideby * r;
				r--;

			}

		}

		int numb = al.size();
		int answer = 1;
		while (numb >= 1) {
			answer = answer * numb;
			numb--;
		}

		int retans = answer / divideby;

		return retans;
	}

	public int chance()
	{
		return chance;
	}
}
