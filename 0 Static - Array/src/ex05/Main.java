package ex05;

import java.util.Scanner;

/*
5. Desenvolva um algoritmo que receba 50 valores reais num vetor
X e 30 valores reais num vetor Y.

Construa um vetor Z de 80 posições com a concatenação dos
vetores X e Y, ou seja, os elementos das 50 primeiras posições
são os mesmos elementos do vetor X e os elementos das 30
últimas posições são os mesmos do vetor Y. Mostre os
elementos dos três vetores.
*/

public class Main {
	public static void main(String[] args) {
		
		int[] arrayX = new int[50];
		int[] arrayY = new int[30];
		int[] arrayZ = new int[80];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < arrayZ.length; i++) {
			if (i < 30) {
				System.out.println("Insert an integer into X[" + i + "]:");
				arrayX[i] = scanner.nextInt();
				arrayZ[i] = arrayX[i];
			} else {
				System.out.println("Insert an integer into Y[" + i + "]:");
				arrayY[i - 30] = scanner.nextInt();
				arrayZ[i] = arrayY[i];
			}
		}
		
		for (int i = 0; i < arrayZ.length; i++) {
			if (i < 30) {
				System.out.println("\n X[" + i + "] = " + arrayX[i]);
				System.out.println("\n Z[" + i + "] = " + arrayZ[i]);				
			} else {
				System.out.println("\n Y[" + (i - 30) + "] = " + arrayY[i - 30]);
				System.out.println("\n Z[" + i + "] = " + arrayZ[i]);			
			}
		}
	}
}
