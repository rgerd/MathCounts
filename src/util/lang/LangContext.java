package util.lang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import util.Utilities;

public class LangContext {
	private HashMap<String, ArrayList<LangComponent>> components;

	public LangContext(String data_file) {
		components = new HashMap<String, ArrayList<LangComponent>>();

		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(new File(data_file)));
		} catch (Exception e) {
		}
		
		String curr_attr = null;
		String line = null;
		try {
			while((line = in.readLine()) != null) {
				line = line.replaceAll(" ", "");
				if(line.startsWith("#"))
					continue;
				
				if(line.startsWith("<")) {
					char[] chars = line.toCharArray();
					int end = 0;
					for(int i = 0; i < line.length(); i++) {
						if(chars[i] == '>')
							end = i;
					}
					String attr = line.substring(1, end);
					if(!components.containsKey(attr)) {
						components.put(attr, new ArrayList<LangComponent>());
					}
					curr_attr = attr;
				}
				
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public LangComponent generate(byte type) {
		LangComponent lc = null;
		switch (type) {
		case LangComponent.NOUN:
			lc = nouns.remove(Utilities.getRandomNumberInRange(0, nouns.size()));
			_nouns.add(lc);
			return lc;
		case LangComponent.ADJECTIVE:
			lc = adjectives.remove(Utilities.getRandomNumberInRange(0, nouns.size()));
			_adjectives.add(lc);
			return lc;
		default:
			return null;
		}
	}

	public void reset() {
		while (_nouns.size() != 0)
			nouns.add(_nouns.remove(0));
		while (_adjectives.size() != 0)
			nouns.add(_adjectives.remove(0));
	}

	public LangComponent generate(String attr, int ind) {

		return null;
	}
}
