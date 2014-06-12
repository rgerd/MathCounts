package CountingListsOfNumbers;

import java.util.ArrayList;

public class Driver 
{
	public static void main(String[] args)
	{
		 Context con = new Context();
		 con.generate(1);
		 Question quest = new Question();
		 String q = quest.getQ(con);
		 System.out.println(q);
		 
		 int ans = con.getAns();
		 AnswerGen a = new AnswerGen(ans);
		 ArrayList<Integer> arr = new ArrayList<Integer>();
		 arr = a.getWrong("window");
		 System.out.println(arr);
	}
}
