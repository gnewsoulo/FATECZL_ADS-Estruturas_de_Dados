
public class Main {
	public static void main (String[] args) {
		WaitingQueue wq = new WaitingQueue();
		
		wq.addPerson("Alice");
		wq.addPerson("Bob");
		wq.addPerson("Claire");
		wq.addPerson("Daniel");
		wq.addPerson("Ethan");
		wq.addPerson("Felicia");
		
		System.out.println(wq.size());
		System.out.println("");
		wq.printQueue();
		System.out.println("");
		wq.checkHead();
		wq.checkTail();

	}
}
