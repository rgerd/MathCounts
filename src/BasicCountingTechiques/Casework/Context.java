package BasicCountingTechiques.Casework;


import java.util.ArrayList;
import java.util.HashSet;


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
		
	}

	private void gen2() {

	}

	private void gen3() {
	
	}

	private void gen4() 
	{
		int p= Util.getRandomNumberInRange(5,100);
		int p1= Util.getRandomNumberInRange(5,100);
		int p2= Util.getRandomNumberInRange(5,100);
		list.add(new Int(p));
		list.add(new Int(p1));
		list.add(new Int(p2));
		p*=p1;
		p*=p2;
		Int q=new Int(p);
		ans=q;
	}


	private void gen5() {
	
	}

	public int chance()
	{
		return chance;
	}
}



