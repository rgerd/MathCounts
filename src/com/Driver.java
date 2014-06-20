package com;

import util.Number;
import util.Int;
import util.ProblemIO;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Driver {
	private static final String INPUT_FILE = "input.txt";
	private static final String OUTPUT_FILE = "output.txt";

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Section> sections = ProblemIO.readSections(INPUT_FILE);

		ArrayList<Problem> problems = new ArrayList<Problem>();

		for (Section section : sections) {
			String _package = section.getChapter() + "." + section.getTitle();
			
			if(section.getChapter() == null) {
				System.err.println("Section " + section.getTitle() + " is not associated with a chapter!");
				System.err.println("Make sure you specify chapters in the input file like so:");
				System.err.println("> Chapter Name");
				System.err.println("Before you specify the section.");
				System.exit(-1);
			}
			
			HashMap<Integer, Integer> questions = section.getQuestions();
			Set<Integer> types = questions.keySet();
			for (Integer type : types) {
				int numberOfQuestions = questions.get(type);
				for (int i = 0; i < numberOfQuestions; i++) {
					
					// Getting the context and question objects for the section
					Class<?> _context = null;
					Context context = null;
					Class<?> _question = null;
					Question question = null;
					try {
						_context = Class.forName(_package + ".Context");
						context = (Context) _context.newInstance();
						
						_question = Class.forName(_package + ".Question");
						question = (Question) _question.newInstance();
					} catch (ClassNotFoundException e) {
						System.err.println("Could not find Context or Question classes in package " + section.getTitle());
						System.err.println("Please check the input file for typos.");
						System.err.println("Are your classes and packages named correctly?");
						System.exit(-1);
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}

					// Generating the context
					context.generate(type);
					
					// Getting the question
					String q = question.getQ(context);

					// Getting the correct answer
					Number ans = context.getAnswer();

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
					Problem problem = new Problem(q, answers);
					problems.add(problem);
				}
				problems.add(null);
			}
		}

		ProblemIO.printProblems(OUTPUT_FILE, problems);
	}
}