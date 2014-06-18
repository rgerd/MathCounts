package CountingListsOfNumbers;

import util.Number;
import util.ProblemIO;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.AnswerSet;
import com.Problem;
import com.Section;

public class Driver {
	private static final String INPUT_FILE = "input.txt";
	private static final String OUTPUT_FILE = "output_test.txt";

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Section> sections = ProblemIO.readSections(INPUT_FILE);

		ArrayList<Problem> problems = new ArrayList<Problem>();

		for (Section section : sections) {
			HashMap<Integer, Integer> questions = section.getQuestions();
			Set<Integer> types = questions.keySet();
			for (Integer type : types) {
				int numberOfQuestions = questions.get(type);
				for (int i = 0; i < numberOfQuestions; i++) {
					// Generating the context
					Context_1 con = new Context_1();
					con.generate(type);

					// Getting the question
					String question = new Question().getQ(con);

					// Getting the correct answer
					int ans = con.getAns();

					// Getting the incorrect answers
					AnswerGen a = new AnswerGen(ans);
					ArrayList<Number> arr = new ArrayList<Number>();
					arr = a.getWrong("window");

					// Adding answers to set of correct & incorrect answers
					AnswerSet answers = new AnswerSet();
					answers.addAnswer(arr.get(0).toString(), true);
					for (int j = 1; j < arr.size(); j++) {
						String answer = arr.get(j).toString();
						answers.addAnswer(answer, false);
					}

					// Creating and adding the problem
					Problem problem = new Problem(question, answers);
					problems.add(problem);
				}
			}
		}

		ProblemIO.printProblems(OUTPUT_FILE, problems);
	}

}
