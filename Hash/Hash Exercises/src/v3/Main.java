package v3;

/*
Refa�a a implementa��o v1 com tratamento de colis�o.
*/

public class Main {
	public static void main(String[] args) {
		Hash hash = new Hash();
		
		hash.put("Alice");
		hash.put("Beatrice");
		hash.put("Cassidy");
		hash.put("Damon");
		hash.put("Elena");
		hash.put("Grace");
		hash.put("Trisha");
		hash.put("Minna");
		hash.put("Patricia");
		hash.put("Victor");
		hash.put("�amara");
		hash.put("     Eliane");
		hash.put("98Jonas");
		hash.put("Alan");
		for (int i = 0; i < 30; i++) {
			hash.put("Gemma");			
		}
		
		hash.display();
	}
}
