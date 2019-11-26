
public class Main {
	public static void main(String[] args) {
		MyLinkedList mll = new MyLinkedList();
		
		mll.addBook("The Bell Jar", "Sylvia Plath", 999.99);
		mll.addBook("The Name Of The Wind", "Patrick Rothfuss", 20.53);
		mll.addBook("Necronomicon", "Great Old Ones", 00.00);
		mll.addBook("Data Structures For Dummies", "Eliane Santiago", 52.47);
		mll.addBook("L'Oiseau Bleu", "Maurice Maeterlinck", 32.69);
		
		mll.listBooks();
	}
}
