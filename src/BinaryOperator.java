import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;


public class BinaryOperator 
{
	private static int op1;
	private static int op2;
	private static HashSet<Integer> h; 

	public BinaryOperator()
	{
		op1 = 0;
		op2 = 0;
		h = new HashSet<Integer>();
	}

	private static void setOps(int min, int max) 
	{
		op1 = Utilities.getRandomNumberInRange(min, max);
		op2 = Utilities.getRandomNumberInRange(min,max);
	}



	public static String add(int min, int max)
	{
		BinaryOperator.setOps(min, max);
		String question = "MC" + "\t" + op1 + " "+ "+" + " " + op2 + " "+"=" + " " + "\t";
		Random r = new Random();
		double rand = Math.random();
		getWrongAnswerOperator("+");
		Iterator<Integer> itr = h.iterator();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int l = 0; l < h.size(); l++)
		{
			arr.add(itr.next());
		}
		
		int place = r.nextInt(4);
		int index = 0;
		for(int i = 0; i < 4; i++)
		{
			if(i == place)
			{
				question += "\t" + getRightAnswer("+") + "\t" + "correct" + "\t";
			}
			else //if(rand < 0.5)
			{
				
				question += "\t" + arr.get(index) + "\t" + "incorrect" + "\t";
				arr.remove(index);
			
			}
			/**else if(rand > 0.5)
			{
				question += "\t" + getWrongAnswerWindow("+") + "\t" + "incorrect" + "\t";
			}**/
		}
		return question;
	}



	public static String multiply(int min, int max)
	{
		BinaryOperator.setOps(min,max);
		String question = "MC" + "\t" + op1 + " "+ "*" + " " + op2 + " "+"=" + " ";
		Random r = new Random();
		double rand = Math.random();
		getWrongAnswerOperator("+");
		Iterator<Integer> itr = h.iterator();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int l = 0; l < h.size(); l++)
		{
			arr.add(itr.next());
		}
		
		int place = r.nextInt(4);
		int index = 0;
		for(int i = 0; i < 4; i++)
		{
			if(i == place)
			{
				question += "\t" + getRightAnswer("*") + "\t" + "correct" + "\t";
			}
			else //if(rand < 0.5)
			{
				question += "\t" + arr.get(index) + "\t" + "incorrect" + "\t";
				arr.remove(index);
				
			}
			/**else if(rand > 0.5)
			{
				question += "\t" + getWrongAnswerWindow("*") + "\t" + "incorrect" + "\t";
			}**/
		}
		return question;
	}



	public static String divide(int min, int max)
	{
		BinaryOperator.setOps(min,max);
		String question = "MC" + "\t" + op1 + " "+ "/" + " " + op2 + " "+"=" + " ";
		Random r = new Random();
		double rand = Math.random();
		getWrongAnswerOperator("+");
		Iterator<Integer> itr = h.iterator();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int l = 0; l < h.size(); l++)
		{
			arr.add(itr.next());
		}
		
		int place = r.nextInt(4);
		int index = 0;
		for(int i = 0; i < 4; i++)
		{
			if(i == place)
			{
				question += "\t" + getRightAnswer("/") + "\t" + "correct" + "\t";
			}
			else //if(rand < 0.5)
			{
				question += "\t" + arr.get(index) + "\t" + "incorrect" + "\t";
				arr.remove(index);
			
			}
			/**else if(rand > 0.5)
			{
				question += "\t" + getWrongAnswerWindow("/") + "\t" + "incorrect" + "\t";
			}**/
		}
		return question;
	}



	public static String subtract(int min, int max)
	{
		BinaryOperator.setOps(min, max);
		String question = "MC" + "\t" + op1 + " "+ "-" + " " + op2 + " "+"=" + " ";
		Random r = new Random();
		double rand = Math.random();
		getWrongAnswerOperator("+");
		Iterator<Integer> itr = h.iterator();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int l = 0; l < h.size(); l++)
		{
			arr.add(itr.next());
		}
		
		int place = r.nextInt(4);
		int index = 0;
		for(int i = 0; i < 4; i++)
		{
			if(i == place)
			{
				question += "\t" + getRightAnswer("-") + "\t" + "correct" + "\t";
			}
			else //if(rand < 0.5)
			{
				question += "\t" + arr.get(index) + "\t" + "incorrect" + "\t";
				arr.remove(index);
			
			}
			/**else if(rand > 0.5)
			{
				question += "\t" + getWrongAnswerWindow("-") + "\t" + "incorrect" + "\t";
			}**/
		}
		return question;
	}







	private static String getRightAnswer(String operator)
	{
		int ans =0;
		if(operator.equals("+"))
			ans = op1 + op2;
		if(operator.equals("*"))
			ans = op1 * op2;
		if(operator.equals("-"))
			ans = op1-op2;
		if(operator.equals("/"))
			ans = op1/op2;

		return Integer.toString(ans);

	}



	private static void getWrongAnswerOperator(String operator)
	{
		int ans = 0;
		int right = Integer.parseInt(getRightAnswer(operator));
		h.add(right);

		if(!(operator.equals("+")))
		{
			ans = op1 + op2;
			h.add(ans);

		}
		if(!(operator.equals("-")))
		{
			ans = op1 - op2;
			h.add(ans);
		}

		if(!(operator.equals("/")))
		{
			ans = op1 / op2;
			h.add(ans);

		}
		
		
		
		if(!(operator.equals("*")))
		{
			ans = op1 * op2;
			h.add(ans);

		}
		
		while(h.size() < 4)
		{
			op1++;
			op2++;
			if(!(operator.equals("+")))
			{
				ans = op1 + op2;
				h.add(ans);
				
			}
			if(!(operator.equals("-")))
			{
				ans = op1 - op2;
				h.add(ans);
				
			}

			if(!(operator.equals("/")))
			{
				ans = op1 / op2;
				h.add(ans);
				
			}
			
		}
		h.remove(right);


	}




	private static void getWrongAnswerWindow(String operator, int window)
	{
		int ans = Integer.parseInt(getRightAnswer(operator));
		if(op1==0)
		{
		op1++;
		}
		if(op2==0)
		{
		op2++;
		}
		
			if(operator.equals("*") || operator.equals("/"))
			{
				if(op1!=op2)
				{
				h.add(ans-op1);
				h.add(ans-op2);
				h.add(ans+op1);
				h.add(ans+op2);
				}
				else
				{
				h.add(ans-op1);
				h.add(ans-window);
				h.add(ans+op1);
				h.add(ans+window);
				}
			}
			else
			{
			h.add(ans-window);
			h.add(ans-(window*2));
			h.add(ans+window);
			h.add(ans+(window*2));
			}
		
	}


}


