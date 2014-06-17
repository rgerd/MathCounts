package util.lang;

import java.util.ArrayList;
import java.util.StringTokenizer;
import util.Number;

public class LangUtility {
	private static LangGenerator generator = loadGenerator();

	public static String populate(String format, Number... nums) {
		generator.reset();
		StringBuilder sb = new StringBuilder(format);
		ArrayList<LangComponent> components = new ArrayList<LangComponent>();
		Number last_num = null;

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
					if (!last_num.toString().equals("1")) {
						generator.setPlural(true);
					} else {
						generator.setPlural(false);
					}
				} else {
					components.add(generator.generate(tag_data));
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
