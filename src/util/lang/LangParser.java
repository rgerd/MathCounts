package util.lang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LangParser {
	public static void parseLangData(String data_file, HashMap<String, ArrayList<LangComponent>> components, HashMap<String, HashSet<String>> flags) {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(new File(data_file)));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		String curr_attr = null;
		String line = null;
		try {
			while ((line = in.readLine()) != null) {
				line = line.replaceAll(" ", "");
				line = line.replaceAll("\t", "");
				if (line.startsWith("#") || line.length() == 0)
					continue;

				if (line.startsWith("<")) {
					char[] chars = line.toCharArray();
					if (chars[1] == '/')
						continue;
					int end = 0;
					for (int i = 0; i < line.length(); i++) {
						if (chars[i] == '>')
							end = i;
					}
					String attr = line.substring(1, end);

					String _flags = null;
					int flags_start = attr.indexOf('[');
					int flags_end = attr.indexOf(']');
					if (flags_start != -1 && flags_end != -1) {
						_flags = attr.substring(flags_start + 1, flags_end);
						attr = attr.substring(0, flags_start);
					}

					HashSet<String> ___flags = null;
					if (!components.containsKey(attr)) {
						components.put(attr, new ArrayList<LangComponent>());
						if (_flags != null) {
							String[] __flags = _flags.split(",");
							___flags = new HashSet<String>();
							for (String flag : __flags) {
								___flags.add(flag);
							}
							flags.put(attr, ___flags);
						}
					}
					curr_attr = attr;
					continue;
				}

				line = line.replaceAll("_", " ");

				LangComponent seed = new LangComponent(curr_attr, flags.get(curr_attr), new HashSet<String>(), line.split(","));
				components.get(curr_attr).add(seed);
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
	}

	public static ArrayList<TagData> getTags(StringBuilder sb) {
		ArrayList<TagData> tags = new ArrayList<TagData>();

		int start_brace = -1;
		for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if (c == '[') {
				start_brace = i;
			} else if (c == ']') {
				String tag_str = sb.substring(start_brace + 1, i);
				tags.add(new TagData(tag_str));

				sb.replace(start_brace, i + 1, "%s");
				i -= (i + 1) - start_brace;
				start_brace = -1;
			}
		}
		return tags;
	}
}
