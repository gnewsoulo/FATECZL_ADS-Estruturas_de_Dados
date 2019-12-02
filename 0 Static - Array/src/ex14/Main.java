package ex14;

import java.util.Arrays;
import java.util.Scanner;

/*
14. Desenvolva um algoritmo que receba 35 valores
numéricos inteiros num vetor, calcule e armazene o
triplo dos valores divisíveis por 3 num segundo vetor,
armazenando inalterados os valores que não são
divisíveis por 3. Mostre os elementos dos dois
vetores.
*/

public class Main {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[35];
		int[] altered = new int[35];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Insert an integer o the array [" + i + "]:");
			numbers[i] = scanner.nextInt();
			if( (numbers[i] % 3) == 0 ) {
				altered[i] = numbers[i] * 3;
			} else {
				altered[i] = numbers[i];
			}
		}
		
		System.out.println("Original values: " + Arrays.toString(numbers));
		System.out.println("Altered values: " + Arrays.toString(altered));
	}
}
