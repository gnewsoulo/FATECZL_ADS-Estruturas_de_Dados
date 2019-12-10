import java.util.Scanner;

/*
Use recursão para escrever um método para determinar se uma string S tem consoantes.
*/

public class Main {
	
	static String consonants = "bcdfghjklmnopqrstvwxyz";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in a string, please: ");
		String string = scanner.nextLine();
		
		System.out.println("The presence of consonants in the string '" + string + "' is " + detectConsonants(string) + "!");
	}
	
	public static boolean detectConsonants(String string) {
		if (string.length() > 0) {
			String dummy = string.charAt(0) + "";
			if (consonants.contains(dummy)) {
				return true;
			} else {
				detectConsonants(string.substring(1));
			}
		}
		return false;
	}
}
