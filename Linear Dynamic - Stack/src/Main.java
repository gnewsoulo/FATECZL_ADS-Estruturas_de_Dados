
public class Main {
	public static void main(String[] args) {
		MyStack bookStack = new MyStack();
		
		
		
		bookStack.push("The Bell Jar", "Sylvia Plath", 999.99);
		bookStack.push("The Name Of The Wind", "Patrick Rothfuss", 20.53);
//		System.out.println(bookStack.size());
		bookStack.push("Necronomicon", "Great Old Ones", 00.00);
		bookStack.push("Data Structures For Dummies", "Eliane Santiago", 52.47);
		Book loiseau = new Book("L'Oiseau Bleu", "Maurice Maeterlinck", 32.69);
		bookStack.push(loiseau);
		
//		System.out.println(bookStack.size());
//		bookStack.pop();
		
//		bookStack.list();
//		bookStack.clear();
//		bookStack.list();
		
		
	}
}
