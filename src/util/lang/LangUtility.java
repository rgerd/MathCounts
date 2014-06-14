package util.lang;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class LangUtility {
	public static String populate(String format, int... ints) {
		StringBuilder sb = new StringBuilder(format);
		ArrayList<LangComponent> components = new ArrayList<LangComponent>();

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

				if (attr.equals("num")) {
					int _ind = Integer.parseInt(ind);
					components.add(new LangComponent(Integer.toString(ints[_ind])));
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
}
