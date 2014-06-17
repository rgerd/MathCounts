package util.lang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import util.Utilities;

public class LangGenerator {
	private HashMap<String, ArrayList<LangComponent>> components;
	private HashMap<String, ArrayList<LangComponent>> _components;

	public LangGenerator(String data_file) {
		components = new HashMap<String, ArrayList<LangComponent>>();
		_components = new HashMap<String, ArrayList<LangComponent>>();

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
				line = line.replaceAll("\t", "");
				if(line.startsWith("#") || line.length() == 0)
					continue;
				
				if(line.startsWith("<")) {
					char[] chars = line.toCharArray();
					if(chars[1] == '/')
						continue;
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
					continue;
				}
				
				line = line.replaceAll("_", " ");
				components.get(curr_attr).add(new LangComponent(curr_attr, line.split(",")));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public LangComponent generate(String... tag_data) {
		return generate(false, tag_data);
	}
	
	public LangComponent generate(boolean plural, String... tag_data) {
		LangComponent lc = null;
		String type = tag_data[0];

		if(type.equals("verb")) {
			lc = components.get("verb").get(0);
			lc.setPlural(plural);
			return lc;
		}
			
		
		int index = Integer.parseInt(tag_data[1]);
		
		ArrayList<LangComponent> _comps = _components.get(type);
		if(_comps != null && _comps.size() > index) {
			lc = _comps.get(index);
			lc.setPlural(plural);
			return lc;
		}
		
		ArrayList<LangComponent> comps = components.get(type);
		lc = comps.remove(Utilities.getRandomNumberInRange(0, comps.size() - 1));
		if(_components.containsKey(type)) {
			_components.get(type).add(lc);
		} else {
			ArrayList<LangComponent> al = new ArrayList<LangComponent>();
			al.add(lc);
			_components.put(type, al);
		}
		lc.setPlural(plural);
		return lc;
	}

	public void reset() {
		Set<Entry<String, ArrayList<LangComponent>>> entries = _components.entrySet();
		for(Entry<String, ArrayList<LangComponent>> entry : entries) {
			components.get(entry.getKey()).addAll(entry.getValue());
		}
		_components.clear();
	}
}
