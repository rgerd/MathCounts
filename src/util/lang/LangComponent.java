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
		return new LangComponent(type, init_flags, new HashSet<String>(), data);
	}

	public String[] getData() {
		return data;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		if (hasFlag("place")) {
			String prep = hasFlag("from") ? "from" : data[1];
			String art = hasFlag("mentioned") ? " the " : " a ";
			if (Character.isUpperCase(data[0].charAt(0)))
				art = "";
			String noun = data[0];
			sb.append(prep).append(art).append(noun);
		} else {
			if (data.length == 1)
				sb.append(data[0]);
			else
				sb.append(data[isPlural() ? 1 : 0]);
		}
		if (hasFlag("upper"))
			sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

		return sb.toString();
	}

	public String getType() {
		return type;
	}

	public void setFlags(HashSet<String> flags) {
		this.flags.clear();
		if (init_flags != null)
			this.flags.addAll(init_flags);
		this.flags.addAll(flags);
	}

	public void addFlag(String flag) {
		flags.add(flag);
	}

	public void removeFlag(String flag) {
		flags.remove(flag);
	}

	public boolean isPlural() {
		return hasFlag("pl");
	}

	public HashSet<String> getFlags() {
		HashSet<String> _flags = new HashSet<String>();
		_flags.addAll(flags);
		_flags.addAll(init_flags);
		return _flags;
	}

	public boolean hasFlag(String flag) {
		if (flags != null && flags.contains(flag))
			return true;
		if (init_flags != null && init_flags.contains(flag))
			return true;
		return false;
	}

	public static LangComponent createNumberComponent(Number num) {
		return new LangComponent("number", null, null, num.toString());
	}
}
