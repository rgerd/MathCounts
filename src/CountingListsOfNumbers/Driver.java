package CountingListsOfNumbers;

import java.io.File;
<<<<<<< HEAD
import com.Number;
import com.Int;

import java.io.FileNotFoundException;
=======
>>>>>>> FETCH_HEAD
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Scanner;

import com.BinaryOperator;
import com.Utilities;
=======
import util.Number;
import util.Utilities;
>>>>>>> FETCH_HEAD

public class Driver 
{
	public static void main(String[] args) throws FileNotFoundException
	{
<<<<<<< HEAD
		Scanner in = new Scanner(new File("input1.txt"));
=======
>>>>>>> FETCH_HEAD
		PrintWriter output = null;
		try {
			File f = new File("output.txt");
			output = new PrintWriter(new FileWriter(f));
<<<<<<< HEAD
			while(in.hasNext())
			{
				 String[] s = in.nextLine().split("\t");
				 output.println("Chapter: " + s[0]);
				 output.println("Level " + s[1] + ": ");
				 
				 ArrayList<Integer> nums = new ArrayList<Integer>();
				 ArrayList<Integer> types = new ArrayList<Integer>();
				 for(int i = 2; i < s.length; i++)
				 {
					 String[] t = s[i].split(" ");
					 nums.add(Integer.parseInt(t[0]));
					 String ty = t[1];
					 int type = Integer.parseInt(ty.substring(1, ty.length()));
					 types.add(type);
				 }
=======
			for (int i = 0; i < 10; i++) {
				 Context con = new Context();
				 con.generate(5);
				 Question quest = new Question();
				 String q = quest.getQ(con);
				 output.print("MC"+"\t"+q+"\t");
>>>>>>> FETCH_HEAD
				 
				 for(int j = 0; j < types.size(); j++)
				 {
					 for(int k = 0; k < nums.get(j); k++)
					 {
						 Context con = new Context();
						 con.generate(typee);
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
				 }
					
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			output.close();
		}

	}
		
	}

