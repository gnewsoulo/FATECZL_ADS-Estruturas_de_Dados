package ex02;

import java.security.SecureRandom;
import java.util.Arrays;

/*
2. Desenvolva um algoritmo que receba 20 valores numéricos
inteiros numa matriz A de dimensões 10x2 e 20 valores
numéricos inteiros numa matriz B de dimensões 10x2.
Construa uma matriz C com dimensões 10x2, onde cada
posição possua a soma dos elementos das matrizes A e B em
suas respectivas posições. Mostre os elementos das três
matrizes.
*/

public class Main {
	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();
				
		int[][] matrixA = new int[10][2];
		int[][] matrixB = new int[10][2];
		int[][] matrixC = new int[10][2];
		
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[0].length; j++) {
				matrixA[i][j] = random.nextInt(200);
				matrixB[i][j] = random.nextInt(200);
				matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		
		System.out.println(" Matrix A:");
		for (int i = 0; i < matrixA.length; i++) {
				System.out.println(Arrays.toString(matrixA[i]));
		}
		
		System.out.println("\n Matrix B:");
		for (int i = 0; i < matrixA.length; i++) {
			System.out.println(Arrays.toString(matrixB[i]));
		}
		
		System.out.println("\n Matrix C:");
		for (int i = 0; i < matrixA.length; i++) {
			System.out.println(Arrays.toString(matrixC[i]));
		}	
	}
} 
