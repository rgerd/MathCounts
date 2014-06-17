package util.lang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import util.Utilities;

public class LangGenerator {
	private HashMap<String, ArrayList<LangComponent>> components;
	private HashMap<String, ArrayList<LangComponent>> _components;

	public LangGenerator(String data_file) {
		components = LangParser.parseLangData(data_file);
		_components = new HashMap<String, ArrayList<LangComponent>>();
	}
	
	public LangComponent generate(boolean plural, String... tag_data) {
		LangComponent lc = null;
		String type = tag_data[0];
		
		if(type.equals("verb")) {
			lc = components.get("verb").get(0).clone();
			lc.setPlural(plural);
			return lc;
		}
			
		int index = Integer.parseInt(tag_data[1]);
		
		ArrayList<LangComponent> _comps = _components.get(type);
		if(_comps != null && _comps.size() > index) {
			lc = _comps.get(index).clone();
			lc.setPlural(plural);
			return lc;
		}
		
		ArrayList<LangComponent> comps = components.get(type);
		lc = comps.remove(Utilities.getRandomNumberInRange(0, comps.size() - 1)).clone();
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

	public LangComponent generate(String... tag_data) {
		return generate(false, tag_data);
	}

	public void reset() {
		Set<Entry<String, ArrayList<LangComponent>>> entries = _components.entrySet();
		for(Entry<String, ArrayList<LangComponent>> entry : entries)
			components.get(entry.getKey()).addAll(entry.getValue());
		_components.clear();
	}
}
