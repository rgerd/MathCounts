package CountingListsOfNumbers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import util.Int;
import util.Number;
import util.Utilities;

public class Driver 
{
	public static void main(String[] args)
	{
		PrintWriter output = null;
		try {
			File f = new File("output.txt");
			output = new PrintWriter(new FileWriter(f));
			for (int i = 0; i < 10; i++) {
				 Context con = new Context();
				 con.generate(2);
				 Question quest = new Question();
				 String q = quest.getQ(con);
				 output.print("MC"+"\t"+q+"\t");
				 
				 int ans = con.getAns();
				 AnswerGen a = new AnswerGen(ans);
				 ArrayList<Number> arr = new ArrayList<Number>();
				 arr = a.getWrong("window");
				int r= Utilities.getRandomNumberInRange(1, 5);
				 if(r==1)
					 output.println(arr.get(0)+"\t"+ "correct"+"\t"+arr.get(1)+"\t"+ "incorrect"+"\t"+arr.get(2)+"\t"+ "incorrect"+"\t"+arr.get(3)+"\t"+ "incorrect"+"\t"+arr.get(4)+"\t"+ "incorrect");
				 else if(r==2)
					 output.println(arr.get(4)+"\t"+ "incorrect"+"\t"+arr.get(0)+"\t"+ "correct"+"\t"+arr.get(1)+"\t"+ "incorrect"+"\t"+arr.get(2)+"\t"+ "incorrect"+"\t"+arr.get(3)+"\t"+ "incorrect");
				 else if(r==3)
					 output.println(arr.get(3)+"\t"+ "incorrect"+"\t"+arr.get(4)+"\t"+ "incorrect"+"\t"+arr.get(0)+"\t"+ "correct"+"\t"+arr.get(1)+"\t"+ "incorrect"+"\t"+arr.get(2)+"\t"+ "incorrect");
				 else if(r==4)
					 output.println(arr.get(2)+"\t"+ "incorrect"+"\t"+arr.get(3)+"\t"+ "incorrect"+"\t"+arr.get(4)+"\t"+ "incorrect"+"\t"+arr.get(0)+"\t"+ "correct"+"\t"+arr.get(1)+"\t"+ "incorrect");
				 else
					 output.println(arr.get(1)+"\t"+ "incorrect"+"\t"+arr.get(2)+"\t"+ "incorrect"+"\t"+arr.get(3)+"\t"+ "incorrect"+"\t"+arr.get(4)+"\t"+ "incorrect"+"\t"+arr.get(0)+"\t"+ "correct");
					
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			output.close();
		}

	}
		
	}

