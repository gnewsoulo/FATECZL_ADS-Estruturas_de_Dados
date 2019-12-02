package ex04;

import java.util.Scanner;

/*
4. Desenvolva um algoritmo que receba 10 valores inteiros num vetor A e 10
valores numéricos inteiros num vetor B. Construa um vetor C com 10 posições,
onde cada posição possua a soma dos elementos dos vetores A e B em suas
respectivas posições. Mostrar os elementos dos três vetores.
*/

public class Main {
	public static void main (String[] args) {
		
		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
		int[] arrayC = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Loading array A... \n");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Load an integer into the array:");
			arrayA[i] = scanner.nextInt();
		}
		
		System.out.println("\n Loading array B... \n");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.println("Load an integer into the array:");
			arrayB[i] = scanner.nextInt();
			arrayC[i] = arrayA[i] + arrayB[i];
		}
		
		for (int i = 0; i < arrayC.length; i++) {
			System.out.println("\n Array C[" + i + "] = " + arrayC[i]);			
		}
	}
}
