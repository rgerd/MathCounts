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
		StringBuilder sb = new StringBuilder(format);
		ArrayList<LangComponent> components = new ArrayList<LangComponent>();
		Number last_num = null;
		ArrayList<TagData> tags = new ArrayList<TagData>();

		boolean last_num_plural = false;
		boolean last_noun_plural = false;
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
		for (int i = 0; i < tags.size(); i++) {
			TagData tag = tags.get(i);
			String attr = tag.getAttr();
			int ind = tag.getIndex();
			HashSet<String> tag_flags = tag.getFlags();
			
			if (attr.equals("num")) {
				last_num = nums[ind];
				components.add(LangComponent.createNumberComponent(last_num));
				last_num_plural = !last_num.toString().equals("1");
			} else {
				boolean this_plural = false;
				if (attr.equals("noun"))
					last_noun_plural = last_num_plural || tag_flags.contains("pl");

				this_plural = last_noun_plural;
				last_num_plural = false;

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
