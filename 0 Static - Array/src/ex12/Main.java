package ex12;

import java.util.Arrays;
import java.util.Scanner;

/*
12. Desenvolva um algoritmo que calcule a tabuada de um número determinado pelo usuário e
armazene, num vetor de 10 posições, o resultado da tabuada. Mostre os elementos do vetor.
*/

public class Main {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Which number's multiplication table do you want to calculate?");
		int number = scanner.nextInt();
		
		System.out.println("Insert the limit of the multiplication table:");
		int limit = scanner.nextInt();
		
		int[] multTable = new int[limit];
		
		for (int i = 1; i <= limit; i++) {
			multTable[i-1] = number * i;
			System.out.println(number + " * " + i + " = " + multTable[i-1]);
		}
		
		System.out.println("Full multiplication table for " + number + " (1 to " + limit + "):");
		System.out.println(Arrays.toString(multTable));
	}
}
