package ex09;

import java.util.Arrays;
import java.util.Scanner;

/*
9. Desenvolva um algoritmo que receba 45 valores numéricos inteiros num vetor, calcule e armazene, num segundo vetor, o fatorial de
cada elemento do primeiro vetor. Mostre os dois vetores.
*/

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[30];
		int[] squares = new int[30];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Insert an integer to num[" + i + "]:");
			numbers[i] = scanner.nextInt();
			squares[i] = factorial(numbers[i]);
		}
		scanner.close();
		System.out.println("Numbers array: " + Arrays.toString(numbers));
		System.out.println("Squares array: " + Arrays.toString(squares));	
	}
	
	public static int factorial(int n) {
		return (n == 1)  ? 1 : (n * factorial(n-1));  
	}
}
