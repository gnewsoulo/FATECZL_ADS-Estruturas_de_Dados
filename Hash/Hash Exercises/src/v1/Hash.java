package v1;

public class Hash {
	private final String[] keys = new String[26];
	private final String charControl = "abcdefghijklmnopqrstuvwxyzç";
	
	public Hash() {
	}

	public void put(String name) {
		name = treatString(name);
		int index = hash(name);
		keys[index] = name; 
	}
	
	private int hash(String name) {
		char initial = name.toLowerCase().charAt(0);
		if (initial == 'ç') {
			initial = 'c';
		}
		return (Math.abs((int)'a' - (int) initial));
	}
	
	private String treatString(String name) {
		int index = 0;
		while(charControl.indexOf(name.charAt(index)) == -1) {
			index++;
		}
		return name.substring(index-1);
	}
	
	public void display() {
		int index = 0;
		for (String s : keys) {
			if (s != null) {
				String label = ("" + charControl.charAt(index)).toUpperCase();
				System.out.println(label + " {" + s + "}");
			}
			index++;
		}
	}
}
