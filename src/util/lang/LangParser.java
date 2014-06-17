package util.lang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class LangParser {
	public static HashMap<String, ArrayList<LangComponent>> parseLangData(String data_file) {
		HashMap<String, ArrayList<LangComponent>> components = new HashMap<String, ArrayList<LangComponent>>();
		
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
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return components;
	}
}
