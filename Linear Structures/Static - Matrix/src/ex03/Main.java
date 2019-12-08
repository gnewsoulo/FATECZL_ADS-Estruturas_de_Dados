package ex03;

import java.security.SecureRandom;
import java.util.Arrays;

/*
3. Desenvolva um algoritmo que receba 50 valores numéricos reais numa matriz X de
dimensões 5x10 e 30 valores numéricos reais numa matriz Y de dimensões 3x10.
Construa uma matriz Z de dimensões 8x10 com a concatenação das matrizes X e Y, ou
seja, os elementos das 5 primeiras linhas são os mesmos elementos da matriz X e os
elementos das três últimas linhas são os mesmos da matriz Y. Mostre os elementos das
três matrizes.
*/

public class Main {
	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();
		
		int[][] matrixX = new int[5][10];
		int[][] matrixY = new int[3][10];
		int[][] matrixZ = new int[8][10];
		
		for (int i = 0; i < matrixX.length; i++) {
			for (int j = 0; j < matrixX[0].length; j++) {
				matrixX[i][j] = random.nextInt(200);
				matrixZ[i][j] = matrixX[i][j];
			}
		}
		
		for (int i = 0; i < matrixY.length; i++) {
			for (int j = 0; j < matrixY[0].length; j++) {
				matrixY[i][j] = random.nextInt(200);
				matrixZ[i+matrixX.length][j] = matrixY[i][j];
			}
		}
		
		System.out.println(" Matrix X:");
		for (int i = 0; i < matrixX.length; i++) {
				System.out.println(Arrays.toString(matrixX[i]));
		}
		
		System.out.println("\n Matrix Y:");
		for (int i = 0; i < matrixY.length; i++) {
				System.out.println(Arrays.toString(matrixY[i]));
		}
		
		System.out.println("\n Matrix Z:");
		for (int i = 0; i < matrixZ.length; i++) {
				System.out.println(Arrays.toString(matrixZ[i]));
		}
	}
}
