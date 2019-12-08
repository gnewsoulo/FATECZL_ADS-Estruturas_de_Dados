import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose an integer number and receive its factorial:");
		int n = scanner.nextInt();
		scanner.close();
		System.out.println(fac(n));
	}
	
	public static int fac(int n){
	    return n == 1 ? n : n * fac(n-1);
	}
}
