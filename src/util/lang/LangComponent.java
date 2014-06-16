package util.lang;

public class LangComponent {
	private final String type;
	private String[] data;
	
	public LangComponent(String type, String... strs) {
		this.type = type;
		data = strs;
	}
	
	public String[] getData() {
		return data;
	}
	
	public String toString() {
		return data[0];
	}
	
	public String getType() {
		return type;
	}
}
