package CountingListsOfNumbers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.BinaryOperator;
import com.Utilities;

public class Driver 
{
	public static void main(String[] args)
	{
		BinaryOperator b = new BinaryOperator();

		PrintWriter output = null;
		try {
			File f = new File("output.txt");
			output = new PrintWriter(new FileWriter(f));
			for (int i = 0; i < 10; i++) {
				 Context con = new Context();
				 con.generate(1);
				 Question quest = new Question();
				 String q = quest.getQ(con);
				 output.println("MC"+"\t"+q);
				 
				 int ans = con.getAns();
				 AnswerGen a = new AnswerGen(ans);
				 ArrayList<Integer> arr = new ArrayList<Integer>();
				 arr = a.getWrong("window");
				 System.out.println(arr);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			output.close();
		}

	}
		
	}

