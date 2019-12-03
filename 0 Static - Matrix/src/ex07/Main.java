package ex07;

import java.security.SecureRandom;
import java.util.Arrays;

/*
7. Desenvolva um algoritmo que receba 15 valores inteiros
numa matriz X de dimensões 3x5, receba 15 valores inteiros
numa matriz Y de dimensões 3x5 e concatene alternadamente
os elementos das matrizes X e Y numa terceira matriz Z de
dimensões 3x10.
Os elementos das colunas pares da matriz Z são os mesmos da
matriz X e os elementos das colunas ímpares da matriz Z são
os mesmos da matriz Y. Mostre os elementos das três matrizes.
*/

public class Main {
	public static void main(String[] args) {

		SecureRandom random = new SecureRandom();
		
		int[][] matrixX = new int[3][5];
		int[][] matrixY = new int[3][5];
		int[][] matrixZ = new int[3][10];	
		
		for (int i = 0; i < matrixX.length; i++) {
			int odds = 1;
			for (int j = 0; j < matrixX[0].length; j++) {
				matrixX[i][j] = random.nextInt(100);
				matrixY[i][j] = random.nextInt(100);
				matrixZ[i][j * 2] = matrixX[i][j];
				if ((j + odds) < 10) {
					matrixZ[i][j+odds] = matrixY[i][j];
					odds++;					
				}
			}
		}
		
		System.out.println(" Matrix X :");
		for (int i = 0; i < matrixX.length; i++) {
			System.out.println(Arrays.toString(matrixX[i]));
		}
		
		System.out.println("\n Matrix Y :");
		for (int i = 0; i < matrixY.length; i++) {
			System.out.println(Arrays.toString(matrixY[i]));
		}
		
		System.out.println("\n Matrix Z :");
		for (int i = 0; i < matrixZ.length; i++) {
			System.out.println(Arrays.toString(matrixZ[i]));
		}
	}
}
