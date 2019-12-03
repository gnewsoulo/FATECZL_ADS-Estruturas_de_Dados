package ex02;

import java.util.Scanner;

/*
2. Desenvolva um algoritmo que receba 100 valores
numéricos inteiros e mostre a soma desses 100
números.
*/

public class Main {
	public static void main(String[] args) {
		
		int[] my_array = new int[100];
		int total = 0;
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < my_array.length; i++) {
			try {
				System.out.println("Insert an integer: ");
				my_array[i] = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("I said an integer, dammit!");
			} finally {
				total += my_array[i];
			}
		}
		scanner.close();
		System.out.println("Sum of the 100 values in my_array: " + total);
	}
}
