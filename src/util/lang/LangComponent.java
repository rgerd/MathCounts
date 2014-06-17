package util.lang;

import java.util.ArrayList;

public class LangComponent {
	private final String type;
	private String[] data;
	private boolean plural;
	private ArrayList<String> flags;
	
	public LangComponent(String type, ArrayList<String> flags, String... strs) {
		this.type = type;
		data = strs;
		plural = false;
		this.flags = flags;
	}
	
	public LangComponent clone() {
		return new LangComponent(type, flags, data);
	}
	
	public String[] getData() {
		return data;
	}
	
	public String toString() {
		if(flags != null && flags.contains("place"))
			return data[1] + (Character.isUpperCase(data[0].charAt(0)) ? " " : " a ") + data[0];
		if(data.length == 1)
			return data[0];
		return data[plural ? 1 : 0];
	}
	
	public String getType() {
		return type;
	}

	public void setPlural(boolean plural) {
		this.plural = plural;
	}
	
	public boolean isPlural() {
		return plural;
	}
}
