import java.util.Scanner;

/*
Escreva um m�todo recursive que determina se uma String s � um pal�ndrome, isto �, se � igual ao seu
inverso. Exemplo: arara (escrita da esquerda para a direita e da direita para a esquerda � A-R-A-R-A.
*/

public class Main {
	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a string and see if it's a palindrome:");
//		String string = scanner.nextLine();
		String string = "ARARA";
		
		if (isPalindrome(string)) {
			System.out.println(string + " is a palindrome!");
		} else {
			System.out.println(string + " is not a palindrome!");
		}
	}
	
	public static boolean isPalindrome(String string) {
		int end = string.length() -1;
		if (string.toLowerCase().charAt(0) == string.toLowerCase().charAt(end)) {
			if ((end - 0) <= 1) {
				return true;
			}
			return isPalindrome(string.substring(1, end));
		}	
		return false;
	}

}
