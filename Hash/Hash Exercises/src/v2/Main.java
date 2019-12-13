package v2;

/*
Altere sua tabela de espalhamento de modo a garantir uma lista encadeada de nomes, 
sendo cada lista encadeada indexada de acordo com a inicial.
*/

public class Main {
	public static void main(String[] args) {
		Hash hash = new Hash();
		Person alice = new Person("Alice");
		hash.put(alice);
		Person alan = new Person("Alan");
		hash.put(alan);
		Person beatrice = new Person("Beatrice");
		hash.put(beatrice);
		Person cassidy = new Person("Cassidy");
		hash.put(cassidy);
		Person damon = new Person("Damon");
		hash.put(damon);
		Person elena = new Person("Elena");
		hash.put(elena);
		Person grace = new Person("Grace");
		hash.put(grace);
		Person trisha = new Person("Trisha");
		hash.put(trisha);
		Person minna = new Person("Minna");
		hash.put(minna);
		Person gemma = new Person("Gemma");
		hash.put(gemma);
		Person patricia = new Person("Patricia");
		hash.put(patricia);
		Person victor = new Person("Victor");
		hash.put(victor);
		Person camara = new Person("Çamara");
		hash.put(camara);
		Person eliane = new Person("     Eliane");
		hash.put(eliane);
		Person jonas = new Person("98Jonas");
		hash.put(jonas);
		
		hash.display();
	}
}
