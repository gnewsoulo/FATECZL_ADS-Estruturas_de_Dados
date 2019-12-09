import java.util.Scanner;

/*
Escreva um método recursive que determina se uma String s é um palíndrome, isto é, se é igual ao seu
inverso. Exemplo: arara (escrita da esquerda para a direita e da direita para a esquerda é A-R-A-R-A.
*/

public class Main {
	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a string and see if it's a palindrome:");
//		String string = scanner.nextLine();
		String string = "ARARA";
		
		System.out.println("Is " + string + " a palindrome? " + isPalindrome(string) + "!");
	}
	
	public static boolean isPalindrome(String string) {
		if (string.charAt(0) == string.charAt(string.length()-1) && string.length() > 1) {
			return isPalindrome(string.substring(1, string.length() - 2));
		}
		return ( string.charAt(0) == string.charAt(string.length()-1) );
	}
}
