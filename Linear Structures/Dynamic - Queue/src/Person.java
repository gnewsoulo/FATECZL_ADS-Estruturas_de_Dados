
public class Person {
	private String name;
	private Person next;
	
	public Person (String name) {
		this.name = name;
	}
	
	public void setNext(Person next) {
		this.next = next;
	}
	
	public Person getNext() {
		return next;
	}
	
	public String getName() {
		return name;
	}
}
