
public class Person {
	private String name;
	private Person next;
	
	public Person (String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNext(Person next) {
		this.next = next;
	}
	
	public Person getNext() {
		return next;
	}
}
