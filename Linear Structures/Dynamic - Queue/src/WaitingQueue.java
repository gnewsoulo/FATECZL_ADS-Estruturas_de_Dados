
public class WaitingQueue {
	private Person head;
	private Person tail;
	private int size;
	
	public WaitingQueue() {
		head = (Person) null;
		tail = (Person) null;
		size = 0;
	}
	
	public void addPerson(Person newperson) {
		size++;
		if (size == 1) {
			head = newperson;
		}
		if (tail != null) {
			tail.setNext(newperson);						
		}
		tail = newperson;
		tail.setNext((Person) null);
	}
	
	public void addPerson(String name) {
		Person newperson = new Person(name); 
		size++;
		if (size == 1) {
			head = newperson;
		}
		if (tail != null) {
			tail.setNext(newperson);						
		}
		tail = newperson;
		tail.setNext((Person) null);
	}
	
	public int size() {
		return size;
	}
	
	public void remove() {
		if (head == null) {
			System.out.println("The queue is empty now!");
		}
		head = head.getNext();			
	}
	
	public void clearQueue() {
		while (head != null) {
			System.out.println(head.getName() + " has been called.\n");
			remove();			
		}
		System.out.println("The queue is empty now!");
	}
	
	public void checkHead() {
		System.out.println("Head of queue: " + head.getName());
	}
	
	public void checkTail() {
		System.out.println("Tail of queue: " + tail.getName());		
	}
	
	public void printQueue() {
		Person dummy = head;
		for (int i = 0; i < size; i++) {
			System.out.println(dummy.getName());
			dummy = dummy.getNext();
		}
	}
}
