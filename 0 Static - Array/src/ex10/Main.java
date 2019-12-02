package ex10;

import java.util.Arrays;
import java.util.Scanner;

/*
10. Desenvolva um algoritmo que receba 90 valores numéricos inteiros positivos num vetor, calcule e armazene, num segundo vetor, o
negativo de cada elemento do primeiro vetor. Mostre os dois vetores.
*/

public class Main {
	public static void main (String[] args) {
		
		int[] positives = new int[90];
		int[] negatives = new int[90];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < positives.length; i++) {
			System.out.println("Insert a positive integer into the array:");
			positives[i] = scanner.nextInt();
			if (positives[i] < 0) {
				positives[i] *= -1;
			}
			negatives[i] = positives[i] * -1;
		}
		
		System.out.println("Positives: " + Arrays.toString(positives));
		System.out.println("Negatives: " + Arrays.toString(negatives));
	}
}
