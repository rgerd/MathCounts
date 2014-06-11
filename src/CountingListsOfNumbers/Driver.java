package CountingListsOfNumbers;

public class Driver 
{
	public static void main(String[] args)
	{
		 Context con = new Context();
		 con.generate(1);
		 Question quest = new Question();
		 String q = quest.getQ(con);
		 System.out.println(q);
	}
}
