package com;

import java.util.HashMap;

public class AnswerSet {
	HashMap<String, Boolean> answers;
	
	public AnswerSet() {
		answers = new HashMap<String, Boolean>();
	}
	
	public void addAnswer(String answer, boolean correct) {
		answers.put(answer, correct);
	}
	
	public HashMap<String, Boolean> getAnswers() {
		return answers;
	}
}
