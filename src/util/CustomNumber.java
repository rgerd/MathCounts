package util;

public class CustomNumber implements Number {
	private String string;
	
	public CustomNumber(String str) {
		string = str;
	}
	
	public Number add(Number n) {
		return this;
	}

	public Number sub(Number n) {
		return this;
	}

	public Number div(Number n) {
		return this;
	}

	public Number mult(Number n) {
		return this;
	}

	public boolean equals(Number n) {
		return this.toString().equals(n.toString());
	}
	
	public String toString() {
		return string;
	}
}
