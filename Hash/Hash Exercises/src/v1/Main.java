package v1;

/*
Implemente uma tabela Hash para armazenar 26 nomes em ordem alfab�tica, j� ordenada. 
A sua fun��o hash() deve garantir a classifica��o.
*/

public class Main {
	public static void main(String[] args) {
		Hash hash = new Hash();
		
		hash.put("Alice");
		hash.put("Alan");
		hash.put("Beatrice");
		hash.put("Cassidy");
		hash.put("Damon");
		hash.put("Elena");
		hash.put("Grace");
		hash.put("Trisha");
		hash.put("Minna");
		hash.put("Gemma");
		hash.put("Patricia");
		hash.put("Victor");
		hash.put("�amara");
		hash.put("     Eliane");
		hash.put("98Jonas");
		
		hash.display();
	}
}
