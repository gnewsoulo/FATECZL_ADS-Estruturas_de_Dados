package v3;

public class Hash {
	private String[] keys;
	private final String charControl = "abcdefghijklmnopqrstuvwxyzç";
	
	public Hash() {
		keys = new String[26];
		for (int i = 0; i < keys.length; i++) {
			keys[i] = null;
		}
	}

	public void put(String name) {
		name = treatString(name);
		int index = hash(name);
		if (isFull()) {
			lengthen();
			this.put(name);
		} else {
			if (isVacant(index)) {
				keys[index] = name; 	
			} else {
				for (int i = index; i < keys.length; i++) {
					if (keys[i] == null) {
						keys[i] = name;
						break;
					}
				}
			}			
		}
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
	
	private boolean isVacant(int index) {
		if (keys[index] == null) {
				return true;
		}
		return false;
	}
	
	private boolean isFull() {
		for (int i = 0; i < keys.length; i++) {
			if (keys[i] == null) {
				return false;
			}
		}
		return true;
	}
	
	private void lengthen() {
		String[] newKeys = new String[keys.length*2];
		for (int i = 0; i < newKeys.length; i++) {
			if (i < keys.length) {
				newKeys[i] = keys[i];				
			} else {
				newKeys[i] = null;
			}
		}
		keys = newKeys;
	}
	
	public void display() {
		int index = 0;
		for (String s : keys) {
			if (s != null) {
				System.out.println(" {" + s + "}");
			}
			index++;
		}
	}
	
}
