package CountingMultipleEvents;

import java.io.File;

import util.Number;
import util.Int;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import util.Utilities;

public class Driver 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(new File("input1.txt"));
		PrintWriter output = null;
		try {
			File f = new File("output.txt");
			output = new PrintWriter(new FileWriter(f));
			while(in.hasNextLine())
			{
				String[] s = in.nextLine().split("\t");
				for(int i = 0; i < s.length; i++)
				{
					System.out.println(s[i]);
				}
				
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
				System.out.println(nums);
				System.out.println(types);

				for(int j = 0; j < types.size(); j++)
				{
					int typee = types.get(j);
					for(int k = 0; k < nums.get(j); k++)
					{
						Context c = new Context();
						c.generate(typee);
						Question quest = new Question();
						String q = quest.getQ(c);
						output.print("MC"+"\t"+q+"\t");

						int ans = c.getAns();
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