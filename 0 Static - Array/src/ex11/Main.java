package ex11;

import java.util.Arrays;
import java.util.Scanner;

/*
11. Desenvolva um algoritmo que receba 85 valores numéricos reais num vetor, calcule e
armazene, num segundo vetor, a metade de cada elemento do primeiro vetor. Mostre os dois
vetores.
*/

public class Main {
	public static void main (String[] args) {
		
		double[] numbers = new double[85];
		double[] halves = new double[85];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Insert an integer into the array:");
			numbers[i] = scanner.nextInt();
			halves[i] = numbers[i] / 2;
		}
		
		System.out.println("Numbers: " + Arrays.toString(numbers));
		System.out.println("Halved numbers: " + Arrays.toString(halves));
	}
}
