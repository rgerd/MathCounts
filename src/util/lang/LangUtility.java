package util.lang;

import java.util.ArrayList;
import java.util.StringTokenizer;
import util.Number;

public class LangUtility {
	private static LangGenerator generator = loadGenerator();

	/**
	 * Populates a format string. Read LANG_README.txt to learn the format.
	 * @param format the formatted string.
	 * @param nums the numbers to use.
	 * @return the populated string.
	 */
	public static String populate(String format, Number... nums) {
		generator.reset();
		StringBuilder sb = new StringBuilder(format);
		ArrayList<LangComponent> components = new ArrayList<LangComponent>();
		Number last_num = null;

		
		boolean last_num_plural = false;
		boolean last_noun_plural = false;
		int start_brace = -1;
		for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if (c == '[') {
				start_brace = i;
			} else if (c == ']') {
				String str = sb.substring(start_brace + 1, i);

				StringTokenizer st = new StringTokenizer(str, "_");

				String[] tag_data = new String[st.countTokens()];
				int tdi = 0;
				while (st.hasMoreTokens()) {
					tag_data[tdi] = st.nextToken();
					tdi++;
				}

				String attr = tag_data[0];
				int ind = -1;
				if (tag_data.length > 1)
					ind = Integer.parseInt(tag_data[1]);

				if (attr.equals("num")) {
					last_num = nums[ind];
					components.add(new LangComponent("number", last_num.toString()));
					last_num_plural = !last_num.toString().equals("1");
				} else {
					if(attr.equals("noun"))
						last_noun_plural = tag_data.length >= 3;
					LangComponent lc = generator.generate(last_noun_plural || last_num_plural, tag_data);
					components.add(lc);
				}

				sb.replace(start_brace, i + 1, "%s");
				i -= (i + 1) - start_brace;
				start_brace = -1;
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
