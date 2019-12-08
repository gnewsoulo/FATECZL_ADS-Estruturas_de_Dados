
public class Book {
	private int registry;
	private String title;
	private String author;
	private double price;
	private Book previous;
	
	public Book(String tit, String aut, double pri) {
		title = tit;
		author = aut;
		price = pri;
	}
	
	public Book(int reg, String tit, String aut, double pri) {
		registry = reg;
		title = tit;
		author = aut;
		price = pri;
	}

	public int getRegistry() {
		return registry;
	}

	public void setRegistry(int registry) {
		this.registry = registry;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book getPrevious() {
		return previous;
	}

	public void setPrevious(Book previous) {
		this.previous = previous;
	}
}
