package com;

import java.util.HashMap;

public class Section {
	private String title;
	private int level;
	private HashMap<Integer, Integer> questions;
	private String chapter;
	
	public Section(String chapter, String title, int level, HashMap<Integer, Integer> questions) {
		this.title = title.replaceAll(" ", "");
		this.level = level;
		this.questions = questions;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLevel() {
		return level;
	}
	
	public HashMap<Integer, Integer> getQuestions() {
		return questions;
	}
	
	public String getChapter() {
		return chapter;
	}
}
