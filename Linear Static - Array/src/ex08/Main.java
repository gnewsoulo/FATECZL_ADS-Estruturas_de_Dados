package ex08;

import java.util.Arrays;
import java.util.Scanner;

/*
8. Desenvolva um algoritmo que receba 30 valores numéricos inteiros num vetor, calcule e armazene, num segundo vetor, o quadrado
dos 30 valores do primeiro vetor. Mostre os valores dos dois vetores.
*/

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[30];
		int[] squares = new int[30];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Insert an integer to num[" + i + "]:");
			numbers[i] = scanner.nextInt();
			squares[i] = (int) Math.pow(numbers[i], 2);
		}
		scanner.close();
		System.out.println("Numbers array: " + Arrays.toString(numbers));
		System.out.println("Squares array: " + Arrays.toString(squares));
	}	
}
