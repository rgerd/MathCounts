package util.lang;

import java.util.ArrayList;

public class LangUtility {
	public static String populate(String format, int... ints) {
		StringBuilder sb = new StringBuilder(format);
		ArrayList<LangComponent> components = new ArrayList<LangComponent>();

		int start_brace = -1;
		int length = format.length();
		for (int i = 0; i < length; i++) {
			char c = sb.charAt(i);
			if(c == '[') {
				start_brace = i;
			} else if(c == ']') {
				String str = sb.substring(start_brace + 1, i);
				sb.replace(start_brace, i, "%s");
				
				
				
				start_brace = -1;
			}
		}
		
		return null;
	}
}
