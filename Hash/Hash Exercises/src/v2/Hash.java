package v2;

public class Hash {
	private final List[] keys = new List[26]; 
	private final String charControl = "abcdefghijklmnopqrstuvwxyzç";
	
	public Hash() {
		for (int i = 0; i < keys.length; i++) {
			keys[i] = new List();
			String label = "" + charControl.charAt(i);
			keys[i].setLabel(label);
		}
	}
	
	private int hash(Person person) {
		int index = 0;
		String name = person.getName();
		char initial = name.toLowerCase().charAt(index);
		while(charControl.indexOf(initial) == -1) {
			index++;
			initial = name.toLowerCase().charAt(index);
		}
		person.setName(name.substring(index));
		if (initial == 'ç') {
			initial = 'c';
		}
		return (Math.abs((int)'a' - (int) initial));
	}
	
	public void put(Person person) {
		int key = hash(person);
		keys[key].add(person);
	}
	
	public void display() {
		for (List l : keys) {
			l.display();
		}
	}
}
