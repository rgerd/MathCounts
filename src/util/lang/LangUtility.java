package util.lang;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

import util.Number;

public class LangUtility {
	private static LangGenerator generator = loadGenerator();

	/**
	 * Populates a format string. Read LANG_README.txt to learn the format.
	 * 
	 * @param format
	 *            the formatted string.
	 * @param nums
	 *            the numbers to use.
	 * @return the populated string.
	 */
	public static String populate(String format, Number... nums) {
		generator.reset();
		ArrayList<LangComponent> components = new ArrayList<LangComponent>();
		
		StringBuilder sb = new StringBuilder(format);
		ArrayList<TagData> tags = LangParser.getTags(sb);
		
		boolean last_num_plural = false;
		boolean last_noun_plural = false;

		for (int i = 0; i < tags.size(); i++) {
			TagData tag = tags.get(i);
			String attr = tag.getAttr();
			int ind = tag.getIndex();
			HashSet<String> tag_flags = tag.getFlags();
			
			if (attr.equals("num")) {
				Number num = nums[ind];
				components.add(LangComponent.createNumberComponent(num));
				last_num_plural = !num.toString().equals("1");
			} else {
				boolean this_plural = false;
				if (attr.equals("noun"))
					last_noun_plural = tag_flags.contains("pl");
				this_plural = last_noun_plural || last_num_plural;
				if(attr.equals("verb")) {
					last_noun_plural = false;
					last_num_plural = false;
				}
				
				this_plural &= !tag_flags.contains("sng");

				if (this_plural)
					tag_flags.add("pl");

				LangComponent lc = generator.generate(tag);
				components.add(lc);
			}
		}

		String[] strings = new String[components.size()];
		for (int i = 0; i < strings.length; i++) {
			strings[i] = components.get(i).toString();
		}
		return String.format(sb.toString(), (Object[]) strings);
	}

	private static LangGenerator loadGenerator() {
		return new LangGenerator("proto_lang_data.txt");
	}
}
