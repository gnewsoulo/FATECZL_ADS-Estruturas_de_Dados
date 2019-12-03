package ex06;

import java.util.Arrays;
import java.util.Scanner;

/*
6. Desenvolva um algoritmo que receba 10 valores numéricos inteiros num vetor Num, calcule e mostre os números primos e suas
respectivas posições.
*/

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Insert an integer to array[" + i + "]:");
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Complete array: " + Arrays.toString(array));
		
		System.out.println("Showing primes in the array:");
		for (int i = 0; i < array.length; i++) {
			int denominators = 0;
			for (int j = 1; j <= array[i]; j++) {
				if ( (array[i] % j) == 0) {
					denominators ++;
				}
			}
			if (denominators == 2) {
				System.out.println("\n" + array[i] + " is prime");
			}
		}
		scanner.close();
	}
}
