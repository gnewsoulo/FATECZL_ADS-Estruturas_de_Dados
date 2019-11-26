
public class Main {
	public static void main (String[] args) {
		WaitingQueue wq = new WaitingQueue();
		
		wq.addPerson("Alice");
		wq.addPerson("Bob");
		wq.addPerson("Claire");
		wq.addPerson("Daniel");
		wq.addPerson("Ethan");
		wq.addPerson("Felicia");
		
		wq.printQueue();
		System.out.println(wq.length());	
		wq.checkHead();
		wq.checkTail();
		System.out.println("\n");
		
		wq.callNext();
		Person Gerard = new Person("Gerard");
		wq.addPerson(Gerard);
		wq.printQueue();
		System.out.println(wq.length());
		wq.checkHead();
		wq.checkTail();
		System.out.println("\n");
		
		wq.clearQueue();
	}
}
