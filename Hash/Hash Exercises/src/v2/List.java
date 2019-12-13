package v2;

public class List {
	private String label;
	private Person head;
	private Person tail;
	private int size;
	
	public List() {
		head = (Person) null;
		tail = (Person) null;
		size = 0;
	}
	
	public void setLabel(String label) {
		this.label = label.toUpperCase();
	}

	public void add(Person person) {
		if (head == null) {
			head = person;
			tail = person;
		} else {
			tail.setNext(person);
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public void display() {
		if (head == null) {
			System.out.println(label + " {}");
		} else {
			String finalString = label + " {";
			Person dummy = head;
			while (dummy != null) {
				finalString += dummy.getName() + ", ";
				dummy = dummy.getNext();
			}		
			System.out.println(finalString.substring(0, finalString.length()-2) + "}");
		}
	}
}
