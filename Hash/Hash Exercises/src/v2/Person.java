package v2;

public class Person {
	
	private String name;
	private Person next = (Person) null;
	
	public Person() {
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void setNext(Person next) {
		this.next = next;
	}
	
	public Person getNext() {
		return this.next;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
