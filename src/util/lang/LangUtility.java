package util.lang;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class LangUtility {
	private static LangContext context = loadContext();
	
	public static String populate(String format, int... ints) {
		StringBuilder sb = new StringBuilder(format);
		ArrayList<LangComponent> components = new ArrayList<LangComponent>();
		int last_num = -1;

		int start_brace = -1;
		for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if (c == '[') {
				start_brace = i;
			} else if (c == ']') {
				String str = sb.substring(start_brace + 1, i);

				StringTokenizer st = new StringTokenizer(str, "_");

				String attr = st.nextToken();
				String ind = st.nextToken();
				int _ind = Integer.parseInt(ind);

				if (attr.equals("num")) {
					last_num = ints[_ind];
					components.add(new LangComponent(LangComponent.OTHER, Integer.toString(last_num)));
				} else {
					components.add(context.generate(attr, _ind));
				}

				sb.replace(start_brace, i + 1, "%s");

				start_brace = -1;
			}
		}

		String[] strings = new String[components.size()];
		for (int i = 0; i < strings.length; i++) {
			strings[i] = components.get(i).toString();
		}

		System.out.println(String.format(sb.toString(), (Object[]) strings));

		return null;
	}
	
	private static LangContext loadContext() {
		return new LangContext("proto_lang_data.txt");
	}
}
