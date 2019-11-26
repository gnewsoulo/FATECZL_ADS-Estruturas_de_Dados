
public class MyLinkedList {
	private Book tail;
	private int total;
	
	public MyLinkedList() {
		tail = (Book) null;
	}
	
	public void addBook(String title, String author,double price) {
		total++;
		Book newbook = new Book(total, title, author, price);
		newbook.setPrevious(tail);
		tail = newbook;
	}
	
	public void addBook(Book newbook) {
		total++;
		newbook.setPrevious(tail);
		tail = newbook;
	}
	
	public void listBooks() {
		Book current = tail;
		while (current != null) {
			System.out.println("\n Title: " + current.getTitle() + 
					"\n Author: " + current.getAuthor() +
					"\n Registry: #" + current.getRegistry() +
					"\n Price: $" + current.getPrice() +
					"\n");
			current = current.getPrevious();
		}
	}
}
