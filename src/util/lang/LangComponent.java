package util.lang;

import java.util.HashSet;

import util.Number;

public class LangComponent {
	private final String type;
	private String[] data;
	private HashSet<String> flags;
	private HashSet<String> init_flags;
	
	public LangComponent(String type, HashSet<String> init_flags, HashSet<String> flags, String... strs) {
		this.type = type;
		data = strs;
		this.init_flags = init_flags;
		this.flags = flags;
	}
	
	public LangComponent clone() {
		return new LangComponent(type, init_flags, flags, data);
	}
	
	public String[] getData() {
		return data;
	}
	
	public String toString() {
		if(hasFlag("place"))
			return data[1] + (Character.isUpperCase(data[0].charAt(0)) ? " " : " a ") + data[0];
		if(data.length == 1)
			return data[0];
		return data[isPlural() ? 1 : 0];
	}
	
	public String getType() {
		return type;
	}

	public void setFlags(HashSet<String> flags) {
		this.flags.clear();
		this.flags.addAll(flags);
	}
	
	public boolean isPlural() {
		return hasFlag("pl");
	}
	
	public HashSet<String> getFlags() {
		return flags;
	}
	
	public boolean hasFlag(String flag) {
		if(flags != null && flags.contains(flag))
			return true;
		if(init_flags != null && init_flags.contains(flag))
			return true;
		return false;
	}
	
	public static LangComponent createNumberComponent(Number num) {
		return new LangComponent("number", null, null, num.toString());
	}
}
