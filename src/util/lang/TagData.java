package util.lang;

import java.util.HashSet;
import java.util.StringTokenizer;

public class TagData {
	private String attr;
	private int index;
	private HashSet<String> flags;
	
	public TagData(String tag) {
		
		StringTokenizer st = new StringTokenizer(tag, "_");
		
		attr = st.nextToken();
		index = Integer.parseInt(st.nextToken());
		
		HashSet<String> flags = new HashSet<String>();
		while(st.hasMoreTokens()) {
			flags.add(st.nextToken());
		}
	}
}
