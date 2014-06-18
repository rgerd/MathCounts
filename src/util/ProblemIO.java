package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

import CountingWithAdditionAndSubtraction.AnswerGen;

import com.AnswerSet;
import com.Section;

public class ProblemIO {
	public static ArrayList<Section> readSections(String input_file) {
		ArrayList<Section> sections = new ArrayList<Section>();
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(new File(input_file)));

			String line = null;
			
			while((line = in.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t");
				String title = st.nextToken();
				int level = Integer.parseInt(st.nextToken());
				HashMap<Integer, Integer> questions = new HashMap<Integer, Integer>();
				while(st.hasMoreTokens()) {
					String probs = st.nextToken();
					String[] _probs = probs.split(" ");
					int number = Integer.parseInt(_probs[0]);
					int type = Integer.parseInt(_probs[1].substring(1));
					questions.put(type, number);
				}
				
				Section section = new Section(title, level, questions);
				sections.add(section);
			}
		} catch(Exception e) {
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return sections;
	}
	
	public static void printQuestion(String output_file, String question, AnswerSet answers) {
		PrintWriter output = new PrintWriter(new File(output_file));
		
		HashMap<String, Boolean> _answers = answers.getAnswers();
		Set<String> __answers = _answers.keySet();
		//Collections.shuffle(__answers);
		
		StringBuilder line = new StringBuilder();
		line.append("MC").append("\t").append(question);
		
		for(String answer : __answers) {
			line.append("\t").append(answer).append("\t").append(_answers.get(answer) ? "correct" : "incorrect");
		}
		
		
		output.println(line.toString());
		
		
		String q = quest.getQ(con);
		 
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
