package util.lang;

public class LangComponent {
	private final String type;
	private String[] data;
	private boolean plural;
	
	public LangComponent(String type, String... strs) {
		this.type = type;
		data = strs;
		plural = false;
	}
	
	public String[] getData() {
		return data;
	}
	
	public String toString() {
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
}
