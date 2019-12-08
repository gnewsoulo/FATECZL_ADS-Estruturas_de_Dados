
public class MyStack {
	private Book top;
	private int size;
	
	public MyStack() {
		top = (Book) null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public void push(Book newbook) {
		size++;
		newbook.setPrevious(top);
		newbook.setRegistry(size);
		top = newbook;
	}
	
	public void push(String title, String author,double price) {
		size++;
		Book newbook = new Book(size, title, author, price);
		newbook.setPrevious(top);
		top = newbook;
	}
	
	public void pop() {
		Book newtop = top.getPrevious();
		System.out.println(top.getTitle() + " has been popped from the stack.");
		top = newtop;
		size--;
	}
	
	public void clear() {
		while (top != null) {
			pop();		
		}
		System.out.println("The stack is empty now!");
	}
	
	public void list() {
		if (top == null) {
			System.out.println("The stack is empty now!");
		} else {
			Book current = top;
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
}
