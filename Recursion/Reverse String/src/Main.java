import java.util.Scanner;

/*
Escreva um método recursive Java que pega um String s e exibe seu inverso. Por exemplo, o inverso de “pots&pans” será “snap&stop”.
*/

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Let's reverse a string! Enter one:");
		String string = scanner.nextLine();
//		String string = "pots&pans";
		
		System.out.println(string);
		System.out.println(reverse(string));
	}
	
	public static String reverse(String string) {
		if (string.isEmpty()) {
				return string; 
		}
		return reverse(string.substring(1)) + string.charAt(0);		
	}
	
}
