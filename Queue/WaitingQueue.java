
public class WaitingQueue {
	private Person head;
	private Person tail;
	private int total;
	
	public WaitingQueue() {
		head = (Person) null;
		tail = (Person) null;
		total = 0;
	}
	
	public void addPerson(String name) {
		Person newperson = new Person(name); 
		total++;
		if (total == 1) {
			head = newperson;
		}
		if (tail != null) {
			tail.setNext(newperson);						
		}
		tail = newperson;
		tail.setNext((Person) null);
	}
	
	public void addPerson(Person newperson) {
		total++;
		if (total == 1) {
			head = newperson;
		}
		if (tail != null) {
			tail.setNext(newperson);						
		}
		tail = newperson;
		tail.setNext((Person) null);
	}
	
	public int length() {
		return total;
	}
	
	public void callNext() {
		if (head == null) {
			System.out.println("The queue is empty now!");;
		}
		head = head.getNext();
		total --;
	}
	
	public void printQueue() {
		Person dummyHead = this.head;
		while (dummyHead != null) {
			System.out.println(dummyHead.getName());
			dummyHead = dummyHead.getNext();
		}
	}
	
	public void clearQueue() {
		while (head != null) {
			System.out.println(head.getName() + " has been called.\n");
			callNext();			
		}
		System.out.println("The queue is empty now!");
	}
	
	public void checkHead() {
		if (head == null) {
			System.out.println("The queue is empty now!");
		} else {
			System.out.println(head.getName() + " is next in line.");			
		}
	}
	
	public void checkTail() {
		if (tail == null) {
			System.out.println("The queue is empty now!");
		} else {
			System.out.println(tail.getName() + " is the last in line.");			
		}
	}
}
