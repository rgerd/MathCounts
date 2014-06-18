package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Problem {
	private String question;
	private AnswerSet answers;
	
	public Problem(String question, AnswerSet answers) {
		this.question = question;
		this.answers = answers;
	}
	
	public String toString() {
		HashMap<String, Boolean> _answers = answers.getAnswers();
		Set<String> __answers = _answers.keySet();
		ArrayList<String> ___answers = new ArrayList<String>();
		___answers.addAll(__answers);
		Collections.shuffle(___answers);

		StringBuilder line = new StringBuilder();
		line.append("MC").append("\t").append(question);

		for(String answer : ___answers)
			line.append("\t").append(answer).append("\t").append(_answers.get(answer) ? "correct" : "incorrect");
		
		return line.toString();
	}
}
